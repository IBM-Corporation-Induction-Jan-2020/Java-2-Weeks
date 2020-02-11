package com.sneha.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class ECommerce {
	
	public static void main(String args[])
	{
		String name,email,product;
		int contact,chh,ch,quantity;
		
		Operation.initialise();
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("1.User creation 2.Purchase product 3.Return product 4.Report 5.exit");
			chh=sc.nextInt();
			switch(chh)
			{
				case 1:
				System.out.println("Enter name :: ");
				name=sc.next();
				System.out.println("Enter contact number :: ");
				contact=sc.nextInt();
				System.out.println("Enter email id :: ");
				email=sc.next();
				
				Customer cust=new Customer(name,contact,email);
				Operation.createCustomer(cust);				
				break;
				
				case 2:
				System.out.println("Enter name :: ");
				name=sc.next();
				
				System.out.println("1.Amazon  2.Flipkart 3.Snapdeal 4.Exit:: ");
				ch=sc.nextInt();
				
				if(ch==1)
					Operation.displayAmazon();
				else if(ch==2)	
					Operation.displayFlipkart();
				else if(ch==3)
					Operation.displaySnapdeal();
				
				System.out.println("Enter product :: ");
				product=sc.next();
				System.out.println("Enter quantity :: ");
				quantity=sc.nextInt();
				
				Operation.purchaseProduct(name,product,quantity);
				
				break;
				
				case 3:
					Operation.displayCustomer();
					
					System.out.println("Enter name :: ");
					name=sc.next();
					
					System.out.println("Enter product :: ");
					product=sc.next();
					System.out.println("Enter quantity :: ");
					quantity=sc.nextInt();
					
					Operation.returnPurchase(name,product,quantity);

					break;
				case 4:
					System.out.println("Enter company to report 1.Amazon  2.Flipkart 3.Snapdeal 4.Exit:: ");
					ch=sc.nextInt();
					
					if(ch==1)
						Operation.displayAmazon();
					else if(ch==2)	
						Operation.displayFlipkart();
					else if(ch==3)
						Operation.displaySnapdeal();
					
					System.out.println("Enter product to report about:: ");
					product=sc.next();
				default:
					System.out.println("Wrong input");
			}
		
		}while(chh!=5);
		
	}

}

class Operation
{
	static HashMap<String, Product> hmapAmazon=new HashMap<String, Product>();
	static HashMap<String, Product> hmapFlipkart=new HashMap<String, Product>();
	static HashMap<String, Product> hmapSnapdeal=new HashMap<String, Product>();
	static HashMap<Customer, Product> hmap=new HashMap<Customer, Product>();

	public static void initialise()
	{
		hmapAmazon.put("Laptop",new Product("Laptop",20000,10));
		hmapAmazon.put("Tablet",new Product("Tablet",10000,20));
		hmapAmazon.put("Mobile",new Product("Mobile",5000,40));
		
		hmapFlipkart.put("Traditional",new Product("Traditional",1000,50));
		hmapFlipkart.put("Spiritual",new Product("Spiritual",500,100));
		hmapFlipkart.put("Scifi",new Product("Scifi",250,200));
		
		hmapSnapdeal.put("Groceries",new Product("Groceries",400,50));
		hmapSnapdeal.put("Pulses",new Product("Pulses",200,200));
		hmapSnapdeal.put("Oils",new Product("Oils",125,500));
	}
	public static void returnPurchase(String name, String product, int quantity) {
		
		int total=0;
		
		if(hmapAmazon.get(product) != null)
		{
				hmapAmazon.get(product).setProduct_quantity(hmapAmazon.get(product).getProduct_quantity()+quantity);
				total=hmapAmazon.get(product).getProduct_price()*quantity;
				total=(total*75)/100;
		}
		
		else if(hmapFlipkart.get(product) != null)
		{
				hmapFlipkart.get(product).setProduct_quantity(hmapFlipkart.get(product).getProduct_quantity()+quantity);
				total=hmapAmazon.get(product).getProduct_price()*quantity;
				total=(total*75)/100;
		}
		
		else if(hmapSnapdeal.get(product) != null)
		{
				hmapSnapdeal.get(product).setProduct_quantity(hmapSnapdeal.get(product).getProduct_quantity()+quantity);
				total=hmapAmazon.get(product).getProduct_price()*quantity;
				total=(total*75)/100;
		}
		
		for (Customer customer : hmap.keySet()) 
		{
		
			if(customer.getName().equalsIgnoreCase(name))
			{
				hmap.get(customer).setProduct_name("");
				hmap.get(customer).setProduct_quantity(0);
				hmap.get(customer).setProduct_price(0);
			
				break;
			}
		
		}
	
		System.out.println("...Successfully product returned with amount "+total);
		System.out.println(hmap);
	}
	public static void displayAmazon()
	{
		System.out.println(hmapAmazon);
	}
	public static void displayFlipkart()
	{
		System.out.println(hmapFlipkart);
	}
	public static void displaySnapdeal()
	{
		System.out.println(hmapSnapdeal);
	}
	public static void displayCustomer()
	{
		System.out.println(hmap);
	}
	public static void createCustomer(Customer cust) {

		hmap.put(cust,new Product());
		System.out.println("...Successfully account created....");
		System.out.println(hmap);
		
	}
	
	public static void purchaseProduct(String name,String product,int quantity)
	{
		int total = 0;
		
		if(hmapAmazon.get(product).getProduct_quantity()>quantity)
		{
				System.out.println("available");
				total=hmapAmazon.get(product).getProduct_price()*quantity;
				hmapAmazon.get(product).setProduct_quantity((hmapAmazon.get(product).product_quantity)-quantity);
		}
		else if(hmapFlipkart.get(product).getProduct_quantity()>quantity)
		{
				System.out.println("available");
				total=hmapFlipkart.get(product).getProduct_price()*quantity;
				hmapFlipkart.get(product).setProduct_quantity((hmapFlipkart.get(product).product_quantity)-quantity);
		}
		else if(hmapSnapdeal.get(product).getProduct_quantity()>quantity)
		{
				System.out.println("available");
				total=hmapSnapdeal.get(product).getProduct_price()*quantity;
				hmapSnapdeal.get(product).setProduct_quantity((hmapSnapdeal.get(product).product_quantity)-quantity);
		}
	
		for (Customer customer : hmap.keySet()) 
		{
		
			if(customer.getName().equalsIgnoreCase(name))
			{
				hmap.get(customer).setProduct_name(product);
				hmap.get(customer).setProduct_quantity(quantity);
				hmap.get(customer).setProduct_price(total);
			
				break;
			}
		
		}
	
		System.out.println("...Successfully product purchased.....");
		System.out.println(hmap);
	}
	
	
}
