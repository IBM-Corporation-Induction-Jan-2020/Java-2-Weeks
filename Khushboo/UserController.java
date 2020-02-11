package com.khushboo.app.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class UserController {

	List<ECommerceUser> userDetails = new ArrayList();
	
	void createUser(String name, String eMail, String contact) {

		ECommerceUser user = new ECommerceUser();
		user.setName(name);
		user.seteMail(eMail);
		user.setContact(contact);
		
		userList(user);

	}

	void userList(ECommerceUser user) {


		userDetails.add(user);

		int size = userDetails.size();
		System.out.println(size);

		for (int i = 0; i < userDetails.size(); i++) {

			System.out.println("User created\n" + userDetails.get(i));

		}

	}
	
	boolean validateUser(String name) {
		
		if (userDetails.contains(name))  {
			Shop.availableProducts();
			return true;
		}
		else {
			System.out.println("User does not exist. Please Sign up");
			return false;
		}
	}

}
