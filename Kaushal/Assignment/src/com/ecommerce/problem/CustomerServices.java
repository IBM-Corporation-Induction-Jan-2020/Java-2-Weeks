package com.ecommerce.problem;

import java.io.*;
import java.util.*;

public class CustomerServices {
	CustomerBean cb = new CustomerBean();
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static HashMap<String, CustomerBean> amazon = new HashMap<>();
	static HashMap<String, CustomerBean> flipkart = new HashMap<>();
	static HashMap<String, CustomerBean> snapdeal = new HashMap<>();

	public void createAmazonCustomer() throws Exception {
		Amazon am = new Amazon();
		System.out.println("Welcome to Amazon!!");
		System.out.println("Products avialable Are ----> Laptop\tTablet\tMobile");
		System.out.println("Enter the name!!");
		cb.setName(in.readLine());
		System.out.println("Enter the Email!!");
		cb.setEmail(in.readLine());
		System.out.println("Enter the ContacNumber!!");
		cb.setContactNumber(in.readLine());
		System.out.println("Enter the Product");
		cb.setProduct(in.readLine());
		System.out.println("Enter the Quantity!!");
		cb.setQuantity(in.readLine());
		if (cb.getProduct().equalsIgnoreCase("laptop")) {
			if (Integer.parseInt(cb.getQuantity()) > am.getQuantityP1()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = am.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				am.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * am.costP1));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * am.costP1));
			}

		} else if (cb.getProduct().equalsIgnoreCase("tablet")) {
			if (Integer.parseInt(cb.getQuantity()) > am.getQuantityP2()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = am.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				am.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * am.costP2));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * am.costP2));

			}
		} else if (cb.getProduct().equalsIgnoreCase("mobile")) {
			if (Integer.parseInt(cb.getQuantity()) > am.getQuantityP3()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = am.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				am.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * am.costP3));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * am.costP3));
			}
		}
		amazon.put(cb.getContactNumber(), new CustomerBean(cb.getName(), cb.getContactNumber(), cb.getEmail(),
				cb.getProduct(), cb.getQuantity(), cb.getPrice()));

	}

	public void createSnapdealCustomer() throws Exception {
		Snapdeal sd = new Snapdeal();
		System.out.println("Welcome to Snapdeal!!");
		System.out.println("Products avialable Are ----> Rice\tPulses\tOils");
		System.out.println("Enter the name!!");
		cb.setName(in.readLine());
		System.out.println("Enter the Email!!");
		cb.setEmail(in.readLine());
		System.out.println("Enter the ContacNumber!!");
		cb.setContactNumber(in.readLine());
		System.out.println("Enter the Product");
		cb.setProduct(in.readLine());
		System.out.println("Enter the Quantity!!");
		cb.setQuantity(in.readLine());
		if (cb.getProduct().equalsIgnoreCase("rice")) {
			if (Integer.parseInt(cb.getQuantity()) > sd.getQuantityP1()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = sd.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				sd.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * sd.costP1));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * sd.costP1));
			}

		} else if (cb.getProduct().equalsIgnoreCase("pulses")) {
			if (Integer.parseInt(cb.getQuantity()) > sd.getQuantityP2()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = sd.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				sd.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * sd.costP2));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * sd.costP2));
			}
		} else if (cb.getProduct().equalsIgnoreCase("oils")) {
			if (Integer.parseInt(cb.getQuantity()) > sd.getQuantityP3()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = sd.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				sd.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * sd.costP3));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * sd.costP3));
			}
		}
		snapdeal.put(cb.getContactNumber(), new CustomerBean(cb.getName(), cb.getContactNumber(), cb.getEmail(),
				cb.getProduct(), cb.getQuantity(), cb.getPrice()));
	}

	public void createFlipkartCustomer() throws Exception {
		Flipkart fk = new Flipkart();
		System.out.println("Enter the name!!");
		cb.setName(in.readLine());
		System.out.println("Enter the Email!!");
		cb.setEmail(in.readLine());
		System.out.println("Enter the ContacNumber!!");
		cb.setContactNumber(in.readLine());
		System.out.println("Welcome to Flipkart!!");
		System.out.println("Books avialable Are ----> Traditions\tSciFi\tSpiritual");
		System.out.println("Enter the Product");
		cb.setProduct(in.readLine());
		System.out.println("Enter the Quantity!!");
		cb.setQuantity(in.readLine());
		if (cb.getProduct().equalsIgnoreCase("traditions")) {
			if (Integer.parseInt(cb.getQuantity()) > fk.getQuantityP1()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = fk.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				fk.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * fk.costP1));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * fk.costP1));
			}

		} else if (cb.getProduct().equalsIgnoreCase("scifi")) {
			if (Integer.parseInt(cb.getQuantity()) > fk.getQuantityP2()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = fk.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				fk.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * fk.costP2));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * fk.costP2));
			}
		} else if (cb.getProduct().equalsIgnoreCase("spiritual")) {
			if (Integer.parseInt(cb.getQuantity()) > fk.getQuantityP3()) {
				System.err.println("Quantity is not avialable!!");
				return;
			} else {
				int quan = fk.getQuantityP1() - Integer.parseInt(cb.getQuantity());
				fk.setQuantityP1(quan);
				System.out.println("The total amount would be " + (Integer.parseInt(cb.getQuantity()) * fk.costP3));
				cb.setPrice((Integer.parseInt(cb.getQuantity()) * fk.costP3));
			}
		}
		flipkart.put(cb.getContactNumber(), new CustomerBean(cb.getName(), cb.getContactNumber(), cb.getEmail(),
				cb.getProduct(), cb.getQuantity(), cb.getPrice()));
	}

	public void returnAmazonCustomer() throws Exception {
		Amazon am = new Amazon();
		if (amazon.size() == 0) {
			System.err.println("No Transaction Done!!");
			return;
		} else {
			String contact = "";
			String product = "";
			System.out.println("Welcome to Amazon!!");
			System.out.println("Products avialable Are ----> Laptop\tTablet\tMobile");
			System.out.println("Enter the name!!");
			in.readLine();
			System.out.println("Enter the Contact!!");
			contact = in.readLine();
			System.out.println("Enter the Product");
			product = in.readLine();
			System.out.println("Enter the Reason to return!!");
			String reason = in.readLine();
			double price = 0.0;
			int quan = 0;
			if (product.equalsIgnoreCase("laptop")) {
				quan = Integer.parseInt(cb.getQuantity()) + am.getQuantityP1();
				price = ((quan * am.costP1) * 0.75);
				am.setQuantityP1(quan);
			} else if (product.equalsIgnoreCase("tablet")) {
				quan = Integer.parseInt(cb.getQuantity()) + am.getQuantityP2();
				price = ((quan * am.costP2) * 0.75);
				am.setQuantityP2(quan);
			} else if (product.equalsIgnoreCase("mobile")) {
				quan = Integer.parseInt(cb.getQuantity()) + am.getQuantityP3();
				price = ((quan * am.costP3) * 0.75);
				am.setQuantityP3(quan);
			}
			amazon.get(contact).quantity = "0";
			amazon.get(contact).price = 0;
			System.out.println("Calculated Refund Amount ---> " + price);
			System.out.println("Details Of the Shopping cart Updated!!");
			return;
		}

	}

	public void returnFlipkartCustomer() throws Exception {
		Flipkart fk = new Flipkart();
		if (flipkart.size() == 0) {
			System.err.println("No Transaction Done!!");
			return;
		} else {

			String contact = "";
			String product = "";
			System.out.println("Welcome to Flipkart!!");
			System.out.println("Books avialable Are ----> Traditions\tSciFi\tSpiritual");
			System.out.println("Enter the name!!");
			in.readLine();
			System.out.println("Enter the Contact!!");
			contact = in.readLine();
			System.out.println("Enter the Product");
			product = in.readLine();
			System.out.println("Enter the Reason to return!!");
			String reason = in.readLine();
			double price = 0.0;
			int quan = 0;
			if (product.equalsIgnoreCase("traditions")) {
				quan = Integer.parseInt(cb.getQuantity()) + fk.getQuantityP1();
				price = ((quan * fk.costP1) * 0.75);
				fk.setQuantityP1(quan);
			} else if (product.equalsIgnoreCase("scifi")) {
				quan = Integer.parseInt(cb.getQuantity()) + fk.getQuantityP2();
				price = ((quan * fk.costP2) * 0.75);
				fk.setQuantityP2(quan);
			} else if (product.equalsIgnoreCase("spiritual")) {
				quan = Integer.parseInt(cb.getQuantity()) + fk.getQuantityP3();
				price = ((quan * fk.costP3) * 0.75);
				fk.setQuantityP3(quan);
			}
			flipkart.get(contact).quantity = "0";
			flipkart.get(contact).price = 0;
			System.out.println("Calculated Refund Amount ---> " + price);
			System.out.println("Details Of the Shopping cart Updated!!");
			return;
		}
	}

	public void returnSnapdealCustomer() throws Exception {
		Snapdeal sd = new Snapdeal();
		if (snapdeal.size() == 0) {
			System.err.println("No Transaction Done!!");
			return;
		} else {

			String contact = "";
			System.out.println("Welcome to Snapdeal!!");
			System.out.println("Products avialable Are ----> Rice\tPulses\tOils");
			System.out.println("Enter the name!!");
			in.readLine();
			System.out.println("Enter the contact!!");
			contact = in.readLine();

			System.out.println("Enter the Product");
			String product = in.readLine();
			System.out.println("Enter the Reason to return!!");
			String reason = in.readLine();
			double price = 0.0;
			int quan = 0;
			if (product.equalsIgnoreCase("rice")) {
				quan = Integer.parseInt(cb.getQuantity()) + sd.getQuantityP1();
				sd.setQuantityP1(quan);
				price = ((quan * sd.costP1) * 0.75);
			} else if (product.equalsIgnoreCase("pulses")) {
				quan = Integer.parseInt(cb.getQuantity()) + sd.getQuantityP2();
				sd.setQuantityP2(quan);
				price = ((quan * sd.costP2) * 0.75);
			} else if (product.equalsIgnoreCase("oils")) {
				quan = Integer.parseInt(cb.getQuantity()) + sd.getQuantityP3();
				sd.setQuantityP3(quan);
				price = ((quan * sd.costP3) * 0.75);
			}
			snapdeal.get(contact).quantity = "0";
			snapdeal.get(contact).price = 0;
			System.out.println("Calculated Refund Amount ---> " + price);
			System.out.println("Details Of the Shopping cart Updated!!");
			return;
		}
	}

	public void createUser() throws Exception {
		System.out.println("Welcome to the Login!!");
		System.out.println("Enter the name!!");
		in.readLine();
		System.out.println("Enter the Email!!");
		in.readLine();
		System.out.println("Enter the contact!!");
		in.readLine();
		System.out.println("Successfully LoggedIn!!");
		CustomerAdmin ca = new CustomerAdmin();
		ca.userChoices("PP");
		return;
	}

	public void report() throws Exception {
		System.out.println("Enter the Ecommerce Buyers You want to see ");
		System.out.println("Amazon\tFlipkart\tSnapdeal");
		String choice = in.readLine();
		if (choice.equalsIgnoreCase("amazon")) {
			System.out.println("The Number of Users did Transaction --- > " + amazon.size() + " users");
			return;
		} else if (choice.equalsIgnoreCase("flipkart")) {
			System.out.println("The Number of Users did Transaction --- > " + flipkart.size() + " users");
			return;
		} else if (choice.equalsIgnoreCase("snapdeal")) {
			System.out.println("The Number of Users did Transaction --- > " + snapdeal.size() + " users");
			return;
		}
	}

}
