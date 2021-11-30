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
		// TODO Auto-generated method stub
		System.out.println(amountToWithdraw);
	}

}
