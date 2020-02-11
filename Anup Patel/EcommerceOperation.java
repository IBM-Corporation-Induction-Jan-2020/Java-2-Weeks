import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class EcommerceOperation {

	Scanner scan = new Scanner(System.in);
	HashMap<User, HashMap<String, Integer>> cart = new HashMap<User, HashMap<String, Integer>>();
	
	void createUser(){
		
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		
		System.out.println("Enter Contact Number : ");
		String contact = scan.nextLine();
		
		System.out.println("Enter Email ID: ");
		String email = scan.nextLine();
		
		User uOne = new User(name, contact, email);
		cart.put(uOne, uOne.l);
	}
	
	void purchaseProduct() throws NullPointerException{
		
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		
		for (User uOne : cart.keySet()) {
			if (name.equalsIgnoreCase(uOne.getName())) {
				System.out.println("Buying Options !! Amazon : Electronics ,Flipkart : Books , Snapdeal : Groceries ");
				System.out.println("Amazon Electronics : Laptops , Tablets and Mobiles");
				System.out.println("Flipkart Books : Traditional , Spiritual and scifi ");
				System.out.println("Snapdeal Groceries : Rice , Pulses and oils");
				String product = scan.nextLine();
				
				System.out.println("Enter the quantity : ");
				int quantity = Integer.parseInt(scan.nextLine());
				
				uOne.l.put(product, quantity);
				cart.put(uOne, uOne.l);
				display(uOne.getName());
				bill(uOne.l);
			}
			else {
				System.out.println("Invalid Name !!!");
			}
			
		}
	}
	
	void returnProduct(String name) throws NullPointerException{
		for (User uOne : cart.keySet()) {
			System.out.println("Enter the item to return : ");
			String retObj = scan.nextLine();
			if (uOne.l.containsKey(retObj)) {
				uOne.l.remove(retObj);
				System.out.println("Item removed successfully!!!");
				display(uOne.getName());
				bill(uOne.l);
			}
			else {
				System.out.println("Invalid Product !!!");
			}
		}
	}

	private void bill(HashMap<String, Integer> order) throws NullPointerException {

		double price = 0;
		Hashtable<String, Integer> itemPrice = new Hashtable<String, Integer>();
		itemPrice.put("Laptop", 20000);
		itemPrice.put("Tablet", 10000);
		itemPrice.put("Mobile", 5000);
		itemPrice.put("Tradition", 1000);
		itemPrice.put("Spritual", 500);
		itemPrice.put("Scifi", 250);
		itemPrice.put("Rice", 400);
		itemPrice.put("Pulses", 200);
		itemPrice.put("Oil", 125);

		for (String item : order.keySet()) {
			price = price + (((int) order.get(item)) * ((int) itemPrice.get(item)));
		}

		System.out.println("The amount to be paid is " + price);

	}

		

	public void reports(Hashtable<String, Integer> itemPrice, Hashtable<String, Integer> itemQuantity) {
		int count = 0;
		for (User name : cart.keySet()) {
			count++;
		}
		System.out.println("The number of users in the system are " + count);
	}

	public void display(String name) {
		for (User uOne : cart.keySet()) {
			if (name.equalsIgnoreCase(uOne.getName())) {
				System.out.println("Your cart contains " + cart.get(uOne));
			}
		}
	}

}
	

