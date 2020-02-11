package com.shetty.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ecommerceapp {
	static String input;
	static String userIn="yes";
	static Product prod1;
	static Product prod2;
	static Product prod3;

	public static void main(String[] args) {
		
		prod1=new Product("Laptop",20000,10,"Tablet",10000,20,"Mobile",5000,40);		
		prod2=new Product("Traditional Book",1000,50,"Spiritual Book",500,100,"SciFi",250,200);
		prod3=new Product("Rice",400,50,"Pulses",200,200,"Oils",125,500);
		
		Map<String, Product> service=new HashMap<String, Product>();
		service.put("amazon", prod1);
		service.put("flipkart", prod2);
		service.put("Snapdeal", prod3);
		
		EcommerseOps eOps=new EcommerseOps();
		
		Scanner scan =new Scanner(System.in);
		while(!userIn.equals("done")) {
			System.out.println("which operation do u want to perform(user creation,purchase product,return product,report,checkout):");
			String proc = scan.nextLine();
			switch (proc.toLowerCase()) {
			case "user":
				eOps.createUser(new UserInfo());
				break;
			case "purchase":
				System.out.println("Where do u want to purchse");
				String data1= scan.nextLine();
				Product prod1=identification(data1);
				if(prod1!=null) {
					System.out.println(prod1);
					eOps.purchaseItem(prod1);	
				}
				break;
			case "return":
				System.out.println("Where do u want to return");
				String data2= scan.nextLine();
				Product prod2=identification(data2);
				if(prod2!=null) {
					eOps.returnItem(prod2);	
				}
				break;
			case "report":
				System.out.println(ecommerceapp.prod1);
				System.out.println(ecommerceapp.prod2);
				System.out.println(prod3);
				eOps.report();
				break;
			case "checkout":
				userIn="done";
 			break;
			default:
				System.out.println("invalid input");
			}
		
		
		

	}

	}
	static Product identification(String name) {
		if(name.equalsIgnoreCase("amazon")) {
			return prod1;
		}else if(name.equalsIgnoreCase("flipkart")){
			return prod2;
		}else if(name.equalsIgnoreCase("snapdeal")){
			return prod3;
		}else {
			System.out.println("enter valid input");
			return null;
		}
	}
}
