package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import services.ContractService;
import services.PaypalService;

public class program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Dados do contrato");
		System.out.print("N�mero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		//System.out.println(sdf.format(date));
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Em quantos meses? ");
		int months = sc.nextInt();
		
		// INJE��O DE DEPEND�NCIA NO CONSTRUTOR
		ContractService cs = new ContractService(new PaypalService());

		cs.processContract(contract, months);
		
		System.out.println("Parcelas:");
		for(Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		
		sc.close();
	}

}
