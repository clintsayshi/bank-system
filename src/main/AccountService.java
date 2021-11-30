package main;

import java.math.BigDecimal;

public interface AccountService {

	//public BigDecimal balance = new BigDecimal(0);
	
	public void withdraw(String accountNum, BigDecimal amountToWithdraw);
}
