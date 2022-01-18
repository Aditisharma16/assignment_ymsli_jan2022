package com.Day4Q1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q1 {

	private static byte[] readFileContent(File file) {
		byte[] ar = new byte[(int) file.length()];

		try (FileInputStream input = new FileInputStream(file)) {

			// converting file into array of bytes
			input.read(ar);
			for (byte temp : ar) {
				System.out.print(temp);
			}
			System.out.println();
			// Printing in char format
			for (byte a : ar) {
				System.out.print((char) a);
			}

		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ar;
	}

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		readFileContent(file);
	}

}
