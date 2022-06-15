package entities;

public class PessoaJuridica extends Pessoa {

	private Integer funcionario;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double renda, Integer funcionario) {
		super(name, renda);
		this.funcionario = funcionario;
	}

	public Integer getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Integer funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public Double imposto() {
		if(getFuncionario() < 10) {
			return  getRenda() * 0.16;
		} else {
			return  getRenda() * 0.14;
		}
	}
}
