package com.abc;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    
    public List<Transaction> transactions;

    public Account() {
        this.transactions = new ArrayList<Transaction>();
    }
    
    public List<Transaction> getTransactions() {
		return transactions;
	}

    public abstract TypeOfAccount getAccountType();
    
    public abstract double interestEarned();
    
    


	public void deposit(double amount, TransactionType type) {
        Transaction trans = new Transaction(amount, type.DEPOSIT);
        this.transactions.add(trans);
    }

	public void withdraw(double amount, TransactionType type) {
		Transaction trans = new Transaction(amount, type.WITHDRAW);
        this.transactions.add(trans); 
}

    
    
    public double sumTransactions() {
    	double amount = 0.0;
        for (Transaction t: transactions)
            amount += t.amount;
        return amount;
    }

    

    

}
