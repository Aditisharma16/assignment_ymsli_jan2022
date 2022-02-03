package com.q2.customer.model.exceptions;

public class CustomerNotFoundexception extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomerNotFoundexception(String message) {
		super(message);
	}

}
