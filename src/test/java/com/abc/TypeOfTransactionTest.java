package com.abc;



import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TypeOfTransactionTest {
	
	@Test
	public void transactionType(){
		assertEquals("deposit", TransactionType.DEPOSIT.getType());
		assertEquals("withdraw", TransactionType.WITHDRAW.getType());
	}

	

}
