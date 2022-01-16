package com.Day2Q2;
import java.util.Scanner;


public class BookApp {
	
		public static void main(String args[]) {
			String isbn, title;
			int copies;

			System.out.println("------MENU-----");
			System.out.println("1. to Display all the books");
			System.out.println("2. to Order a book");
			System.out.println("3. to Sell a book ");

			Book[] books = new Book[10];
			books[0] = new Book("Head First With Java", "Kathy", "87644", 5);
			books[1] = new Book("Networking", "Sudarshan", "45667", 1);
			books[2] = new Book("HTML", "Bijling", "787844", 2);
			books[3] = new Book("Hello Programming", "James", "74783", 4);

			BookStore bookStore = new BookStore(books);
			Scanner sc = new Scanner(System.in);
			int c = 1;
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				bookStore.display();
				break;
			case 2:
				while (c == 1) {
					System.out.println("Enter ISBN: ");
					isbn = sc.nextLine();
					System.out.println("Enter number of Copies: ");
					copies = sc.nextInt();
					bookStore.order(isbn, copies);
					System.out.println("Want to order again ? (1/0)");
					c = sc.nextInt();
				}
				break;
			case 3:
				System.out.println("Enter Title: ");
				title = sc.nextLine();
				System.out.println("Enter number of Copies: ");
				copies = sc.nextInt();
				bookStore.sell(title, copies);
				break;
			case 0:
				System.exit(0);
				break;
			}
			sc.close();
		}

	}


