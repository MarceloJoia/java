package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos? ");
		int n = sc.nextInt();
		Product[] vector = new Product[n];

		for(int i=0; i<vector.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vector[i] = new Product(name, price);
		}
		
		double soma =0;
		for(int i=0; i<vector.length; i++) {
			soma += vector[i].getPrice();
		}
		
		double avg = soma / vector.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
