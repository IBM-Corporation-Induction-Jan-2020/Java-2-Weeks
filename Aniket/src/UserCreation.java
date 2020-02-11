import java.util.Scanner;

public class UserCreation {

	UserParameters createUser(){
		
		UserParameters user = new UserParameters();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = sc.nextLine();
		System.out.println("Enter contact number");
		String contactNumber = sc.nextLine();
		System.out.println("Enter mail Id");
		String mailId = sc.nextLine();
		
		user.setName(name);
		user.setContactNumber(contactNumber);;
		user.setMailId(mailId);
		
		
		return user;
	}
	
}
