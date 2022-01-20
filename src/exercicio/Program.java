package exercicio;

import java.util.Scanner;

import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter account number: ");
			int number = sc.nextInt();
	
			System.out.print("Enter account holder name: ");
			String holder = sc.next();
			
			System.out.print("Enter account balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Enter account withdraw limit: ");
			double limit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, limit);
			
			System.out.println();
			System.out.println("Actual balance: " + account.getBalance());
			System.out.print("Enter withdraw amount: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			System.out.println("Actual balance: " + account.getBalance());
			
		}
		catch(WithdrawException e) {
			System.out.println("Error in withdraw operation: " + e.getMessage());
		}
		sc.close();
	}

}
