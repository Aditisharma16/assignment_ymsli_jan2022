package com.bookstoreapp.model.service;

import java.util.List;

import com.bookstoreapp.model.persistance.Book;
import com.bookstoreapp.model.persistance.BookDao;
import com.bookstoreapp.model.persistance.BookDaoImpl;
import com.bookstoreapp.model.exceptions.DataAccessException;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	public BookServiceImpl() {
		bookDao = new BookDaoImpl();
	}

	@Override
	public List<Book> getAllBooks() throws DataAccessException {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) throws DataAccessException {
		return getBookById(bookId);
	}

	@Override
	public void addBook(Book book) {

		bookDao.addBook(book);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);

	}

	@Override
	public void removeBook(int bookId) {
		bookDao.removeBook(bookId);

	}

}
