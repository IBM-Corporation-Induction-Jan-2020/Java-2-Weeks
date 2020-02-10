package com.Biswajit.test;

public class Ecommerce {
    String vendor;
	String itemName;
	int price;
	int quantity;

	public Ecommerce(String vendor, String itemName, int price, int quantity) {
		super();
		this.vendor = vendor;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Ecommerce() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ecommerce [vendor=" + vendor + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
