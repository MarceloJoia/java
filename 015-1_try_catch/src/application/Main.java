package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		method1();
		
		System.out.println("Fim do programa!");
		sc.close();
	}

	public static void method1() {
		System.out.println("*** Method 1 AND ***");
		
		method2();
		
		System.out.println("*** Method 1 START ***");
	}

	public static void method2() {
		System.out.println("*** Method 2 Start ***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error - Invalid position");
			e.printStackTrace();//Mostra o rastreamento do Error
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Error - Exceção de incompatibilidade de entrada!");
		}
		sc.close();
		
		System.out.println("*** Method 2 AND ***");
	}
}