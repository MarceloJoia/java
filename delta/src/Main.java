import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double delta = 0.0;
		
		double a =sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("X1 %.2f%n", x1);
		System.out.printf("X2 %.2f%n", x2);
		
		sc.close();

	}

}
