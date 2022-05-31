package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Digite o n�mero da conta: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Digite o titular da conta: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		System.out.print("Existe um dep�sito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 's') {
			System.out.print("Insira o valor do dep�sito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, holderName, initialDeposit);
		} else {
			account = new Account(numberAccount, holderName);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Insira um valor de dep�sito: ");
		double deposit = sc.nextDouble();
		account.addDeposit(deposit);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Insira um valor de retirada: " );
		double saque = sc.nextDouble();
		account.withdraw(saque);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		
		sc.close();

	}

}
