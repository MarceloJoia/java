package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<Product>();

		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto #" + i + ":");
			System.out.print("Novo, Usado ou Importado (n/u/i)? ");
			char tp = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Preço: ");
			Double price = sc.nextDouble();

			if (tp == 'n') {
				list.add(new Product(name, price));
			} else if (tp == 'i') {
				System.out.print("Taxa alfandegária: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");

		 for(Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();

	}

}
