package com.sneha.assignment;

public class Product
{
	String product_name;
	int product_price;
	int product_quantity;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String product_name, int product_price, int product_quantity) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_quantity = product_quantity;
	}
		public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	@Override
	public String toString() {
		return "Products [product_name=" + product_name + ", product_price=" + product_price + ", product_quantity="
				+ product_quantity + "]";
	}
	
	
}


