import java.util.Hashtable;
import java.util.Scanner;

public class EcommerceApplication {

	public static void main(String[] args) {

		Hashtable<String,Integer> itemPrice = new Hashtable<String, Integer>();
		itemPrice.put("laptop", 20000);
		itemPrice.put("Tablet", 10000);
		itemPrice.put("Mobile", 5000);
		itemPrice.put("Tradition", 1000);
		itemPrice.put("Spritual", 500);
		itemPrice.put("Scifi", 250);
		itemPrice.put("Rice", 400);
		itemPrice.put("Pulses", 200);
		itemPrice.put("Oil", 125);
		
		Hashtable<String, Integer> itemQuantity = new Hashtable<String, Integer>();
		itemQuantity.put("Laptop", 10);
		itemQuantity.put("Tablet", 20);
		itemQuantity.put("Mobile", 40);
		itemQuantity.put("Tradition", 50);
		itemQuantity.put("Spritual", 100);
		itemQuantity.put("Scifi", 200);
		itemQuantity.put("Rice", 50);
		itemQuantity.put("Pulses", 200);
		itemQuantity.put("Oil", 500);
		
		Scanner scan = new Scanner(System.in);
		int selection;
		EcommerceOperation eOps = new EcommerceOperation();
		
		do {

			
			System.out.println("1)Create  an user\n2)Purchase Product\n3)Return Product\n4)Report\n5)Exit\n");
			selection = Integer.parseInt(scan.nextLine());

			switch (selection) {
			case 1:
				eOps.createUser();
				break;
			case 2:
				eOps.purchaseProduct();
				break;
			case 3:
				System.out.println("Enter Your name:");
				eOps.returnProduct(scan.nextLine());
				break;
			case 4:
				eOps.reports(itemPrice, itemQuantity);
				break;
			case 5:
				System.out.println("Come Again:) Nice experience with you");
				break;
			default:
				System.out.println("Enter the correct Input");
				break;
			}

		} while (selection != 5);
	}


	}


