package com.product.service;

import java.util.List;

import com.product.entity.ProductEntity;

public interface ProductService {
	ProductEntity create(ProductEntity pen);
	
	ProductEntity update(ProductEntity pen,Integer pid);
	
	ProductEntity getOne(Integer pid);
	
	List<ProductEntity> getAll();
	
	void delete(Integer pid);
	
	
	
	
	
	

}
