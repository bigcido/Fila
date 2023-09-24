package model;

public class Pessoa {

	public int id;
	public String nome;
	public float salario;

	public Pessoa(){
		super();
	}
	
	
	public Pessoa(int id, String nome, float salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	

	
}
