package com.shetty.week2;

public class Product {
	

	
	String item1;
	int price1;	
	int quant1;
	
	String item2;
	int price2;
	int quant2;
	
	@Override
	public String toString() {
		return "Product [Product=" + item1 + ", Price=" + price1 + ", Quantity present=" + quant1 + ",\n Product=" + item2
				+ ", Price=" + price2 + ", Quantity present=" + quant2 + ",\n Product=" + item3 + ", Price=" + price3 + ", Quantity present="
				+ quant3 + "]";
	}
	String item3;
	int price3;
	int quant3;

	public Product(String item1, int price1, int quant1, String item2, int price2, int quant2, String item3, int price3,
			int quant3) {
		super();
		this.item1 = item1;
		this.price1 = price1;
		this.quant1 = quant1;
		this.item2 = item2;
		this.price2 = price2;
		this.quant2 = quant2;		
		this.item3 = item3;
		this.price3 = price3;
		this.quant3 = quant3;
		
	}
	public String getItem1() {
		return item1;
	}
	public void setItem1(String item1) {
		this.item1 = item1;
	}
	public int getPrice1() {
		return price1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public int getQuant1() {
		return quant1;
	}
	public void setQuant1(int quant1) {
		this.quant1 = quant1;
	}
	public String getItem2() {
		return item2;
	}
	public void setItem2(String item2) {
		this.item2 = item2;
	}
	public int getQuant2() {
		return quant2;
	}
	public void setQuant2(int quant2) {
		this.quant2 = quant2;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public String getItem3() {
		return item3;
	}
	public void setItem3(String item3) {
		this.item3 = item3;
	}
	public int getQuant3() {
		return quant3;
	}
	public void setQuant3(int quant3) {
		this.quant3 = quant3;
	}
	public int getPrice3() {
		return price3;
	}
	public void setPrice3(int price3) {
		this.price3 = price3;
	}
	
	



	


	
	
	
	}
