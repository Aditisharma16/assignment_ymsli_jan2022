package com.day6Q3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> book= new ArrayList<>();
		
		Book b=new Book("Head First Java"," Kathy Sierra", 132);
		Book b1=new Book("Java in depth","Elisabeth Robson", 142);
		Book b2=new Book("The Complete Reference"," Herbert Schildt", 152);
		
		book.add(b);
		book.add(b1);
		book.add(b2);
		
		BookCollection collection = new BookCollection("Aditi",book);
		collection.toString();
		collection.sort();
		collection.hasBook(b1);
	}

}
