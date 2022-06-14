package entities;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public final String priceTag() {
		return getName() 
				+ " R$ " 
				+ String.format("%.2f", totalPrice())
				+ " (Taxa de alfândega: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ " + String.format("%.2f", totalPrice()));
		sb.append(" (Taxa de alfândega: $ " + String.format("%.2f", customsFee) + ") ");
		return sb.toString();
		*/
	}
}
