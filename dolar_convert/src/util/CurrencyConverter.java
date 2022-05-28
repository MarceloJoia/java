package util;

public class CurrencyConverter {
	
	public static final double TAX = 0.06;

	public final static double converter(double dolarPrice, double hawManyDollars) {
		
		return dolarPrice * hawManyDollars + dolarPrice * hawManyDollars * TAX;
		
	}
}
