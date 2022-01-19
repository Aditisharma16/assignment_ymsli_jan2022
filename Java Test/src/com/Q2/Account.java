package com.Q2;

public abstract class Account {
	
	private float balance;
	private String number;
	private Owner owner;
	
	public Account() {
		
	}

	public Account(float balance, String number, Owner owner) {
		
		this.balance = balance;
		this.number = number;
		this.owner = owner;
	}
	
	
public Account(Account account) {
		this.owner=account.owner;
		this.balance=account.balance;
		this.number=account.number;
	}

public void input(Account account)
{
	this.owner=account.owner;
	this.balance=account.balance;
	this.number=account.number;
}

protected Owner getOwner()
{
	return owner;
}

public float getBalance() {
	return balance;
}

protected String getNumber()
{
	return number;
}

public void setBalance(float balance) {
	this.balance=balance;
}

@Override
public String toString() {
	return "Account [balance=" + balance + ", number=" + number + ", owner=" + owner + "]";
}
	
abstract public void deposit(float amount);
abstract public void print();
abstract public void withdraw(float amount);

}
