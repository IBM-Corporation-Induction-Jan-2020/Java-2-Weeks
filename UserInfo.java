package com.shetty.week2;

import java.util.HashMap;

public class UserInfo {
	
	long number;
	String name;
	String emailid;
	HashMap<String, Integer> bprod;
	


	public UserInfo() {
		super();
	}


	public UserInfo(long number, String name, String emailid) {
		super();
		this.number = number;
		this.name = name;
		this.emailid = emailid;
	}


	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	@Override
	public String toString() {
		return "UserInfo [number=" + number + ", name=" + name + ", emailid=" + emailid + "Products"+ bprod +"]";
	}


	public UserInfo(HashMap<String, Integer> bprod) {
		super();
		this.bprod = bprod;
	}
	
	
	//need to create hash map for there features
	
	
	
}
