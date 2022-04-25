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
		System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);
		
		double areaDoQuadrado = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);
		
		double areaDoRetangulo = A * B;
		System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);
		
		sc.close();

	}

}
