package com.ecommerce.problem;
import java.util.*;
import java.io.*;
public class CustomerAdmin {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
    public void userChoices(String option)throws Exception {
    	CustomerServices cs = new CustomerServices();
    	switch(option) {
    	case "PP":
    		System.out.println("Enter the Type of Shopping You Want to Make!!");
    		System.out.println("Electronics\nBooks\nGroceries");
    		String choice1 = in.readLine();
    		if(choice1.equalsIgnoreCase("electronics")) {
    			cs.createAmazonCustomer();
    		}else if(choice1.equalsIgnoreCase("books")) {
    			cs.createFlipkartCustomer();
    		}else if(choice1.equalsIgnoreCase("groceries")) {
    			cs.createSnapdealCustomer();
    		}
    		bot();
    	case "UC":
    		cs.createUser();
    		bot();
    	case "RP":
    		System.out.println("Enter the Type of Return You Want to Make!!");
    		System.out.println("Electronics\nBooks\nGroceries\nExit");
    		String choice2 = in.readLine();
    		if(choice2.equalsIgnoreCase("electronics")) {
    			cs.returnAmazonCustomer();
    		}else if(choice2.equalsIgnoreCase("books")) {
    			cs.returnFlipkartCustomer();
    		}else if(choice2.equalsIgnoreCase("groceries")) {
    			cs.returnSnapdealCustomer();
    		}else if(choice2.equalsIgnoreCase("exit")) {
    			System.exit(1);
    		}
    	
    		bot();
    	case "R":
    		cs.report();
    		bot();
    	case "E":
    		System.err.println("You have exited the site!!");
    		System.out.println("Thankyou for Shopping with us!!");
    		System.exit(1);
    	default:
    		System.err.println("Your Choice is Invalid!!");
    		bot();
    	}
    }
    public static void main(String[] args) throws Exception{
    	CustomerAdmin ca = new CustomerAdmin();
    	ca.bot();
	}

	public void bot() throws Exception{
		String choices = "";
		while(true) {
			System.out.println("Welcome to the Shopping Site!!");
			System.out.println("(UC)ser Creation\n(PP)urchase Product\n(RP)turn Product\n(R)eport\n(E)xit");
			choices = in.readLine(); 
			userChoices(choices);
		}
	}
}
