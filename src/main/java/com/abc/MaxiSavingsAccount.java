package com.abc;

public class MaxiSavingsAccount extends Account{
	
	private final double firstInterestRate = 0.02;
    private final double secondInterestRate = 0.05;
    private final double thirdInterestRate = 0.10;
    
    private final double cutoffAmount = 1000;
	
    
    @Override
	public double interestEarned() {
		double amt = sumTransactions();
		if(amt<=cutoffAmount){
			return amt*firstInterestRate;
		}else if(amt<=cutoffAmount*2){
			return cutoffAmount*firstInterestRate+(amt-cutoffAmount)*secondInterestRate;
		}else{
			return cutoffAmount*firstInterestRate + cutoffAmount*secondInterestRate + (amt-(cutoffAmount*2))*thirdInterestRate;
		}
	}
	
	@Override
	public TypeOfAccount getAccountType() {
		return TypeOfAccount.MAXI_SAVINGS;
	}

}


//case MAXI_SAVINGS:
//    if (amount <= 1000)
//        return amount * 0.02;
//    if (amount <= 2000)
//        return 20 + (amount-1000) * 0.05;
//    return 70 + (amount-2000) * 0.1;