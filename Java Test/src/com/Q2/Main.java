package com.Q2;

public class Main {

	public static void main(String[] args) {
		Date date1 = new Date(19, 01, 2022);
		System.out.println("Date1 is :" + date1.toString());

		Owner o1 = new Owner("Aditi", date1, "34633645");

		Account a1 = new SavingAccount(2000, "365426", o1);
		System.out.println("Account is :" + a1.toString());

		System.out.println("account1: " + a1.getBalance());
		a1.deposit(400);
		System.out.println("After deposit account1 balance is " + a1.getBalance());

		a1.withdraw(500);
		System.out.println("After withdraw account1 balance is " + a1.getBalance());

	}

}
