package entitis;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {// Salário líquido
		 double netSalery = grossSalary;
		 netSalery -= tax;
		 return netSalery;
	}

	public void IncreaseSalary(double aumento) {// Aumentar salário
		this.grossSalary = grossSalary +(grossSalary * (aumento / 100.0));
	}

	public String toString() {
		return name + ", $ " 
					+ String.format("%.2f", NetSalary());
	}
}
