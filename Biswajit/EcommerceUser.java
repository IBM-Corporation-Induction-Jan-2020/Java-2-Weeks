package com.Biswajit.test;

public class EcommerceUser {
	// name, contact number, mail id, shopping cart details (product, quantity,
	// price).
	String name;
	long contactNumber;
	String mailId;
	String itemName;
	int quantity;
	int price;

	public EcommerceUser(String name, long contactNumber, String mailId) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "EcommerceUser [name=" + name + ", contactNumber=" + contactNumber + ", mailId=" + mailId + ", itemName="
				+ itemName + ", quantity=" + quantity + ", price=" + price + "]";
	}

	public EcommerceUser(String name, long contactNumber, String mailId, String itemName, int quantity, int price) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
