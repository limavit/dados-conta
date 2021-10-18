package application;

import java.util.Scanner;

import model.Account;

public class Program {

	public static void main(String[] args) {
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
		
		
		sc.close();

	}

}
