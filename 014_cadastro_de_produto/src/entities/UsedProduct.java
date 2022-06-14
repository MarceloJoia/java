package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactoryDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactoryDate) {
		super(name, price);
		this.manufactoryDate = manufactoryDate;
	}

	public Date getManufactoryDate() {
		return manufactoryDate;
	}

	public void setManufactoryDate(Date manufactoryDate) {
		this.manufactoryDate = manufactoryDate;
	}

	@Override
	public final String priceTag() {
		return getName()
				+ " (Usado) R$ "
				+ String.format("%.2f", getPrice())
				+ " (Data de fabricação: "
				+ sdf.format(manufactoryDate) + ")";
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" (Usado) $ " + String.format("%.2f", getPrice()));
		sb.append(" (Data de fabricação: ");
		sb.append(sdf.format(manufactoryDate) + ")");

		return sb.toString();
		*/
	}
}
