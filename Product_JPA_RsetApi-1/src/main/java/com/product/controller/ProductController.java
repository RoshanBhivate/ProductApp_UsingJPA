package com.product.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductEntity;
import com.product.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	ProductService service;
	
	//create
	@PostMapping("/add")
	public ResponseEntity<ProductEntity> create(@RequestBody ProductEntity pen)
	{
		ProductEntity create = this.service.create(pen);
		return new ResponseEntity<>(create, HttpStatus.CREATED);
	}
	
	
	//update
    @PutMapping("/update/{pid}")
    public ResponseEntity<ProductEntity> update(@RequestBody ProductEntity pen,@PathVariable Integer pid)
    {
    	ProductEntity update = this.service.update(pen, pid);
    	return new ResponseEntity <>(update,HttpStatus.OK);
    }

	
	//getOne
    @GetMapping("/{pid}")
    public ResponseEntity<ProductEntity> getOne(@PathVariable Integer pid)
    {
    	ProductEntity one = this.service.getOne(pid);
    	return new ResponseEntity<>(one,HttpStatus.OK);
    	
    }
	//getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<ProductEntity>> getAll()
    {
    	List<ProductEntity> all = this.service.getAll();
    	return new ResponseEntity<>(all,HttpStatus.OK);
    }
    
   
	//delete
    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<Map<String,String>> delete(@PathVariable Integer pid)
    {
    	this.service.delete(pid);
    	Map<String,String> message = Map.of("msg","product sucessfully deleted");
    	return new ResponseEntity<>(message, HttpStatus.OK);
    	
    	
    }
 
	
   
    
    
    
    

}

