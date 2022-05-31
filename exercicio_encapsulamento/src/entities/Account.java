package entities;

public class Account {
	
	private int numberAcount;
	private String holderName;
	private double deposit;
	
	public Account(int numberAcount, String holderName, double initialDeposit) {
		this.numberAcount = numberAcount;
		this.holderName = holderName;
		addDeposit(initialDeposit);
	}
	
	public Account(int numberAcount, String holderName) {
		this.numberAcount = numberAcount;
		this.holderName = holderName;
	}

	public int getNumberAcount() {
		return numberAcount;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void addDeposit(double amount) {
		deposit += amount;
	}
	
	public void withdraw (double amount) {
		deposit -= amount + 5;
	}

	public String toString() {
		return "Conta "
				+ numberAcount
				+ ", Titular: " 
				+ holderName
				+ ", Saldo: $ "
				+ String.format("%.2f", deposit);
	}
}
