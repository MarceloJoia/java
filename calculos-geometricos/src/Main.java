import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaDoTriangulo = A * C / 2;
		System.out.printf("TRIANGULO: %.3f%n", areaDoTriangulo);
		
		double areaDoCirculo = 3.14159 * Math.pow(C, 2);
		System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);
		
		double areaDoTrapezio = (A + B) * C / 2;
		System.out.printf("CIRCULO: %.3f%n", areaDoTrapezio);
		
		
		sc.close();

	}

}
