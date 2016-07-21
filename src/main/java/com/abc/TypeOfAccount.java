package com.abc;

public enum TypeOfAccount {
	
	CHECKINGS("Checkings"), SAVINGS("Savings"), MAXI_SAVINGS("Maxi Savings");

    private String type;

    TypeOfAccount(String type) {
        this.type = type;
    }


    public String getTypeOfAccount() {
        return type;
    }

}
