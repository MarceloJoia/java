import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horaTrabalhada = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horaTrabalhada * valorHora; 
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();
	}

}
