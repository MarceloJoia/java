package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxServise;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxServise) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxServise = taxServise;
	}
	
	public void processInvoice(CarRental carRental) {
		//PEGAR O VALOR EM MILISSEGUNDOS
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		//ENCONTRAR A DIFERENÇA EM MILISSEGUNDOS E CONVERTER PARA HORA
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if(hours <= 12.0) {
			//[ Math.ceil(hours) ] ARRENDONDA A HORA PARA CIMA
			basicPayment = Math.ceil(hours) * pricePerHour;
		} 
		else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;
		}
		
		double tax = taxServise.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
