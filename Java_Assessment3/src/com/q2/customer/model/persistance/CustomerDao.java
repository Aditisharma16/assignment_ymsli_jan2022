package com.q2.customer.model.persistance;

import java.util.List;

import com.q2.customer.model.exceptions.CustomerNotFoundexception;
import com.q2.customer.model.exceptions.DataAccessException;

public interface CustomerDao {

	public Customer getCustomerById(int customerId)throws DataAccessException, CustomerNotFoundexception;
	public void addCustomer(Customer customer) throws DataAccessException;
	
}
