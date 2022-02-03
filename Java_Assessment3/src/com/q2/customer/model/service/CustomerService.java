package com.q2.customer.model.service;

import java.util.List;

import com.q2.customer.model.exceptions.CustomerNotFoundexception;
import com.q2.customer.model.exceptions.DataAccessException;

import com.q2.customer.model.persistance.Customer;

public interface CustomerService {


	public Customer getCustomerById(int customerId) throws DataAccessException, CustomerNotFoundexception;

	public void addCustomer(Customer customer) throws DataAccessException;

}
