package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		/*
		 * Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500); Savings
		 * savacc1 = new Savings("Rich Lowe", "987654321", 2000); savacc1.compound();
		 * savacc1.showInfo(); System.out.println("************"); chkacc1.showInfo();
		 */
		// Read the CSV file and then create new accounts based on that data
		String file = "C:\\Users\\saain\\Desktop\\java projects udemy\\project 3\\NewBankAccounts.csv";

		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			// System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name + " " + sSN + " " + accountType + " $" +
			// initDeposit);
			if (accountType.equals("Savings")) {
				// System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				// System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}

			// System.out.println(accountHolder[0]);
			// System.out.println(accountHolder[1]);
			// System.out.println(accountHolder[2]);
			// System.out.println(accountHolder[3]);
		}

		for (Account acc : accounts) {
			System.out.println("\n******************");
			acc.showInfo();
		}

		// accounts.get(5).showInfo();
		// IMP this is how you test for one element.
		// for random elements
		//accounts.get((int) Math.random() * accounts.size()).deposit(1000);
		//accounts.get((int) Math.random() * accounts.size()).deposit(1500);
	}
}
