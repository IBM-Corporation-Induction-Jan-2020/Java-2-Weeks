package com.sushma.Assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EcommerceOperations {
	String name;
	String contactNumber;
	String mailId;

	public void createUser(Scanner inputscan, HashMap<Integer, User> usermap) {

		System.out.println("Enter name");
		name = inputscan.next();

		System.out.println("Enter Contact Number");
		contactNumber = inputscan.next();

		System.out.println("Enter mail Id");
		mailId = inputscan.next();

		User user = new User(name, contactNumber, mailId);
		int id = (int) (Math.random() * 1000);

		System.out.println("id "+id+" user :" + user + " is created");

		usermap.put(id, user);
		
	}
	static int input;
	public void purchaseProduct(HashMap<Integer, User> usermap, Scanner inputscan,
			ArrayList<ArrayList<ShoppingCartDetails>> mainlist) {
		  
		
		float totalPrice;
		int id ;
		int serviceprovider;
		
		String producttype = null;
		User user;
		ShoppingCartDetails shopping ;
		
		System.out.println("List of regisred users ids are as follows");
		System.out.println(usermap.keySet());

		System.out.println("Please enter the ur id");
		id = inputscan.nextInt();

		if (!usermap.containsKey(id)) {
			System.out.println("Entered id does not exists");
		} else 
		{

			System.out.println("Available Products are \n Amazon (Electronics : Laptop,Tablet,Mobile)\n"
					+ "		FlipKart (Books: Traditions , Spiritual , SciFi), \r\n"
					+ "		SnapDeal (Groceries: Rice, Pulses, Oils )");
			
			System.out.println("Choose Ecommerce service Providers 1.Amazon\n 2.Flipkart \n 3.Snapdeal");

			serviceprovider = inputscan.nextInt();
			
			System.out.println("Products");
            producttype=getProductType(serviceprovider,inputscan);
			
			ArrayList<ShoppingCartDetails> usermapper = mainlist.get(serviceprovider - 1);
			ShoppingCartDetails mapper = usermapper.get(input - 1);
			
			
			System.out.println("Enter Quantity");
			
			int quantity = inputscan.nextInt();

			System.out.println("Checking Availability");

			if (quantity > mapper.getQuantity())
				System.out.println("Entered Quantity Exceeded number avaliable items");
			    
			else {
				totalPrice = mapper.getPrice() * quantity;
				user = usermap.get(id);
				shopping = new ShoppingCartDetails(producttype, quantity, totalPrice);
				user.setUsercartdetails(shopping);
				mapper.setQuantity(mapper.getQuantity() - quantity);
				System.out.println("Successfully updated in shopping cart");
			}
		}

	}

	private String getProductType(int serviceprovider, Scanner inputscan) {
		
		String producttype = null;
		switch (serviceprovider) {

		case 1:
			System.out.println("Enter 1.Laptop 2.Tablet 3.Mobile");
			input = inputscan.nextInt();
			if (input == 1)
				producttype = "Laptop";
			else if (input == 2)
				producttype = "Tablet";
			else if (input == 3)
				producttype = "Mobile";
			else {
				System.out.println("Wrong input");
			}
			break;
		case 2:
			System.out.println("Enter 1.Traditions 2.Spiritual 3.SciFi");
			input = inputscan.nextInt();
			if (input == 1)
				producttype = "Traditions";
			else if (input == 2)
				producttype = "Spiritual";
			else if (input == 3)
				producttype = "SciFi";
			else {
				System.out.println("Wrong input");
			}
			break;
		case 3:
			System.out.println("Enter 1.Rice 2.Pulses 3.Oils");
			input = inputscan.nextInt();
			if (input == 1)
				producttype = "Rice";
			else if (input == 2)
				producttype = "Pulses";
			else if (input == 3)
				producttype = "Oils";
			else {
				System.out.println("Wrong input");
			}
			break;
		default:
			break;
		}
		return producttype;
	}

	public void returnProduct(HashMap<Integer, User> usermap, ArrayList<ArrayList<ShoppingCartDetails>> mainlist,
			Scanner inputscan) {
		int id ;
		String product_name;
		int i = 0;
		
		System.out.println("List of registered users id  are as follows");
		System.out.println(usermap.keySet());

		System.out.println("Please enter your id");
		id = inputscan.nextInt();

		
		if (!usermap.containsKey(id))
			{System.out.println("Entered id does not exist");
			return;
			}
			
        else 
		{System.out.println("Products purchased by the above user is" + usermap.get(id).getUsercartdetails());

		System.out.println("Enter the product name which u want to return");

		product_name = inputscan.next();
		
		for (i = 0; i < usermap.get(id).getUsercartdetails().size(); i++) {
			if (usermap.get(id).getUsercartdetails().get(i).getProduct().equalsIgnoreCase(product_name))
				{
				System.out.println("Entered product has been purchased by this user");

				break;
			}
		}}

		
		System.out.println("Please Enter the reason to return the product");
		String reasonToReturnTheProduct = inputscan.nextLine();

		System.out.println("Updating the user cart");
		int quantity = usermap.get(id).getUsercartdetails().get(i).getQuantity();
		float amount = usermap.get(id).getUsercartdetails().get(i).getPrice();
		usermap.get(id).getUsercartdetails().remove(i);
		
		System.out.println("User cart is updated");

		System.out.println("Updating Shopping cart");

		for (int j = 0; j < mainlist.size(); j++) {
			ArrayList<ShoppingCartDetails> service_provider = mainlist.get(j);
			for (int j2 = 0; j2 < service_provider.size(); j2++) {
				ShoppingCartDetails product = service_provider.get(j2);
				if (product.getProduct().equalsIgnoreCase(product_name)) {
					product.setQuantity((product.getQuantity() + quantity));
					break;
				}
			}
		}

		System.out.println("Amount " + (amount) * 75 / 100 + "is refunded ");

	}

	public void generateReport(ArrayList<ArrayList<ShoppingCartDetails>> mainlist, HashMap<Integer, User> usermap) {

		System.out.println("eCommerce report is as follows");

		for (ArrayList<ShoppingCartDetails> arrayList : mainlist) {
			for (ShoppingCartDetails arrayList2 : arrayList) {
				System.out.println(arrayList2);
			}

		}
		System.out.println(usermap);

	}

}
