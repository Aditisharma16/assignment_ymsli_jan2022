package com.Day2Q3;

public class CurrentAccount extends Account {
	
	private int tradeLicenseNumber;

	CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		
	}

	public double getBalance() {
		return super.getAccountBalance();
	}

	public void withdraw(double amountWithdraw) {
		if (amountWithdraw < this.getAccountBalance()) {
			this.accountBalance -= amountWithdraw;

		} else {
			System.out.println("Withdraw not possible");

		}

	}
	

	public void display() {
		System.out.println("Balance: " + this.getAccountBalance());
	}



}
