import java.util.Scanner;

public class PurchaseProduct {

	Scanner sd = new Scanner(System.in);
	
	public void showUser(UserParameters para) {
		System.out.println("Showing availabe users \n"+para);
	}
	
	void chooseUser(UserParameters para){
		
		String option ="y";
		UserParameters prod = new UserParameters();
		
		System.out.println("Amazon(Electronics: Laptop 20k "+ prod.getaLaptop() +", Tablet 10k "+prod.getaTablet()+", Mobile 5k "+prod.getaMobile() +")");
		System.out.println("Books: Traditions 1000 " + prod.getbTraditions() +", Spiritual 500 "+ prod.getbSpiritual()+", SciFi 250 "+ prod.getbScifi() +")");
		System.out.println("SnapDeal (Groceries: Rice 400 "+prod.getgRice()+", Pulses 200 "+prod.getgPulses()+", Oils 125 "+prod.getgOils()+")");
		
		int total =0;
		System.out.println("Enter User Name");
		
		String name = sd.nextLine();
		
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
						if(quan<prod.getaLaptop())
						{
							System.out.println("Price is " +(quan*20000)+" Quantity is "+quan);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= (prod.getaLaptop()-quan);
								prod.setaLaptop(nquan);
								prod.setUsercart1(quan);
								total = total +(quan*20000);
								;
							}
						}
						
						break;
					
					case 2:
						System.out.println( "Choose quantity ");
						int quan2 = Integer.parseInt(sd.nextLine());
						if(quan2<prod.getaTablet())
						{
							System.out.println("Price is " +(quan2*10000)+"Quantity is "+quan2);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getaTablet()-quan2;
								prod.setaTablet(nquan);
								prod.setUsercart2(quan2);
								total = total +(quan2*10000);
							}
							
						}
						break;
					case 3:
						System.out.println( "Choose quantity ");
						int quan3 = Integer.parseInt(sd.nextLine());
						if(quan3<prod.getaMobile())
						{
							System.out.println("Price is " +(quan3*5000)+"Quantity is "+quan3);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getaMobile()-quan3;
								prod.setaMobile(nquan);
								prod.setUsercart3(quan3);
								total = total +(quan3*5000);
							}
						
						}
						break;
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
						if(quan<prod.bTraditions)
						{
							System.out.println("Price is " +(quan*1000)+"Quantity is "+quan);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.bTraditions-quan;
								prod.setbTraditions(nquan);;
								prod.setUsercart1(quan);
								total = total +(quan*1000);
							}
						}
						break;
					case 2:
						System.out.println( "Choose quantity ");
						int quan2 = Integer.parseInt(sd.nextLine());
						if(quan2<prod.getbSpiritual())
						{
							System.out.println("Price is " +(quan2*500)+"Quantity is "+quan2);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getbSpiritual()-quan2;
								prod.setbSpiritual(nquan);;
								prod.setUsercart2(quan2);
								total = total +(quan2*500);
							}
						}
						break;
					case 3:
						System.out.println( "Choose quantity ");
						int quan3 = Integer.parseInt(sd.nextLine());
						if(quan3<prod.getbScifi())
						{
							System.out.println("Price is " +(quan3*250)+"Quantity is "+quan3);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getbScifi()-quan3;
								prod.setbScifi(nquan);;
								prod.setUsercart3(quan3);
								total = total +(quan3*250);
							}
						}
						break;
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
						if(quan<prod.getgRice())
						{
							System.out.println("Price is " +(quan*400)+"Quantity is "+quan);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getgRice()-quan;
								prod.setgRice(nquan);;
								prod.setUsercart1(quan);
								total = total +(quan*400);
							}
						}
						break;
					case 2:
						System.out.println( "Choose quantity ");
						int quan2 = Integer.parseInt(sd.nextLine());
						if(quan2<prod.getgPulses())
						{
							System.out.println("Price is " +(quan2*200)+"Quantity is "+quan2);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getgPulses()-quan2;
								prod.setgPulses(nquan);;
								prod.setUsercart2(quan2);
								total = total +(quan2*200);
							}
						}
						break;
					case 3:
						System.out.println( "Choose quantity ");
						int quan3 = Integer.parseInt(sd.nextLine());
						if(quan3<prod.getgOils())
						{
							System.out.println("Price is " +(quan3*125)+"Quantity is "+quan3);
							System.out.println("Press Y to Add to cart");
							String selection = sd.nextLine();
							if(selection.equalsIgnoreCase(option))
							{
								System.out.println("Succesfully added to cart");
								int nquan= prod.getgOils()-quan3;
								prod.setgOils(nquan);;
								prod.setUsercart3(quan3);
								total = total +(quan3*125);
							}
						}
						break;
					default:
						break;
					}

					break;
				default:
					break;
				}
				
			
				prod.setSale(total);
					System.out.println("Total");
				
				
			}
		
	}

