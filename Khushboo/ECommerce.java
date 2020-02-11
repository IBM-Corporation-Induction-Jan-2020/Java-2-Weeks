package com.khushboo.app.ecommerce;

import java.util.Scanner;

public class ECommerce {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("------------------ Welcome to eCommerce !! ------------------");
		
		

		int choice = 0;

		while (choice != 3) {

			System.out.println("\n\n\n Please select(1,2,3) from the following options to proceed."
					+ "\n\n1. New user ? Sign up!! \n2. Existing User ? \n3. Exit \n\n");

			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1: {
				createUser();
				break;
			}
			case 2 : {
				System.out.println("Enter Username");
				String name = scan.nextLine();
				
				break;
			}

			case 3: {
				System.out.println("Exiting....");
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Please Enter valid choice ");
			}

			}

		}
	}

	private static void createUser() {

	
		
		UserController uCon = new UserController();
		System.out.println("Enter the following details: \nName: ");
		String name = scan.nextLine();
		System.out.println("E-Mail Id: ");
		String eMail = scan.nextLine();
		System.out.println("Contact");
		String contact = scan.nextLine();
		
		uCon.createUser(name, eMail, contact);
	}
}
