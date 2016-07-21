package com.abc;

public class CheckingsAccount extends Account {
	
	private final double interestRate = 0.1;

	@Override
	public double interestEarned() {
		return sumTransactions() * (interestRate/100);
	}

	@Override
	public TypeOfAccount getAccountType() {
		return TypeOfAccount.CHECKINGS;
	}
	
	

}
