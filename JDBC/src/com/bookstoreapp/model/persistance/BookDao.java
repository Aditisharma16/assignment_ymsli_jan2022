package com.bookstoreapp.model.persistance;

import java.util.List;

import com.bookstoreapp.model.exceptions.DataAccessException;

public interface BookDao {
		public List<Book> getAllBooks() throws DataAccessException;;
		public Book getBookById(int bookId);
		public void addBook(Book book);
		public void updateBook(Book book);
		public void removeBook(int bookId);

}
