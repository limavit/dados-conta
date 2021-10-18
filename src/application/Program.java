package application;

import java.util.Scanner;

import model.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int numberAcc = sc.nextInt();
		System.out.println("Holder: ");
		String holderAcc = sc.next();
		System.out.print("Initial Balance: ");
		double balanceAcc = sc.nextDouble();
		System.out.print("Withdraw limit");
		double withdrawAcc = sc.nextDouble();
		
		
		Account acc = new Account(numberAcc, holderAcc, balanceAcc, withdrawAcc);
		
		try {
			System.out.print("Enter amount withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.print("New balance: ");
			System.out.println(acc.getBalance());
		} catch (DomainException e) {
			// TODO: handle exception
			System.out.println("Erro ao efetuar a operação: " + e.getMessage());
		}
		sc.close();

	}

}
