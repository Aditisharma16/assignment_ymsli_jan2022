package com.q2.batchprocessing;

import java.sql.*;
import com.q2.batchprocessing.ConnectionFactory;

public class BatchProcessing {

	public static void main(String[] args) {

		Connection connection = ConnectionFactory.getConnection();

		// WITH BATCH PROCESSING
		long start = System.currentTimeMillis();

		try {
			connection.setAutoCommit(false);
			PreparedStatement pstmt = connection.prepareStatement("insert into batch(name) values(?)");
			for (long i = 1; i <= 10000; i++) {
				pstmt.setString(1, "Aditi" + i);

				pstmt.addBatch(); // adding to batch
				if (i % 200 == 0) {
					pstmt.executeBatch(); // it hit the db(but unconmmited)
				}
			}
			connection.commit();
		} catch (SQLException e) {

			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		System.out.println("time taken: " + (end - start)); // time taken : 1079ms

		// WITHOUT BATCH PROCESSING
		long start1 = System.currentTimeMillis();

		try {

			PreparedStatement pstmt = connection.prepareStatement("insert into batch(name) values(?)");
			for (long i = 1; i <= 10000; i++) {
				pstmt.setString(1, "Aditi" + i);
				pstmt.executeUpdate();

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		long end1 = System.currentTimeMillis();

		System.out.println("time taken: " + (end1 - start1)); // time taken : 285741ms

	}
}
