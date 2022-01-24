package com.day6Q3;

public class Book {

	private String title;
	private String author;
	private int bookID;

	public Book(String title, String author, int bookID) {
		super();
		this.title = title;
		this.author = author;
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookID=" + bookID + "]";
	}

}
