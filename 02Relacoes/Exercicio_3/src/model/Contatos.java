package model;

public class Contatos {

	private String nome;
	private String telefone;
	private String email;
	
	//Construtores
	public Contatos() {
		super();	
	}	

	public Contatos(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "Contato: Nome = " + nome + ", Telefone = " + telefone + ", Email = " + email;
	}
}
