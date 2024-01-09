package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.entity.BookEntity;


@Service
public class ServiceImpl implements BookService{
	
	
	
	List<BookEntity> list;
	

	public ServiceImpl() {
    list=new ArrayList<>();		
    list.add(new BookEntity(1,"Java","Only Main Topics of Java "));
    list.add(new BookEntity(2,"Core Java","Only Basics of Java"));
		
	}


	@Override
	public List<BookEntity> getAllBooks() {
		
		return list;
	}


	@Override
	public BookEntity getBook(Integer bid) {
		BookEntity b=null;
		
		for(BookEntity bock:list) {
			if(bock.getBid()==bid) {
				b=bock;
				break;	
			}
		}
		return b;
	}


	@Override
	public BookEntity saveBook(BookEntity bentity) {
		
		list.add(bentity);
        
		return bentity;
	}


	@Override
	public ResponseEntity<String> updateBook(Integer bid,BookEntity updatedBook) {
		int indexOf = list.indexOf(new BookEntity(bid,null,null));
	    if(indexOf!=-1) {
	    	list.set(indexOf, updatedBook);
	    	return ResponseEntity.ok("Book updated successfully"+ updatedBook.toString());
	    }
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid or missing book ID for update");
	}


	@Override
	public ResponseEntity<String> deleteBook(Integer bid) {
		Iterator<BookEntity> it = list.iterator();
		
		while(it.hasNext())
		{
			BookEntity b=it.next();
			if(b.getBid()==bid)
			{
				it.remove();
				return ResponseEntity.ok("Book Id with "+ bid+ "is deleted");
			}
		}
		return ResponseEntity.ok("Book Id with "+ bid+ "is not deleted");

		
		
	}


	
	
	
   // int index = list.indexOf(new BookEntity(bid, null, null));
//BookEntity b=null;
	
	//for(BookEntity bock:list) {
	//	if(bock.getBid()==bid) {
		//	b=bock;
		//	break;	
		//}
	//}
	//return b;
	
	
	
	
	

}
