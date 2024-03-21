package app.challenge;

public class Customer {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	
	public Customer() {
		this("Nobody", 0,"nobody@nowhere.com");
	}
	
	public Customer(String name, String emailAddress) {
		this(name, 1000, emailAddress);
	}
		
	public Customer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
}
