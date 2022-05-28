package entities;

public class Retangle {

	public double width;
	public double heigth;

	public String  Area() {
		String areaFormatada = String.format("%.2f",width * heigth);
		return areaFormatada;
	}

	public String Perimeter() {
		String resultPerimeter = String.format("%.2f", 2 * width + 2 * heigth);
		return resultPerimeter;
	}
	
	public String Diagonal() {
		String resultDiagonal = String.format("%.2f", Math.sqrt(width * width + heigth * heigth));
		return resultDiagonal;
	}
}
