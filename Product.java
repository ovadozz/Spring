package com.codesample.project.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	
	@Id
	private int catenum;
	private String productId;
	private String prodname;
	private int inventory;
	//private String img;
	private int cost;
	
	public Product() {}
	
	public Product(String productId, int catenum, String prodname, int inventory, int cost) {
		this.productId = productId;
		this.catenum = catenum;
		this.prodname = prodname;
		this.inventory = inventory;
		this.cost = cost;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getCatenum() {
		return catenum;
	}

	public void setCatenum(int catenum) {
		this.catenum = catenum;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
