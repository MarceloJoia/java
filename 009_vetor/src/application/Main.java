package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de pessoas: ");
		int n = sc.nextInt();
		double[] vector = new double[n];
		
		double amount = 0.0;
		for(int i=0; i<n; i++) {
			System.out.print("Pessoa: ");
			vector[i] = sc.nextDouble();
			amount += vector[i];
		}
		
		double media = (double)amount / n;
		System.out.printf("AVERAGE HEIGHT = %.2f%n", media);
		
		sc.close();

	}

}
