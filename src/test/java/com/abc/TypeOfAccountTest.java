package com.abc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeOfAccountTest {

	@Test
	public void testGetTypeOfAccount() {
		assertEquals("Checkings", TypeOfAccount.CHECKINGS.getTypeOfAccount());
		assertEquals("Savings", TypeOfAccount.SAVINGS.getTypeOfAccount());
		assertEquals("Maxi Savings", TypeOfAccount.MAXI_SAVINGS.getTypeOfAccount());
	}

}
