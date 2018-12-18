package bankaccountapp;

public abstract class Account implements IRate {
	// List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private Double balance;
	
   private	static int index = 10000; // static counter for 5 digit unique id
   private	String accountBalance;
	protected double rate;
	protected String accountNumber;

	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		// copy and remove sysout below line,and add to child classes savings and Acc
		// you get diff output
		// System.out.println("NAME: " + name);
		// System.out.println("NEW ACCOUNT: ");
		// delete both up sys and type this.
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		// System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" +
		// balance);
		// we took above prtln so no output,and did showinfo method added savacc1
		// chkacc1 showinfo in BankACcApp

		// set account number

		// This is an integer that index will be incremented every time we create a new
		// account.
		index++;
		this.accountNumber = setAccountNumber();
		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		// remove above sysout and put in checking and savings
		setRate();
	}

	public abstract void setRate();

	// we don't want it to get it accessed by outside
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}

	public void compound() { // compound=balance*rates
		double accruedInterest = balance + (rate / 100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}

	// list common methods - transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $ " + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $ " + "to " + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance + "\nRATE: "
				+ rate + "%");

	}

}
