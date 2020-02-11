package com.sneha.assignment;

public class Customer {
	
	String name;
	int number;
	String email;
	//Products cart=new Products();
	public Customer(String name, int number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + ", email=" + email + "]";
	}
	

}
