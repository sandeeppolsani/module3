package com.dao;

import java.awt.print.Book;
import java.util.List;

public interface IBookAccessDao {
	
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Book book);
	public void getBookById(int id);
	public void getBookByAuthor(String name);
	public void getBookByName(String name);
	public List<Book> getAvailableBooks();
	public List<Book> getAllBooks();
	

}
