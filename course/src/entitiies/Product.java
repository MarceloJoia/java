package entitiies;

public class Product {

	public String name;
	public Double price;
	public Integer quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(Integer quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}

	/**
	 * Essa classe Product � um Object
	 * Estou sobrepondo a opera��o toString padr�o que j� vem no Object..
	 */
	public String toString() {
		return name + ", $ "
				+ String.format("%.2f", price) + ", "
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
