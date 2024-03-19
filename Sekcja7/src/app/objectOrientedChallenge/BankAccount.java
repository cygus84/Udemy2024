package app.objectOrientedChallenge;

public class BankAccount {
	
	private int accountNumber;
	private int balance;
	private String name;
	private String email;
	private int phoneNumber;
	
	public BankAccount() {
		System.out.println("Start BankAccount");

	}
	
	

	public BankAccount(int accountNumber, int balance, String name, String email, int phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposid(int deposid) {
		balance += deposid;
		System.out.println("Deposid = " + deposid + " balance after = " + balance);
	}
	
	public void withdrawing(int many) {
		if(balance - many < 0) {
			System.out.println("No founds to withdrawing , You only have: " + balance );		
		}else {
			balance -= many;
			System.out.println("Withdrawl: " + many + " processed, Remainding balnce = " + balance);
		}
		
	}



	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + ", email="
				+ email + ", phoneNumber=" + phoneNumber + "]";
	}

	

	
}
