package com.Jeyaram.classtest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//This is the bean class
public class Ecommerce {

	String name;
	String phnno;
	String mail;

	HashMap<String, Integer> l = new HashMap<String, Integer>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhnno() {
		return phnno;
	}

	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Ecommerce [name=" + name + ", phnno=" + phnno + ", mail=" + mail + "]";
	}

	public Ecommerce() {
		super();
	}

	public Ecommerce(String name, String phnno, String mail) {
		super();
		this.name = name;
		this.phnno = phnno;
		this.mail = mail;
	}

}
