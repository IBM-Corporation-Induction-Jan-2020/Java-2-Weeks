package com.khushboo.app.ecommerce;

public class ECommerceUser {

	String name;
	String contact;
	String eMail;
	
	
	String product;
	String price;
	int quantity;

	public ECommerceUser() {
		super();
	}

	public ECommerceUser(String name, String contact, String eMail) {
		super();
		this.name = name;
		this.contact = contact;
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "ECommerceUser [name=" + name + ", contact=" + contact + ", eMail=" + eMail + ", product=" + product
				+ ", price=" + price + ", quantity=" + quantity + "]";
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

	public ECommerceUser(String product, String price, int quantity) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public ECommerceUser(String name, String contact, String eMail, String product, String price, int quantity) {
		super();
		this.name = name;
		this.contact = contact;
		this.eMail = eMail;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	
}
