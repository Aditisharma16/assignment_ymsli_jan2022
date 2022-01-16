package com.Day2Q2;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	public int numOfCopies;

	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	
	public void display() {
		System.out.println(
				"Title - " + bookTitle + " Author - " + author + " ISBN - " + ISBN + " Quantity - " + numOfCopies);

	}
}




