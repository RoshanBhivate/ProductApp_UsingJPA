package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product12")
public class BookEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bid;
	private String btitle;
	private String bdescrip;
	public BookEntity(Integer bid, String bname, String bdescrip) {
		super();
		this.bid = bid;
		this.btitle = bname;
		this.bdescrip = bdescrip;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return btitle;
	}
	public void setBname(String bname) {
		this.btitle = bname;
	}
	public String getBdescrip() {
		return bdescrip;
	}
	public void setBdescrip(String bdescrip) {
		this.bdescrip = bdescrip;
	}
	@Override
	public String toString() {
		return "BookEntity [bid=" + bid + ", btitle=" + btitle + ", bdescrip=" + bdescrip + "]";
	}
	
	
	
	

}
