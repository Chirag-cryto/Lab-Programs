package poojarybanking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDmain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account("60206" , "Chirag" , 10000.00);
		
		
		while (true) {
			System.out.println("\n Bank Menu");
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			
			try {
				int choice = scanner.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter Deposite amount: ");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					break;
					
				case 2:
					System.out.println("Enter withdrawal amount: ");
					double withdrawalAmount = scanner.nextDouble();
					try {
						account.withdraw(withdrawalAmount);
					} catch(InsufficientBalanceException | ArithmeticException e) {
						System.out.println("Error: "+ e.getMessage());
					}
					break;
					
				case 3:
					account.showBalance();
					break;
					
				case 4:
					System.out.println("thank you");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice");
				}
			}catch(InputMismatchException e) {
				System.out.println("Error:Invalid Input");
				scanner.nextLine();
			}
		}
	}
}

