package main;

import java.math.BigDecimal;
//import AccountService;

public class CurrentAccount implements AccountService{
	private BigDecimal balance, overdraft;
	private String id;
	private String accountNum;
	
	public CurrentAccount(String id,String accountNum, BigDecimal balance, BigDecimal  overdraft) {
		this.id = id;
		this.accountNum = accountNum;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
		// 
		if(balance.compareTo(amountToWithdraw) == 0 || balance.compareTo(amountToWithdraw) == 1) {
			// withdraw
			balance = balance.subtract(amountToWithdraw);
			
		}else if(balance.compareTo(amountToWithdraw) == -1){
			// once in this if, when user qualifies to withdraw, we substract that from the overdraft
			BigDecimal balancePlusOverdraft = balance.add(overdraft);
			
			if(amountToWithdraw.compareTo(balancePlusOverdraft) == 0) { 
				// withdraw
				balance = balance.subtract(amountToWithdraw);
			}
			else if(amountToWithdraw.compareTo(balancePlusOverdraft) == -1) {
				// withdraw
			}else {
				// withdraw
				
			}
		}
	}

}
