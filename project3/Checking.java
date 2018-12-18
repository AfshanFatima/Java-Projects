package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;

	// constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		// System.out.println("NEW CHECKING ACCOUNT");
		setDebitCard(); // setting a method

		// add sysout below line,you get diff output
		// System.out.println("NAME: " + name);
	}

	public void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
		;
	}

	@Override
	public void setRate() {
		// System.out.println("Implement rate for Checking");
		rate = getBaseRate() * .15;
	}

	private double getBaseRate() {
		// TODO Auto-generated method stub
		return rate;
	}

	// List any methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		// System.out.println("ACCOUNT TYPE: Checking");
		System.out.println("Your Checking Account features" + "\n Debit Card Number: " + debitCardNumber
				+ "\n Debit Card PIN: " + debitCardPIN);
	}
}
