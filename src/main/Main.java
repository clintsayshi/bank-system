package main;                                                                                                                             
                                                                                                                                          
import java.math.BigDecimal;                                                                                                              
import javax.swing.*;                                                                                                                     
                                                                                                                                          
public class Main {                                                                                                                       
                                                                                                                                          
	public static void main(String[] args) {                                                                                              
		String accountNum;                                                                                                                
		BigDecimal amountToWithdraw;                                                                                                      
		                                                                                                                                  
		// Welcome Menu                                                                                                                   
		Welcome();                                                                                                                        
		int enterAcc = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));                                             
		accountNum = enterAcc + "";                                                                                                       
		//amountToWithdraw = new BigDecimal(Double.parseDouble(JOptionPane.showInputDialog("Enter Amount to withdraw")));                 
		                                                                                                                                  
		SystemDB bank = SystemDB.getInstance();                                                                                           
		//Object [] accs = (Object[]) bank.getAccounts();         

        
        System.out.println(bank.getAccounts().length);
                                                                                                                                          
		/* for(int i = 0;i < accs.length; i++) {                                                                                             
			AccountService acc = (AccountService) accs[i];                                                                                
			if(acc.accountNum.equals(accountNum)) {                                                                                       
				                                                                                                                          
			}                                                                                                                             
		}  */                                                                                                                                
		                                                                                                                                  
		//System.out.println("Account Number: " + accountNum + "\nWithdrawal: " + amountToWithdraw);                                      
	}                                                                                                                                     
                                                                                                                                          
	public static void Welcome() {                                                                                                        
		                                                                                                                                  
		System.out.print("Welcome to Eviro Banking Service\n");                                                                           
	}                                                                                                                                     
}                                                                                                                                         
   
