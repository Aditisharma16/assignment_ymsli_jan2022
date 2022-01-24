package com.day6Q3;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByTitleAuthor implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int value = (b1.getTitle().toLowerCase()).compareTo(b2.getTitle().toLowerCase());
		if (value == 0) {
			value = (b1.getAuthor().toLowerCase()).compareTo(b2.getAuthor().toLowerCase());
		}
		return value;
	}

}

public class BookCollection {

	private String ownerName;
	private List<Book> books = new ArrayList<>();

	public BookCollection(String ownerName, List<Book> book) {
		super();
		this.ownerName = ownerName;
		this.books = book;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<Book> getBook() {
		return books;
	}

	public void setBook(List<Book> book) {
		this.books = book;
	}

	@Override
	public String toString() {
		return "BookCollection [ownerName=" + ownerName + ", book=" + books + "]";
	}

	public void hasBook(Book b) {
		int flag = 0;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(b.getTitle()) && book.getAuthor().equalsIgnoreCase(b.getAuthor())) {
				System.out.println("Book " + b.getTitle() + " is present in Books Collection");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Book " + b.getTitle() + " is not present in Books Collection");

		}
	}

	public void sort() {
		Collections.sort(books, new SortByTitleAuthor());
		System.out.println("Books sorted by title and author  : ");
		for (Book b : books) {
			System.out.println(b);
		}

	}
}
