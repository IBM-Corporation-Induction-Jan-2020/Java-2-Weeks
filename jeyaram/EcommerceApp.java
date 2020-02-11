package com.Jeyaram.classtest1;

import java.util.Hashtable;
import java.util.Scanner;

public class EcommerceApp {

	public static void main(String[] args) {

		Hashtable<String, Integer> ipri = new Hashtable<String, Integer>();
		Hashtable<String, Integer> iquan = new Hashtable<String, Integer>();
		ipri.put("Laptop", 20000);
		ipri.put("Tablet", 10000);
		ipri.put("Mobile", 5000);
		ipri.put("Tradition", 1000);
		ipri.put("Spritual", 500);
		ipri.put("Scifi", 250);
		ipri.put("Rice", 400);
		ipri.put("Pulses", 200);
		ipri.put("Oil", 125);

		iquan.put("Laptop", 10);
		iquan.put("Tablet", 20);
		iquan.put("Mobile", 40);
		iquan.put("Tradition", 50);
		iquan.put("Spritual", 100);
		iquan.put("Scifi", 200);
		iquan.put("Rice", 50);
		iquan.put("Pulses", 200);
		iquan.put("Oil", 500);

		Scanner sc = new Scanner(System.in);
		int choice;
		EcommerceOps eo = new EcommerceOps(iquan);

		do {

			System.out.println("***************************************************************************");
			System.out.println("\nWhat do you want to do?");
			System.out.println("1)Create  an user\n2)Purchase Product\n3)Return Product\n4)Report\n5)Exit\n");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				eo.createEmployee();
				break;
			case 2:
				eo.purchaseProduct();
				break;
			case 3:
				System.out.println("Enter Your name:");
				eo.returnProduct(sc.nextLine());
				break;
			case 4:
				eo.reports(ipri, iquan);
				break;
			case 5:
				System.out.println("Come Again:) Nice experience with you");
				break;
			default:
				System.out.println("Enter the correct Input");
				break;
			}

		} while (choice != 5);
	}

}
