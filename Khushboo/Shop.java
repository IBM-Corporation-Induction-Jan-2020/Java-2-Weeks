package com.khushboo.app.ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Shop {

	
	static Product prod = new Product();
	
	static void availableProducts() {
		System.out.println("In which category would you like to make purchase ? \n 1.Electronics \n2.Books \n3.Groceries");
		
		Scanner scan = new Scanner(System.in);
		
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			Electronics();
			break;

		case 2:
			Books();
			break;
			
		case 3:
			Groceries();
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
		}
		

	}

	private static void Groceries() {
		
		HashMap<Integer, Object> grocery = new HashMap<Integer, Object>();
		
		
		
		
		 System.out.println("  Product  |  Quantity Available |  Price");
	        System.out.println("--------------------------------------");	
	        
	}

	private static void Books() {
		 System.out.println("  A  |  B  |  C");
	        System.out.println("---------------");		
	}

	private static void Electronics() {
		 System.out.println("  A  |  B  |  C");
	        System.out.println("---------------");		
	}
}
