package com.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.entity.BookEntity;

public interface BookService {
	public List<BookEntity> getAllBooks();
	
	public BookEntity getBook(Integer bid);

	public BookEntity saveBook(BookEntity bentity);
	
	public ResponseEntity<String> updateBook(Integer bid,BookEntity updatedBook) ;
	
	public ResponseEntity<String> deleteBook(Integer bid);
}