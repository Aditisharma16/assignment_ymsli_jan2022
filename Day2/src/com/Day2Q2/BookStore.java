package com.Day2Q2;

public class BookStore {
	
		private Book[] books;
		
		public BookStore(Book[] books) {
			this.books = books;

		}

		void sell(String bookTitle, int noOfCopies) {
			int flag = 0;
			for (int i = 0; i < 5; i++) {
				if (books[i].getBookTitle().equals(bookTitle)) {
					if (books[i].getNumOfCopies()>= noOfCopies) {
						noOfCopies = books[i].getNumOfCopies() - noOfCopies;
						books[i].setNumOfCopies(noOfCopies);
						flag = 1;
						break;
					} else {
						System.out.println("available number of copies are less");
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0)
				System.out.println("NO MATCH FOUND");
		}

		void order(String ISBN, int noOfCopies) {
			int flag = 0;
			for (int i = 0; i < books.length; i++) {
				if (ISBN.equals( books[i].getISBN())) {
					books[i].setNumOfCopies(books[i].getNumOfCopies() + noOfCopies);
					books[i].display();
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("NOT Found");
				System.out.println("Adding new Book");

			}
		}

		void display() {
			for (int i = 0; i < books.length; i++) {
				books[i].display();
			}
		}

}
