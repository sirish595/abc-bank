package com.abc;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public String getName() {
        return name;
    }

    public Customer openAccount(Account account) {
        accounts.add(account);
        return this;
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public double totalInterestEarned() {
        double total = 0;
        for (Account a : accounts)
            total += a.interestEarned();
        return total;
    }

    public String getStatement() {
        StringBuffer statement = new StringBuffer();
        statement.append(String.format("Statement for %s \n", name));
    	
        double total = 0.0;
        for (Account a : accounts) {
            statement.append("\n").append(statementForAccount(a)).append("\n");
        	total += a.sumTransactions();
        }
        statement.append("\nTotal In All Accounts ").append(toDollars(total));
        
        return statement.toString();
    }

    private String statementForAccount(Account a) {
       StringBuffer statementOutput = new StringBuffer();
       statementOutput.append(a.getAccountType().getTypeOfAccount()).append(" Account\n");
        //Now total up all the transactions
        double total = 0.0;
        for (Transaction t : a.getTransactions()) {
        	statementOutput.append(String.format("   %s %s\n", t.getAmount() < 0 ? "withdrawal" : "deposit", toDollars(t.getAmount())));
            total += t.getAmount();
        }
        statementOutput.append(String.format("  Total %s", toDollars(total)));
        return statementOutput.toString();
    }

    private String toDollars(double d){
        return String.format("$%,.2f", abs(d));
    }
}
