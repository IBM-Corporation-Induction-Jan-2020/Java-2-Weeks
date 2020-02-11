package com.sushma.Assesment;

import java.util.ArrayList;

public class User {
	String name;
	String contactNumber;
	String mailId;
	
	ArrayList<ShoppingCartDetails> usercartdetailslist=new ArrayList<>();

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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public ArrayList<ShoppingCartDetails> getUsercartdetails() {
		return usercartdetailslist;
	}

		public User(String name, String contactNumber, String mailId) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		}

	@Override
	public String toString() {
		return "User [name=" + name + ", contactNumber=" + contactNumber + ", mailId=" + mailId + ", usercartdetails="
				+ usercartdetailslist + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setUsercartdetails(ShoppingCartDetails shopping) {
			usercartdetailslist.add(shopping);
	}
	
	
	
	
}
