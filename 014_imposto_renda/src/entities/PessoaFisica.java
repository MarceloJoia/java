package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double renda, Double gastoSaude) {
		super(name, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public final Double imposto() {
		if (getRenda() < 20000.0) {
			return getRenda() * 0.15 - gastoSaude * 0.5;
		} else {
			return getRenda() * 0.25 - gastoSaude * 0.5;
		}
	}
}
