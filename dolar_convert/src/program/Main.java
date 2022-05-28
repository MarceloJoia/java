package program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do dolar hoje: ");
		double pricePrice = sc.nextDouble();
		
		System.out.print("Quantos dolares deseja comprar? ");
		double hawManyDollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(pricePrice, hawManyDollars));
		
		sc.close();
	}
}
