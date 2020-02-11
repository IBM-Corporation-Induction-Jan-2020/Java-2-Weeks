package com.sushma.Assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EcommerceApplication {

	public static void main(String[] args) {
		
		EcommerceOperations eOps = new EcommerceOperations();

		int id = 0;
		
	
		HashMap<Integer, User> usermap = new HashMap<>();

		ShoppingCartDetails laptop = new ShoppingCartDetails("Laptop", 10, 20000f);
		ShoppingCartDetails tablet = new ShoppingCartDetails("Tablet", 20, 10000f);
		ShoppingCartDetails mobile = new ShoppingCartDetails("Mobile", 40, 5000f);

		ShoppingCartDetails traditions = new ShoppingCartDetails("Traditions", 50, 1000f);
		ShoppingCartDetails spiritual = new ShoppingCartDetails("Spiritual", 100, 500f);
		ShoppingCartDetails scifi = new ShoppingCartDetails("SciFi", 200, 250f);

	
		ShoppingCartDetails rice = new ShoppingCartDetails("Rice", 50, 400f);
		ShoppingCartDetails pulses = new ShoppingCartDetails("Pulses", 200, 200f);
		ShoppingCartDetails oils = new ShoppingCartDetails("Oils", 125, 500f);

		Scanner inputscan = new Scanner(System.in);

		ArrayList<ArrayList<ShoppingCartDetails>> mainlist = new ArrayList<>();
		ArrayList<ShoppingCartDetails> amazon = new ArrayList<ShoppingCartDetails>();
		
		amazon.add(laptop);
		amazon.add(tablet);
		amazon.add(mobile);
		
		ArrayList<ShoppingCartDetails> flipkart = new ArrayList<ShoppingCartDetails>();

		flipkart.add(traditions);
		flipkart.add(spiritual);
		flipkart.add(scifi);
		
		ArrayList<ShoppingCartDetails> snapdeal = new ArrayList<ShoppingCartDetails>();

		snapdeal.add(rice);
		snapdeal.add(pulses);
		snapdeal.add(oils);

		mainlist.add(amazon);
		mainlist.add(flipkart);
		mainlist.add(snapdeal);
		
	
		
		for (ArrayList<ShoppingCartDetails> shoppingCartDetails : mainlist) {

			for (ShoppingCartDetails shoppingCartDetails2 : shoppingCartDetails) {
				System.out.println(shoppingCartDetails2);
			}
			System.out.println("..............................");
		}
		
		
		
		while (true) {
			System.out.println("Options to be shown to the user:\r\n"
					+ "1. User Creation 2. Purchase Product 3. Return Product 4. Reports");

			switch (inputscan.nextInt()) {
			case 1:
				 eOps.createUser(inputscan, usermap);
				break;

			case 2:

				eOps.purchaseProduct(usermap, inputscan, mainlist);

				System.out.println(usermap);
				break;

			case 3:

				eOps.returnProduct(usermap, mainlist, inputscan);

				break;

			case 4:

				eOps.generateReport(mainlist, usermap);

			default:
				break;
			}

		}
	}
}
