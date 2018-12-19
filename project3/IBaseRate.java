package bankaccountapp;

public interface IBaseRate {
	// List common properties for savings and checking account

	// constructor to set base properties and initialize the account

	// list common methods

	// write a method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}

}
