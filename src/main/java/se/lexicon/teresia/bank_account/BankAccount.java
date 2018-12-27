package se.lexicon.teresia.bank_account;

public class BankAccount {

	private String accountNumber;
	private double balance;// will get the default value of 0
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double depositFunds(double funds) {
		double currentBalance = getBalance();
		if (funds > 0) {
			setBalance(currentBalance + funds);
		}
		else System.out.println("Invalid deposition");
		return getBalance();
	}

	public double withdrawFunds(double funds) {
		double currentBalance = getBalance();
		if (currentBalance >= funds)
			setBalance(currentBalance - funds);
		else
			System.out.println("Not enough money on your account.");
		return getBalance();
	}

	public void printAccountInfo() {
		System.out.println("Accountnumber: " + getAccountNumber());
		System.out.println("Customer name: " + getCustomerName());
		System.out.println("Balance: " + getBalance());
		System.out.println("Phone number: " + getPhoneNumber());
		System.out.println("Email: " + getEmail());
	}

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("12344", 0, "Teresia Gable", "t@g.se", "282422");
		myAccount.printAccountInfo();
		myAccount.withdrawFunds(100);
		myAccount.depositFunds(1000);
		myAccount.printAccountInfo();
		myAccount.withdrawFunds(60);
		myAccount.printAccountInfo();

	}

}
