package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int bookId;
	private boolean available;
	private int memberId;
	private String name;
	private String Author;
	private int noOfBooksAvailable;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getNoOfBooksAvailable() {
		return noOfBooksAvailable;
	}
	public void setNoOfBooksAvailable(int noOfBooksAvailable) {
		this.noOfBooksAvailable = noOfBooksAvailable;
	}
	
}
