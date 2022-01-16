package com.Day2Q3;

import java.util.Scanner;


public class Bank {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Choose type of account pess 1 for saving or press 2for current acount ");
		int accType=sc.nextInt();
		System.out.println("Enter initial balance: ");
		double balance=sc.nextDouble();
		sc.nextLine();
		
		Account acc;
		
		if(accType==1)
		{
			acc=new SavingAccount(name, balance);
		}
		else
		{
			acc=new CurrentAccount(name,balance);
		}
		int choice;
		int i=0;
		do{
		System.out.println("-------- MENU --------- ");
		System.out.println("1. to Deposit Money ");
		System.out.println("2. to Withdraw Money ");
		System.out.println("3. to Display Balance ");
		System.out.println("4. to EXIT ");
		
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter amount: ");
		 		double amt=sc.nextDouble();
				acc.deposit(amt);
				acc.display();
				break;
				
		case 2: System.out.println("Enter amount: ");
 				double amount=sc.nextDouble();
 				acc.withdraw(amount);
 				acc.display();
 				break;
 				
		case 3: acc.display();
				break;
				
		case 4: System.exit(0);
				
		}
	
		System.out.println("Want to continue again ? (1/0)");
		i=sc.nextInt();
		}while(i==1);
		
		
	}

}
