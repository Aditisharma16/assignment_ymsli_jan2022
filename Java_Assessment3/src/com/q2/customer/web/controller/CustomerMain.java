package com.q2.customer.web.controller;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import com.q2.customer.model.persistance.Customer;
import com.q2.customer.model.service.CustomerService;
import com.q2.customer.model.service.CustomerServiceImpl;


public class CustomerMain {

	public static void main(String[] args) {
		
    CustomerService customerService = new CustomerServiceImpl();
		
		//Add a new customer record
		System.out.println("Adding customer ");
		customerService.addCustomer(new Customer(1,"Aditi","Delhi","8287699833",new Date(1990-01-02)));
		
		
		//Finding customer by id;
		System.out.println("Get customer by id ");
		Customer customer1=customerService.getCustomerById(1);
		System.out.println(customer1);
	}

}
