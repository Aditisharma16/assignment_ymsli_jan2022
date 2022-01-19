package com.Q2;

public class SavingAccount extends Account {
	private float interestRate = 7;

	public SavingAccount() {

	}

	public SavingAccount(float balance, String number, Owner owner) {
		super(balance, number, owner);
	}

	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public void print() {
		System.out.println("Owner :" + getOwner());
		System.out.println("Balance :" + getBalance());
		System.out.println("Number :" + getNumber());
		System.out.println("Interest rate :" + getInterestRate());
	}

	@Override
	public void withdraw(float amount) {
		float balance = getBalance() - amount;
		if (balance > 1000) {
			setBalance(balance);
			System.out.println("Withdraw done");

		} else {
			System.out.println("Not enough balance");
		}
	}

	public float getInterest() {
		return interestRate * this.getBalance();
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance() + amount);
	}
}
