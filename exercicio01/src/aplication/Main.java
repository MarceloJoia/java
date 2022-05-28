package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();
		
		System.out.println("Enter retangle width and heigth: ");
		retangle.width = sc.nextDouble();
		retangle.heigth = sc.nextDouble();
		
		System.out.println("AREA = " + retangle.Area());
		System.out.println("PERIMETER = " + retangle.Perimeter());
		System.out.println("DIAGONAL = " + retangle.Diagonal());
		
		sc.close();
	}
}
