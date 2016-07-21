package com.abc;

public class SavingsAccount extends Account {

	private final double interestRate = 0.001;
    
    private final double cutoffAmount =1000;

	@Override
	public double interestEarned() {
		 double amt=  sumTransactions();
	        if (amt <= cutoffAmount)
	            return amt *interestRate;
	        else
	            return interestRate* cutoffAmount + (amt - cutoffAmount) * (interestRate*2);
	}

	@Override
	public TypeOfAccount getAccountType() {
		return TypeOfAccount.SAVINGS;
	}

}
