
public class UserParameters {

	String name;
	String contactNumber;
	String mailId;
	
	static int aLaptop = 10;
	static int aTablet = 10;
	static int aMobile = 10;
	
	static int bTraditions = 50;
	static int bSpiritual = 100;
	static int bScifi = 200;
	
	static int gRice = 50;
	static int gPulses = 200;
	 static int gOils = 500;
	 
	 static int usercart1;
	 static int usercart2;
	 static int usercart3;
	  static int sale;
	 
	 public  int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		UserParameters.sale = sale;
	}

	public int getUsercart1() {
		return usercart1;
	}

	public void setUsercart1(int usercart1) {
		this.usercart1 = usercart1;
	}

	public int getUsercart2() {
		return usercart2;
	}

	public void setUsercart2(int usercart2) {
		this.usercart2 = usercart2;
	}

	public int getUsercart3() {
		return usercart3;
	}

	public void setUsercart3(int usercart3) {
		this.usercart3 = usercart3;
	}

	public int getaLaptop() {
		return aLaptop;
	}

	public void setaLaptop(int aLaptop) {
		this.aLaptop = aLaptop;
	}

	public int getaTablet() {
		return aTablet;
	}

	public void setaTablet(int aTablet) {
		this.aTablet = aTablet;
	}

	public int getaMobile() {
		return aMobile;
	}

	public void setaMobile(int aMobile) {
		this.aMobile = aMobile;
	}

	public int getbTraditions() {
		return bTraditions;
	}

	public void setbTraditions(int bTraditions) {
		this.bTraditions = bTraditions;
	}

	public int getbSpiritual() {
		return bSpiritual;
	}

	public void setbSpiritual(int bSpiritual) {
		this.bSpiritual = bSpiritual;
	}

	public int getbScifi() {
		return bScifi;
	}

	public void setbScifi(int bScifi) {
		this.bScifi = bScifi;
	}

	public int getgRice() {
		return gRice;
	}

	public void setgRice(int gRice) {
		this.gRice = gRice;
	}

	public int getgPulses() {
		return gPulses;
	}

	public void setgPulses(int gPulses) {
		this.gPulses = gPulses;
	}

	public int getgOils() {
		return gOils;
	}

	public void setgOils(int gOils) {
		this.gOils = gOils;
	}

	

	public UserParameters() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[name=" + name + ", contactNumber=" + contactNumber + ", mailId=" + mailId + "]";
	}

	

	public UserParameters(String name, String contactNumber, String mailId) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	
	
}
