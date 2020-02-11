import java.util.Scanner;

public class ReturnProduct {

	Scanner sd = new Scanner(System.in);
	
	public void showUser(UserParameters para) {
		System.out.println("Showing availabe users \n"+para);
	}
	
	void chooseeUser(UserParameters para){
		String option="y";
		UserParameters prod = new UserParameters();
				
		System.out.println("Amazon(Electronics: Laptop 20k "+ prod.getaLaptop() +", Tablet 10k "+prod.getaTablet()+", Mobile 5k "+prod.getaMobile() +")");
		System.out.println("Books: Traditions 1000 " + prod.getbTraditions() +", Spiritual 500 "+ prod.getbSpiritual()+", SciFi 250 "+ prod.getbScifi() +")");
		System.out.println("SnapDeal (Groceries: Rice 400 "+prod.getgRice()+", Pulses 200 "+prod.getgPulses()+", Oils 125 "+prod.getgOils()+")");
		

				System.out.println("Choose Company \n 1. Amazon \n 2. FlipKart \n 3. SnapDeal");
				int company = Integer.parseInt(sd.nextLine());
				switch (company) {
				case 1:
					System.out.println("Choose Product \n 1. Laptop \n 2. Tablet \n 3. Mobile");
					int product =Integer.parseInt( sd.nextLine());
					switch(product) {
					case 1:
						System.out.println( "Choose quantity ");
						int quan = Integer.parseInt(sd.nextLine());
						if(quan<prod.getUsercart1())
						{
							System.out.println("Price is " +(quan*15000)+" Quantity is "+quan);
							System.out.println("Press Y to remove from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully returned to cart");
								int nquan= prod.getaLaptop()+quan;
								prod.setaLaptop(nquan);
								prod.setUsercart1(0);
								
							}
						}
						
						
						
						break;
					case 2:
						System.out.println( "Choose quantity ");
						int quan2 = Integer.parseInt(sd.nextLine());
						if(quan2<prod.getUsercart2())
						{
							System.out.println("Price is " +(quan2*7500)+"Quantity is "+quan2);
							System.out.println("Press Y to Removed from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed to cart");
								int nquan= prod.getaTablet()+quan2;
								prod.setaTablet(nquan);
								prod.setUsercart2(0);
							}
						}
						break;
					
					case 3:
						System.out.println( "Choose quantity ");
						int quan3 = Integer.parseInt(sd.nextLine());
						if(quan3<prod.getUsercart3())
						{
							System.out.println("Price is " +(quan3*3750)+"Quantity is "+quan3);
							System.out.println("Press Y to remove cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed from cart");
								int nquan= prod.getaMobile()+quan3;
								prod.setaMobile(nquan);
								prod.setUsercart3(0);
							}
						}
						
					default:
						break;
					}
					break;	
				case 2:
					System.out.println("Choose Product \n 1. Traditions \n 2. Spiritual \n 3. Scifi");
					int product2 =Integer.parseInt( sd.nextLine());
					switch(product2) {
					case 1:
						System.out.println( "Choose quantity ");
						int quan = Integer.parseInt(sd.nextLine());
						if(quan<prod.getUsercart1())
						{
							System.out.println("Price is " +(quan*750)+"Quantity is "+quan);
							System.out.println("Press Y  remove from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed from cart");
								int nquan= prod.bTraditions+quan;
								prod.setbTraditions(nquan);
								prod.setUsercart1(0);
							}
						}
						break;
					case 2:
						System.out.println( "Choose quantity ");
						int quan2 = Integer.parseInt(sd.nextLine());
						if(quan2<prod.getUsercart2())
						{
							System.out.println("Price is " +(quan2*375)+"Quantity is "+quan2);
							System.out.println("Press Y to remove from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed from cart");
								int nquan= prod.getbSpiritual()+quan2;
								prod.setbSpiritual(nquan);
								prod.setUsercart2(0);
							}
						}
						break;
					case 3:
						System.out.println( "Choose quantity ");
						int quan3 = Integer.parseInt(sd.nextLine());
						if(quan3<prod.getUsercart3())
						{
							System.out.println("Price is " +(quan3*63)+"Quantity is "+quan3);
							System.out.println("Press Y to removed form cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed from cart");
								int nquan= prod.getbScifi()+quan3;
								prod.setbScifi(nquan);
								prod.setUsercart3(0);
							}
						}
						
					default:
						break;
					}
					break;
				case 3:
					System.out.println("Choose Product \n 1. Laptop \n 2. Tablet \n 3. Mobile");
					int product3 =Integer.parseInt( sd.nextLine());
					switch(product3) {
					case 1:
						System.out.println( "Choose quantity ");
						int quan = Integer.parseInt(sd.nextLine());
						if(quan<prod.getUsercart1())
						{
							System.out.println("Price is " +(quan*300)+"Quantity is "+quan);
							System.out.println("Press Y to removed from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed form cart");
								int nquan= prod.getgRice()+quan;
								prod.setgRice(nquan);
								prod.setUsercart1(0);
							}
						}
						break;
					case 2:
						System.out.println( "Choose quantity ");
						int quan2 = Integer.parseInt(sd.nextLine());
						if(quan2<prod.getUsercart2())
						{
							System.out.println("Price is " +(quan2*150)+"Quantity is "+quan2);
							System.out.println("Press Y to removed from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed from cart");
								int nquan= prod.getgPulses()+quan2;
								prod.setgPulses(nquan);
								prod.setUsercart2(0);
							}
						}
						break;
					case 3:
						System.out.println( "Choose quantity ");
						int quan3 = Integer.parseInt(sd.nextLine());
						if(quan3<prod.getUsercart3())
						{
							System.out.println("Price is " +(quan3*95)+"Quantity is "+quan3);
							System.out.println("Press Y to removed from cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully removed from cart");
								int nquan= prod.getgOils()+quan3;
								prod.setgOils(nquan);
								prod.setUsercart3(0);
							}
						}
						
					default:
						break;
					}
					break;

				default:
					break;
				}
				
			
				
					
				
				
			}
}
