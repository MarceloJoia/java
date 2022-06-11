package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

		Product p1 = new ImportedProduct("NootBook", 4000.00, 20.00);
		Product p2 = new Product("Tablet", 1500.00);
		Product p3 = new UsedProduct("Iphone", 400.00, sdf.parse("15/03/2017"));

		System.out.println(p1.priceTag());
		System.out.println(p2.priceTag());
		System.out.println(p3.priceTag());

		sc.close();

	}

}
