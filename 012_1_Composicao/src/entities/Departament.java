package entities;

public class Departament {
	private String name;

	public Departament() {
	}

	public Departament(String name) {
		this.name = name;
	}

	public String gatName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
