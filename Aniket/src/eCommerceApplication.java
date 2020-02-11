import java.util.Scanner;

public class eCommerceApplication {

	 	
	public static void main(String[] args) {

		 
		Scanner sb = new Scanner(System.in);
		
		
		UserParameters para = new UserParameters();
		int i=0;
		
		while(true) {
			System.out.println("Choose what to do \n 1. Create User \n 2.Purchase Product \n 3. Return Product \n 4. Report \n 5. exit");
			int key = Integer.parseInt(sb.nextLine());
		
			switch (key) {
		case 1:
			UserCreation create = new UserCreation();
			para = create.createUser();
			i++;
			break;
			
		case 2:
			PurchaseProduct purchase  = new PurchaseProduct();
			
				purchase.showUser(para);	
			
			purchase.chooseUser(para);
		break;
		case 3:
			
			ReturnProduct ret =new ReturnProduct();
			ret.chooseeUser(para);
			
		default:
			break;
		
		case 4:
			ReportsProduct report = new ReportsProduct();
			report.repo(para);
		break;
			case 5:
				exitClass ex = new exitClass();
				ex.exitp();
				
	
		}


	
	}
}
}