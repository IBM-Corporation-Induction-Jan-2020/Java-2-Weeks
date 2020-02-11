
public class ReportsProduct {

	void repo(UserParameters par) {
	
		System.out.println("Amazon(Electronics: Laptop 20k "+ par.getaLaptop() +", Tablet 10k "+par.getaTablet()+", Mobile 5k "+par.getaMobile() +")");
		System.out.println("Books: Traditions 1000 " + par.getbTraditions() +", Spiritual 500 "+ par.getbSpiritual()+", SciFi 250 "+ par.getbScifi() +")");
		System.out.println("SnapDeal (Groceries: Rice 400 "+par.getgRice()+", Pulses 200 "+par.getgPulses()+", Oils 125 "+par.getgOils()+")");
		
		System.out.println("Total sales are : " + par.getSale());
	}
	
	
	
}
