package com.Biswajit.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;




public class EcommerceDemo {

	static Ecommerce product;
	static Scanner sc=  new Scanner(System.in);
	static int choice;
	public static void main(String[] args) {

		
		/*Execute the program with 3 fixed eCommerce service providers & threir products.
		Ex: Amazon(Electronics: Laptop 20k 10q, Tablet 10k 20q, Mobile 5k 40q), 
			FlipKart (Books: Traditions 1000 50q, Spiritual 500 100q, SciFi 250 200q), 
			SnapDeal (Groceries: Rice 400 50q, Pulses 200 200q, Oils 125 500q)
			*/
		HashMap<String, Ecommerce> hm = new HashMap<String, Ecommerce>();
	    product = new Ecommerce("Amazon", "laptop", 20000, 10);
		hm.put("Laptop", product);
		product = new Ecommerce("Amazon", "tablet", 10000, 20);
		hm.put("Tablet", product);
		product = new Ecommerce("Amazon", "mobile", 5000, 40);
		hm.put("Mobile", product);
		product = new Ecommerce("Flipkart", "traditions", 1000, 50);
		hm.put("Traditions", product);
		product = new Ecommerce("Flipkart", "spiritual", 10000, 20);
		hm.put("Spiritual", product);
		product = new Ecommerce("Flipkart", "sciFi", 10000, 20);
		hm.put("SciFi", product);
		product = new Ecommerce("SnapDeal", "rice", 400, 50);
		hm.put("Rice", product);
		product = new Ecommerce("SnapDeal", "pulses", 200, 200);
		hm.put("Pulses", product);
		product = new Ecommerce("SnapDeal", "oils", 125, 500);
		hm.put("Oils", product);
		
		java.util.Iterator<Entry<String, Ecommerce>> hmIterator = hm.entrySet().iterator(); 
		  
       
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            System.out.println(mapElement.getValue() ); 
        } 
       EcommerceOps ops = new  EcommerceOps();
       HashMap<String , EcommerceUser> hmUser = new HashMap<>();
		
		for(;;) {
			System.out.println("Choose 1/2/3/4 for Creation of User /Purchase Product/ Return Product/Reports");
			choice=Integer.parseInt(ops.process(sc));
			switch(choice)
			{
			 case 1: ops.create(hmUser);
			         break;
			 case 2: ops.purchase(hm, hmUser);
			         break;
			 case 3: ops.returnItem(hm, hmUser);
			         break;
			 case 4: ops.report(hm,hmUser);
			         break;
			 default: System.out.println("Wrong Input, try gain!!");  
			          break;
			}
			  
		}
		
	}

}
