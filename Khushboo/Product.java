package com.khushboo.app.ecommerce;

public class Product {

	
	String product;
	String price;
	int quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String product, String price, int quantity) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [product=" + product + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
