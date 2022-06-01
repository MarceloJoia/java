package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vector = new Aluguel[10];//Created vector with 10 units
		
		System.out.print("Número de quartos: ");//How many rooms?
		int N = sc.nextInt();
				
		for(int i=1; i<=N; i++) {
			System.out.println();
			System.out.println("Alugado #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vector[room] = new Aluguel(name, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i=0; i<10; i++) {
			if(vector[i] != null) {
				System.out.println(vector[i]);
			}
		}
		
		sc.close();

	}

}
