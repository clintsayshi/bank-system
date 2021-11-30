package main;

import java.math.BigDecimal;

public class SavingsAccount implements AccountService{
	private BigDecimal balance;
	private String id;
	public String accountNum;
	
	public SavingsAccount(String id,String accountNum, BigDecimal balance) {
		this.id = id;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNum;
	}

	@Override
	public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
		
		balance = balance.subtract(amountToWithdraw);
		
		System.out.println(amountToWithdraw + " withdrawn from Account No. " + accountNum);
		System.out.println("New Balance is: " + balance);
		
	}

}
