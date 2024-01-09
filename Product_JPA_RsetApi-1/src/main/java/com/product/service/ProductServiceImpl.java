package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.ProductEntity;
import com.product.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{
	
	

	
	
	@Autowired
	public ProductServiceImpl(ProductRepository prepo) {
		this.prepo = prepo;
	}


	private ProductRepository prepo;
	

	@Override
	public ProductEntity create(ProductEntity pen) {
		
		return this.prepo.save(pen);
	}

	@Override
	public ProductEntity update(ProductEntity pen, Integer pid) {
		ProductEntity p1 = this.prepo.findById(pid).orElseThrow(()-> new RuntimeException("Product not Found"));
		p1.setPname(pen.getPname());
		p1.setPprice(pen.getPprice());
		p1.setPdescrip(pen.getPdescrip());
		
		ProductEntity save = this.prepo.save(p1);
		
		
		return save;
	
	}

	@Override
	public ProductEntity getOne(Integer pid) {
       
		 ProductEntity entity = prepo.findById(pid).orElseThrow(()->new RuntimeException("Product not Found"));
		return entity;
	}

	@Override
	public List<ProductEntity> getAll() {
		
		List<ProductEntity> all = this.prepo.findAll();
		return all;
	}

	@Override
	public void delete(Integer pid) {
		this.prepo.findById(pid).orElseThrow(()->new RuntimeException("Product not Found"));
		
	}

}
