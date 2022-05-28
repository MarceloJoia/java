package entities;

public class Student {
	public String name;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	public Double status() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", status());
	}
}

