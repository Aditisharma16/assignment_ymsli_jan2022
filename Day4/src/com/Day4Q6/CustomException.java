package com.Day4Q6;

public class CustomException extends Exception {
	public CustomException(int number) {
		super("Number can't be greater than [ " + number + " ]");
	}
}
