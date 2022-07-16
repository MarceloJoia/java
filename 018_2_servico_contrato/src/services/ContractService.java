package services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		// basicQuota = 200
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			double updatedQuata = basicQuota + onlinePaymentService.interest(basicQuota, i);
            
			// basicQuota == 200 + 1% * i=1 = 202
			double fullQuota = updatedQuata + onlinePaymentService.paymentFee(updatedQuata);
			
			// basicQuota == 202 + 2% = 206,04
			Date date = addMonths(contract.getDate(), i);

			contract.addInstallment(new Installment(date, fullQuota));
		}
	}

	private Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);

		return calendar.getTime();
	}
}
