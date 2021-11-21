package com.codesample.project.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menuadds")
public class Menuadds {
	
	@Id
	private int catenum;
	private String menuaddid;
	private String addsname;
	private int inventory;
	private int cost;
	
	public Menuadds() {}
	
	public Menuadds(int catenum, String menuaddid, String addsname, int inventory,int cost) {
		this.catenum = catenum;
		this.menuaddid = menuaddid;
		this.addsname = addsname;
		this.inventory = inventory;
		this.cost = cost;
	}

	public int getCatenum() {
		return catenum;
	}

	public void setCatenum(int catenum) {
		this.catenum = catenum;
	}

	public String getMenuaddid() {
		return menuaddid;
	}

	public void setMenuaddid(String menuaddid) {
		this.menuaddid = menuaddid;
	}

	public String getAddsname() {
		return addsname;
	}

	public void setAddsname(String addsname) {
		this.addsname = addsname;
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
