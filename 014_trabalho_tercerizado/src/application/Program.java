package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitis.Employee;
import entitis.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<Employee>();

		System.out.println("Entre com o número de funcionários:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Empregado #" + i + " dados:");

			System.out.print("Terceirizado? (s/n)");
			char os = sc.next().charAt(0);// Muita ATENÇÃO com essa estrutura!

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Horas: ");
			int hours = sc.nextInt();

			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();

			if (os == 's') {
				System.out.print("Cobrança adicional: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}

		System.out.println("\nPagamentos:");
		/*
		 * for (Employee emp : list) { System.out.print(emp); }
		 */
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}
