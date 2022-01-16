package com.Day2Q3;

public class Account {

	private int MaxWithdrawLimit;
	private String accountNumber;
	public double accountBalance;
	private String memberName;

	public Account(String memberName, double accountBalance) {

		this.memberName = memberName;

		this.accountBalance = accountBalance;
		String num = 10000 + (int) (Math.random() * 89999) + "";
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

	public void deposit(double depositMoney) {
		 this.accountBalance += depositMoney;
	}


	public void display() {
		System.out.println("Balance: " + this.getAccountBalance());
	}

	public void withdraw(double amountWithdraw) {
	}
	
	
}
