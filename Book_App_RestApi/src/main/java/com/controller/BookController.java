package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.BookEntity;
import com.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	 private BookService bservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Book application";
	}
	
	
	//getAllCourse
	@GetMapping("/getBook")
	public List<BookEntity> getAllBooks(){
		
		
		return this.bservice.getAllBooks();
		
	}
	
	
	@GetMapping("/getBook/{bid}")
	public BookEntity getBook(@PathVariable Integer bid) {
		
		return this.bservice.getBook(bid);
		}
	
	@PostMapping("/getBook")
	public BookEntity saveBook(@RequestBody BookEntity bentitys) {
		
		return this.bservice.saveBook(bentitys);
		
	}
	
	@PutMapping("/getBook/{bid}")
	public ResponseEntity<String> updateBook(@PathVariable Integer bid, @RequestBody BookEntity updatedBook)
	{
		return this.bservice.updateBook(bid ,updatedBook);
		
	}
	
	@DeleteMapping("/getBook/{bid}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bid)
	{
		return this.bservice.deleteBook(bid);
	}
	
}
