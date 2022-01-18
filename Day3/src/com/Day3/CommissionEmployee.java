package com.Day3;

public class CommissionEmployee extends Employee {

	private double totSale;
	private double percentage;

	public double getTotSale() {
		return totSale;
	}

	public void setTotSale(int totSale) {
		this.totSale = totSale;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	CommissionEmployee(String name, int id, double salary, double rate, double totSale, double percentage) {
		super(name, id, salary, rate);
		this.totSale = totSale;
		this.percentage = percentage;

	}

	public double getPayment() {
		setSalary((totSale * percentage) / 100);
		return getSalary();

	}
}
