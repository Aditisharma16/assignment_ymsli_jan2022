package com.q2.customer.model.service;

import java.util.List;

import com.q2.customer.model.exceptions.CustomerNotFoundexception;
import com.q2.customer.model.exceptions.DataAccessException;
import com.q2.customer.model.persistance.Customer;
import com.q2.customer.model.persistance.CustomerDao;
import com.q2.customer.model.persistance.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao = null;

	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}

	@Override
	public Customer getCustomerById(int customerId) throws DataAccessException, CustomerNotFoundexception {
		Customer customer = null;
		customer = customerDao.getCustomerById(customerId);
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) throws DataAccessException {
		customerDao.addCustomer(customer);

	}

}
