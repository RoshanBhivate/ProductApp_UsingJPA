package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pname;
	private Double pprice;
	private String pdescrip;
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductEntity(int pid, String pname, Double pprice, String pdescrip) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pdescrip = pdescrip;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPprice() {
		return pprice;
	}
	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}
	public String getPdescrip() {
		return pdescrip;
	}
	public void setPdescrip(String pdescrip) {
		this.pdescrip = pdescrip;
	}
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pdescrip=" + pdescrip + "]";
	}
	
	
	
	
	
}
