package com.Q2;

public class CurrentAccount extends Account {

	private float minimumBalance = 500;

	public CurrentAccount() {

	}

	public CurrentAccount(float balance, String number, Owner owner) {
		super(balance, number, owner);
	}

	public float getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public void print() {
		System.out.println("Owner :" + getOwner());
		System.out.println("Balance :" + getBalance());
		System.out.println("Number :" + getNumber());
		System.out.println("Minimum Balance :" + getMinimumBalance());
	}

	@Override
	public void withdraw(float amount) {
		float balance = getBalance() - amount;
		if (balance > minimumBalance) {
			setBalance(balance);
			System.out.println("Withdraw done");

		} else {
			System.out.println("Not enough balance");
		}
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance() + amount);
	}

	public float getCharges() {
		return (float) (minimumBalance * 0.01);
	}
}
