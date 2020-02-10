package com.Biswajit.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class EcommerceOps {

	/*
	 * B. Options to be shown to the user: I. User Creation II. Purchase Product
	 * III. Return Product IV. Reports C. User Creation: name, contact number, mail
	 * id, shopping cart details (product, quantity, price). D. Purchase Product:
	 * Choose User, Choose Product, Choose Quantity, Check availability, Calculate
	 * price, Add to cart, reduce the quantity from the eCommerce. ----- E. Return
	 * Product: Choose User, Choose Product, Reason to return, refund 75% price,
	 * update shopping cart, update product quantity. F. Report about the Products,
	 * Users, Total Sale.
	 * 
	 */
	double totalSale;
	Scanner sc = new Scanner(System.in);
	Ecommerce product;
	EcommerceUser eUser;
	String itemName;
	int price, quantity;
	String name;
	String contactNumber;
	String mailId;

	public String process(Scanner sc) {
		return (sc.nextLine());
	}

	public void create(HashMap<String, EcommerceUser> hmUser) {
		System.out.println("Enter name, contact number, mail Id");
		name = process(sc);
		contactNumber = process(sc);
		mailId = process(sc);
		/*
		 * System.out.println("Enter shopping cart details: product, quantity, price");
		 * itemName = process(sc); quantity = Integer.parseInt(process(sc)); price =
		 * Integer.parseInt(process(sc));
		 */
		EcommerceUser eUser = new EcommerceUser(name, contactNumber, mailId);
		hmUser.put(contactNumber, eUser);

		System.out.println(hmUser.get(contactNumber));

	}

	public void purchase(HashMap<String, Ecommerce> hm, HashMap<String, EcommerceUser> hmUser) {

		System.out.println("To Purchase items, please submit your contact number");
		contactNumber = process(sc);
		if (hmUser.containsKey(contactNumber)) {
			eUser = hmUser.get(contactNumber);
			System.out.println("Profile found");
			System.out.println("Enter Product and quantity");
			itemName = process(sc).toLowerCase();
			quantity = Integer.parseInt(process(sc));

			if (hm.containsKey(itemName)) {
				product = hm.get(itemName);
				if (quantity < product.getQuantity()) {
					System.out.println("Product is available");
					eUser.setItemName(product.getItemName());
					eUser.setQuantity(quantity);
					eUser.setPrice(product.getPrice() * quantity);
					product.setQuantity(product.getQuantity() - quantity);
					System.out.println("Your cart contains : " + eUser.getItemName() + "\t" + eUser.getQuantity()
							+ "q\t" + eUser.getPrice() + "\t from\t" + product.getVendor());
					System.out.println("please complete payment for checkout, Thank You");
					totalSale = totalSale + (double) (product.getPrice() * quantity);
				} else {
					System.out.println("Sorry, Quantity demanded is not available");
				}
			} else {
				System.out.println("Sorry, The item you are looking for is not Present");
			}
		} else {
			System.out.println("Contact Number not registered with Company, Kindly Create user first");
		}

	}

	public void returnItem(HashMap<String, Ecommerce> hm, HashMap<String, EcommerceUser> hmUser) {

		System.out.println("To Return items, please submit your contact number");
		contactNumber = process(sc);
		if (hmUser.containsKey(contactNumber)) {
			eUser = hmUser.get(contactNumber);
			System.out.println("Profile found");
			
			itemName = eUser.getItemName().toLowerCase();
			System.out.println("The product to be returned is: "+itemName);
			if (hm.containsKey(itemName)) {
				product = hm.get(itemName);

				System.out.println("Product can be returned");

				product.setQuantity(product.getQuantity() + eUser.getQuantity());

				System.out.println("Your Return contains : " + eUser.getItemName() + "\t" + eUser.getQuantity()
						+ "q\t Price to be refunded" + (0.75 * eUser.getPrice()) + "\t from\t" + product.getVendor());
				System.out.println("please accept the refund amount, Thank You");
				totalSale = totalSale - (double) (0.75 * eUser.getPrice());
				eUser.setItemName(null);
				eUser.setQuantity(0);
				eUser.setPrice(0);
			} else {
				System.out.println("Sorry, The item you are looking for cannot be returned as it is not in the database");
			}
		} else {
			System.out.println("Contact Number not registered with Company, Kindly Create user first");
		}

	}

	public void report(HashMap<String, Ecommerce> hm, HashMap<String, EcommerceUser> hmUser) {

		System.out.println("-----Details of Items present in Database-----\n\n");
		java.util.Iterator<Entry<String, Ecommerce>> hmIterator = hm.entrySet().iterator(); 
		  
	       
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            System.out.println(mapElement.getValue() ); 
        } 
        
        System.out.println("------Details of Users in Database-------\n\n ");
        java.util.Iterator<Entry<String, EcommerceUser>> hmIterUser = hmUser.entrySet().iterator(); 
		  
	       
        while (hmIterUser.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterUser.next(); 
            System.out.println(mapElement.getValue() ); 
        } 
        System.out.println("Total Sale ="+totalSale);
        
        
        
	}
}
