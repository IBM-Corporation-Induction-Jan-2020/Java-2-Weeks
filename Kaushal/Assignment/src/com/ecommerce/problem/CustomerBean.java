package com.ecommerce.problem;

public class CustomerBean {
	String name;
	String contactNumber;
	String Email;
	String product;
	String quantity;
	long price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CustomerBean [name=" + name + ", contactNumber=" + contactNumber + ", Email=" + Email + ", product="
				+ product + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public CustomerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerBean(String name, String contactNumber, String email, String product, String quantity, long price) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		Email = email;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
     
}
