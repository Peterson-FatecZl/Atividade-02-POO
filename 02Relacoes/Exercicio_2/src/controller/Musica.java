package controller;

public class Musica {

	private String nome;
	private String autor;
	private String gravadora;

	public Musica(String nome, String autor, String gravadora) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.gravadora = gravadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

}