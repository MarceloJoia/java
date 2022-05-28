package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Nome do aluno: ");
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		if(student.status() > 60) {
			System.out.println(student);
			System.out.println("PASS");
		} else {
			Double missing = 60.0 - student.status();
			System.out.println(student);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", missing);
		}

		sc.close();
	}
}
