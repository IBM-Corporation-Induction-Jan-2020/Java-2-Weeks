import java.util.HashMap;

public class User {

	String name;
	String contact;
	String email;
	
	HashMap<String, Integer> l = new HashMap<String, Integer>();

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String contact, String email) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
	
}
