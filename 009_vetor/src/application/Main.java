package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero de pessoas: ");
		int n = sc.nextInt();
		double[] vector = new double[n];
		
		double amount = 0.0;
		for(int i=0; i<n; i++) {
			int count = i+1;
			System.out.print("Altura da "+ count +"� pessoa: ");
			vector[i] = sc.nextDouble();
			amount += vector[i];
		}
		
		double media = (double)amount / n;
		System.out.printf("Altura m�dia das pessoas = %.2f%n", media);
		
		sc.close();
	}
}
