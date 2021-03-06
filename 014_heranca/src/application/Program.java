package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Marcelo", 1000.0);
		acc.withDraw(200.0);
		System.out.println("Saldo da conta F?sica: " + acc.getBalance());
		
		Account acc1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc1.withDraw(200.0);
		System.out.println("Saldo da Poupan?a: " + acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Telma", 1000.0, 500.0);
		acc2.withDraw(200.0);
		System.out.println("Saldo da conta Juridica: " + acc2.getBalance());

		/*
		Account acc = new Account(1001, "Marcelo", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Telma", 0.0, 500.0);

		/*
		 * UpCasting ? pegar um Objeto do tipo BusinessAccount e atribui-lo para uma
		 * variavel do tipo Account.
		 */
		/*
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		*/
	}
}
