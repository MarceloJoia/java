package entities;

public class SavingsAccount extends Account {

	// Conta Poupança
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	// taxa de juro
	public void updateBalance() {
		balance += balance * interestRate;
	}

	// Saque
	@Override
	public final void withDraw(Double amount) {
		balance -= amount;
	}
}
