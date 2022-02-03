package com.q2.customer.model.persistance;

import java.sql.*;
import java.util.List;

import com.q2.customer.model.exceptions.CustomerNotFoundexception;
import com.q2.customer.model.exceptions.DataAccessException;
import com.q2.customer.model.persistance.ConnectionFactory;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public Customer getCustomerById(int customerId) throws CustomerNotFoundexception, DataAccessException {
		Customer customer = null;
		try {
			PreparedStatement statement = connection.prepareStatement("select * from customer where id=?");
			statement.setInt(1, customerId);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				customer = new Customer(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getDate(5));
			} else {
				throw new CustomerNotFoundexception("customer with id =" + customerId + " is not found");
			}
		} catch (SQLException ex) {
			throw new DataAccessException(ex);
		}
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) throws DataAccessException {
		try {
			PreparedStatement insertData = connection
					.prepareStatement("insert into customer(" + "id,name,address,phone_no,dob) values (?,?,?,?,?)");
			insertData.setInt(1, customer.getId());
			insertData.setString(2, customer.getName());
			insertData.setString(3, customer.getAddress());
			insertData.setString(4, customer.getPhone_no());
			insertData.setDate(5, customer.getDob());
			insertData.executeUpdate();
			System.out.println("Record added !!");
		} catch (SQLException ex) {
			throw new DataAccessException(ex);
		}

	}

}
