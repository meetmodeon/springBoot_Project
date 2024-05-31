package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;

@Component
public class BookService {
	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(12,"java complete Reference ","xyz"));
		list.add(new Book(13,"Head first to java ","ABC"));
		list.add(new Book(17,"Thing in java ","LMN"));
		
	}
	
	//get all books
	public List<Book> getAllBooks(){
		return list;
	}
	//get single book by id
	public Book getBookById(int id) {
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	//adding the book
	public Book addBook(Book b) {
		
		list.add(b);
		return b;
	}
	public void deleteBook(int bookId) {
//		list.stream().filter(book->{
//			if(book.getId()!=bookId) {
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		list=list.stream().filter(book->book.getId()!=bookId).collect(Collectors.toList()); 
		
	}
	//Update the book
	public void updateBook(Book book, int bookId) {
		list=list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		
	}
	
	

}
