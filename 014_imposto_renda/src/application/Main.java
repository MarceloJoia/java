package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte nº " + i + ":");
			System.out.print("Indivíduo ou Empresa (i/e)? ");
			char ch = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Renda anual: ");
			Double renda = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Gastos com saúde: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, renda, gastoSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int funcionario = sc.nextInt();
				list.add(new PessoaJuridica(name, renda, funcionario));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		double tImp = 0;
		for(Pessoa p : list) {
			System.out.println(p.getName()+": $" + String.format("%.2f", p.imposto()));
			tImp += p.imposto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", tImp));

		sc.close();
	}

}
