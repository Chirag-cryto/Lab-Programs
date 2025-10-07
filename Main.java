package bankoperation;

public class Main {  
	public static void main(String[] args)  
	{  
		Bank bank = new Bank();  
		bank.createAccount(3056, 5000);    
		bank.createAccount(9944, 6700);  
		bank.deposit(3056, 3000);  
		bank.withdraw(9944, 500);  
		System.out.println("Final balances:");  
		bank.checkBalance(3056);  
		bank.checkBalance(9944);  
		}  
	}  
