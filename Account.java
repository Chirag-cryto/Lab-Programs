package poojarybanking;

public class Account {
	private String accountNo;
	private String name;
	private double balance;
	
	public Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited Amount Rs." +amount);
		}else {
			System.out.println("Deposite  amount should be positive");
		}
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException, ArithmeticException {
		if(amount <= 0) {
			throw new ArithmeticException("Withdraw amount should be positive");
		}
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		balance -= amount;
		System.out.println("Withdraw "+ amount);
	}
	public void showBalance() {
		System.out.println(name + "account balance" + balance);
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
}
