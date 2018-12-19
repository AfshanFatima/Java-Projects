package bankaccountapp;

public class Savings extends Account {
	// list properties specific to the savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	// constructor to initialize settings for the savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		// System.out.println("NEW SAVING ACCOUNT");

		// setting a method here
		setSafetyDepositBox();

		// add sysout below line,you get diff output
		// System.out.println("NAME: " + name);
	}

	@Override
	public void setRate() {
		// System.out.println("Implement rate for Savings");
		rate = getBaseRate() - .25;
	}

	private double getBaseRate() {
		// TODO Auto-generated method stub
		return rate;
	}

	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		// System.out.println(safetyDepositBoxID);
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// list any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		// System.out.println("ACCOUNT TYPE: Savings");
		System.out.println("Your Savings Account features" + "\n Safety Deposit Box ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}
}
