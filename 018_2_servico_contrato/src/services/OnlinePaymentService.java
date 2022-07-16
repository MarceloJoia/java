package services;

public interface OnlinePaymentService {

	// TAXA DE PAGAMENTO 2%
	double paymentFee(double amount);

	// JUROS SOBRE O PARCELAMENTO
	double interest(double amount, int months);

}
