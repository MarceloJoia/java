package util;

public class Calculator {
	
	public static final double PI = 3.14159;

	public static double circunference(double radius) {
		return 2 * PI * radius; //FORMULA DA CIRCONFERENCIA
	}
	
	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3))/3; //FORMULA DO VOLUME
	}
}
