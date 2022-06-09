package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.err.print("Digite o nome do departamento: ");
		String departamentName = sc.nextLine();

		System.out.println("Insira os dados do trabalhador:");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Sal�rio base: ");
		Double baseSalary = sc.nextDouble();
		// Instanciar o trabalhador
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

		System.out.print("Quantos contratos para este trabalhador? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++ ) {
			System.out.println("Insira os dados do contrato n� "+ i +":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Dura��o (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);//Associar o contrato com o trabalhador
		}
		
		System.out.println();
		System.out.println("Insira o m�s e o ano para calcular a renda (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: "+ worker.getDepartament().getName());
		System.out.printf("Renda para " + monthAndYear + ": R$ " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}
}
