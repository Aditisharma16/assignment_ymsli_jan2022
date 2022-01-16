package com.Day2Q3;

public class SavingAccount extends Account {
	
	private int interest;
	private int MaxWithdrawLimit;

	SavingAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		this.interest = 5;
		this.MaxWithdrawLimit = 10000;
	}

	public double getBalance() {
		double newBalance = (((interest / 100) * super.getAccountBalance()) + super.getAccountBalance());
		return newBalance;
	}

	public void withdraw(double amountWithdraw) {
		if (amountWithdraw < MaxWithdrawLimit && amountWithdraw < this.getAccountBalance()) {
			this.accountBalance -= amountWithdraw;
		} else {
			System.out.println("Withdraw not possible");

		}

	}
	

	public void display() {
		System.out.println("Balance: " + this.getAccountBalance());
	}


}
