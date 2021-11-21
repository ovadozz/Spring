package com.codesample.project.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drinks")
public class Drinks {
	
	@Id
	private int catenum;
	private String drinkId;
	private String drinkname;
	private int inventory;
	private int cost;
	


	public Drinks() {}
	
	public Drinks(String drinkId, int catenum, String drinkname, int inventory, int cost) {
		this.drinkId = drinkId;
		this.catenum = catenum;
		this.drinkname = drinkname;
		this.inventory = inventory;
		this.cost = cost;
	}
	
	
	public String getDrinkId() {
		return drinkId;
	}

	public void setDrinkId(String drinkId) {
		this.drinkId = drinkId;
	}

	public int getCatenum() {
		return catenum;
	}

	public void setCatenum(int catenum) {
		this.catenum = catenum;
	}

	public String getDrinkname() {
		return drinkname;
	}

	public void setDrinkname(String drinkname) {
		this.drinkname = drinkname;
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
