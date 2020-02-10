package com.Jeyaram.classtest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

//Functionality Class
public class EcommerceOps {

	Scanner sc = new Scanner(System.in);

	HashMap<Ecommerce, HashMap<String, Integer>> bou = new HashMap<Ecommerce, HashMap<String, Integer>>();

	public void createEmployee() {

		String name;
		String phnno;
		String mail;

		System.out.println("Enter the user name:");
		name = sc.nextLine();
		System.out.println("Enter the user Contact no:");
		phnno = sc.nextLine();
		System.out.println("Enter the user Mail-id:");
		mail = sc.nextLine();

		Ecommerce e = new Ecommerce(name, phnno, mail);
		bou.put(e, e.l);

	}

	public void purchaseProduct() throws NullPointerException {

		String name;
		String product;
		int quantity;

		System.out.println("Your name");
		name = sc.nextLine();

		for (Ecommerce e : bou.keySet()) {
			if (name.equalsIgnoreCase(e.getName())) {
				System.out.println("Welcome " + e.getName());

				System.out.println(
						"What do you want to buy?\nLaptops Tablet and Mobile Electronics from Amazon\nTradition Spritual and Scifi books from Snapdeal\nRice Pulses and Oil from Flipkart\n");
				product = sc.nextLine();
				System.out.println("Enter the quantity");
				quantity = Integer.parseInt(sc.nextLine());

				e.l.put(product, quantity);
				bou.put(e, e.l);
				display(e.getName());
				billing(e.l);
				break;
			} else {
				System.out.println("Check your username or Create a new user");
			}
		}

	}

	public void returnProduct(String name) throws NullPointerException {
		String ret;
		for (Ecommerce e : bou.keySet()) {
			if (name.equalsIgnoreCase(e.getName())) {
				System.out.println("Enter the item you want to return:");
				ret = sc.nextLine();
				if (e.l.containsKey(ret)) {
					e.l.remove(ret);
					System.out.println("The item is removed from the cart");
					display(e.getName());
					billing(e.l);
				} else {
					System.out.println("You didn't purchase this item");
				}
			}
		}

	}

	public void billing(HashMap<String, Integer> order) throws NullPointerException {

		double price = 0;
		Hashtable<String, Integer> ipri = new Hashtable<String, Integer>();
		ipri.put("Laptop", 20000);
		ipri.put("Tablet", 10000);
		ipri.put("Mobile", 5000);
		ipri.put("Tradition", 1000);
		ipri.put("Spritual", 500);
		ipri.put("Scifi", 250);
		ipri.put("Rice", 400);
		ipri.put("Pulses", 200);
		ipri.put("Oil", 125);

		for (String item : order.keySet()) {
			// System.out.println(item);
			price = price + (((int) order.get(item)) * ((int) ipri.get(item)));
		}

		System.out.println("The amount to be paid is " + price);

	}

	public void reports(Hashtable<String, Integer> ipri, Hashtable<String, Integer> iquan) {
		int count = 0;
		for (Ecommerce name : bou.keySet()) {
			count++;
		}
		System.out.println("The number of users in the system are " + count);
	}

	public void display(String name) {
		for (Ecommerce e : bou.keySet()) {
			if (name.equalsIgnoreCase(e.getName())) {
				System.out.println("Your cart contains " + bou.get(e));
			}
		}
	}

}
