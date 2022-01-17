package com.Day3Q1;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();

		Employee emp1 = new SalariedEmployee("Aditi", 341, 50000, 15);
		Employee emp2 = new CommissionEmployee("Peter", 1, 55000, 20, 1500000, 20);
		Employee emp3 = new HourlyEmployee("Joe", 3, 90000, 13, 40);

		Invoice inv = new Invoice("145", "Tyre", 15, 2000);

		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);

		System.out.println("Total employees: " + emp.size());
		System.out.println("Salary Of " + emp1.getName() + " is " + emp1.getPayment());
		System.out.println("Salary Of " + emp2.getName() + " is " + emp2.getPayment());
		System.out.println("Salary Of " + emp3.getName() + " is " + emp3.getPayment());
		System.out.println(inv);
		System.out.println("Total Cost: " + inv.getPayment());
	}
}
