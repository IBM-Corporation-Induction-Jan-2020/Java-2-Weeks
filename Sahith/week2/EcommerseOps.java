package com.shetty.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.shetty.miscellaneous.systemdemo;

public class EcommerseOps {
	Scanner scan = new Scanner(System.in);
	static int total;
	static float returnval;
	static int numrem;
	UserInfo userinfo = new UserInfo();
	Product Prodinfo = new Product();

	HashMap<Long, UserInfo> hm = new HashMap<Long, UserInfo>();

	public void createUser(UserInfo user) {
		System.out.println("Enter Mobile Number: ");
		long num = Long.parseLong(scan.nextLine());
		user.setNumber(num);
		System.out.println("Enter Name: ");
		String name = scan.nextLine();
		user.setName(name);
		System.out.println("Enter email id:");
		String email = scan.nextLine();
		user.setEmailid(email);

		hm.put(num, user);
		System.out.println("user created :" + user);
	}

	public void purchaseItem(Product prod) {
		HashMap<String, Integer> cons = new HashMap<String, Integer>();
		System.out.println("enter contact number of user: ");
		long id = Long.parseLong(scan.nextLine());
		UserInfo usr = hm.get(id);
		System.out.println(usr);
		String user = "yes";
		while (!user.equals("done")) {
			System.out.println("whic item do u want to purchase: ");
			String name = scan.nextLine();
			switch (name.toLowerCase()) {
			case "laptop":
				System.out.println("Stock remaining: " + prod.quant1);
				int num1 = buy(20000, prod.quant1);
				if (num1 < (prod.quant1 + 1)) {
					usr.bprod.put(name, num1);
					prod.quant1 = prod.quant1 - num1;
					System.out.println("Quantity remaining: " + prod.quant1);
				}
				break;
			case "Tablet":
				System.out.println("Stock remaining: " + prod.quant2);
				int num2 = buy(10000, prod.quant2);
				if (num2 < (prod.quant2 + 1)) {
					usr.bprod.put(name, num2);
					prod.quant2 = prod.quant2 - num2;
					System.out.println("Quantity remaining: " + prod.quant2);
				}
				break;
			case "mobile":
				System.out.println("Stock remaining: " + prod.quant3);
				int num3 = buy(5000, prod.quant3);
				if (num3 < (prod.quant3 + 1)) {
					usr.bprod.put(name, num3);
					prod.quant3 = prod.quant3 - num3;
					System.out.println("Quantity remaining: " + prod.quant3);
				}
				break;
			case "traditonal":
				System.out.println("Stock remaining: " + prod.quant1);
				int num4 = buy(1000, prod.quant1);
				if (num4 < (prod.quant1 + 1)) {
					usr.bprod.put(name, num4);
					prod.quant1 = prod.quant1 - num4;
					System.out.println("Quantity remaining: " + prod.quant1);
				}
				break;
			case "spiritual":
				System.out.println("Stock remaining: " + prod.quant2);
				int num5 = buy(500, prod.quant2);
				if (num5 < (prod.quant2 + 1)) {
					usr.bprod.put(name, num5);
					prod.quant2 = prod.quant2 - num5;
					System.out.println("Quantity remaining: " + prod.quant2);
				}
				break;
			case "scifi":
				System.out.println("Stock remaining: " + prod.quant3);
				int num6 = buy(250, prod.quant3);
				if (num6 < (prod.quant3 + 1)) {
					usr.bprod.put(name, num6);
					prod.quant3 = prod.quant3 - num6;
					System.out.println("Quantity remaining: " + prod.quant3);
				}
				break;
			case "rice":
				System.out.println("Stock remaining: " + prod.quant1);
				int num7 = buy(400, prod.quant1);
				if (num7 < (prod.quant1 + 1)) {
					usr.bprod.put(name, num7);
					prod.quant1 = prod.quant1 - num7;
					System.out.println("Quantity remaining: " + prod.quant1);
				}
				break;
			case "pulses":
				System.out.println("Stock remaining: " + prod.quant2);
				int num8 = buy(200, prod.quant2);
				if (num8 < (prod.quant2 + 1)) {
					usr.bprod.put(name, num8);
					prod.quant2 = prod.quant2 - num8;
					System.out.println("Quantity remaining: " + prod.quant2);
				}
				break;
			case "oils":
				System.out.println("Stock remaining: " + prod.quant3);
				int num9 = buy(125, prod.quant3);
				if (num9 < (prod.quant3 + 1)) {
					usr.bprod.put(name, num9);
					prod.quant3 = prod.quant3 - num9;
					System.out.println("Quantity remaining: " + prod.quant3);
				}
				break;
			case "checkout":
				user = "done";
				System.out.println("Total cost is :" + total);
				break;
			default:
				System.out.println("invalid input");
			}
		}

	}

	private int buy(int val, int quant) {
		System.out.println("what is the quatity u want to buy");
		int num = Integer.parseInt(scan.nextLine());
		if (num > quant) {
			System.out.println("exceeded stock limit");
		} else {
			int cost = val * num;
			total = total + cost;
		}
		return num;
	}

	public void returnItem(Product prod) {
		String user = "yes";
		System.out.println("From mobile number of user from whom u want to return: ");
		long id = Long.parseLong(scan.nextLine());
		UserInfo usr = hm.get(id);
		while (!user.equals("done")) {
			System.out.println("whic item do u want to return: ");
			String name = scan.nextLine();
			switch (name.toLowerCase()) {
			case "laptop":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(20000,numrem);
					prod.quant1 = prod.quant1 + numrem;
					System.out.println("Quantity remaining: " + prod.quant1);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "tablet":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(10000,numrem);
					prod.quant2 = prod.quant2 + numrem;
					System.out.println("Quantity remaining: " + prod.quant2);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "mobile":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(5000,numrem);
					prod.quant3 = prod.quant3 + numrem;
					System.out.println("Quantity remaining: " + prod.quant3);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "traditonal":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(1000,numrem);
					prod.quant1 = prod.quant1 + numrem;
					System.out.println("Quantity remaining: " + prod.quant1);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "spiritual":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(500,numrem);
					prod.quant2 = prod.quant2 + numrem;
					System.out.println("Quantity remaining: " + prod.quant2);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "scifi":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(250,numrem);
					prod.quant3 = prod.quant3 + numrem;
					System.out.println("Quantity remaining: " + prod.quant3);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "rice":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(400,numrem);
					prod.quant1 = prod.quant1 + numrem;
					System.out.println("Quantity remaining: " + prod.quant1);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "pulses":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(200,numrem);
					prod.quant2 = prod.quant2 + numrem;
					System.out.println("Quantity remaining: " + prod.quant2);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "oils":
				System.out.println("How much do u want to return:");
				numrem = Integer.parseInt(scan.nextLine());
				if (numrem < (usr.bprod.get(name) + 1)) {
					sell(125,numrem);
					prod.quant3 = prod.quant3 + numrem;
					System.out.println("Quantity remaining: " + prod.quant3);
				} else {
					System.out.println("enter valid info");
				}
				break;
			case "checkout":
				user = "done";
				System.out.println("refund cost is :" + returnval);
				break;
			default:
				System.out.println("invalid input");
			}
		}

	}

	private void sell(int val, int quant) {
		float cost=(float)(0.75*val*quant);
		returnval=returnval+cost;
		
	}
	
	public void report() {
		System.out.println(hm);

	}

}
