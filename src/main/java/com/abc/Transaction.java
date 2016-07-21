package com.abc;

import java.util.Calendar;
import java.util.Date;

public class Transaction {
    public final double amount;

    private Date transactionDate;
    
    private TransactionType type;
    

    public Transaction(double amount, TransactionType type, Date date) {
    	this.type = type;
    	if (amount < 0) {
            throw new IllegalArgumentException(String.format("Transaction amount %d is not a vaild amount, Please enter a valid positive number", amount));
        }
        if (type == TransactionType.WITHDRAW) {
            this.amount = -amount;
        } else {
            this.amount = amount;
        }
        this.transactionDate = date;
    }
    
    public Transaction(double amount, TransactionType transactionType) {

        this(amount, transactionType, DateProvider.getInstance().now());

    }
    
    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public TransactionType getTransactionType() {
        return this.type;
    }


    public double getAmount() {
        return amount;
    }

}
