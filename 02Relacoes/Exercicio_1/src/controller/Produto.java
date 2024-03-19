package controller;

public class Produto {

	private int codigo;
	private double valor;
	private String descricao;
	
	//Contrutores
	public Produto() {
		super();
		this.codigo = 0;
		this.valor = 0;
		this.descricao = "";
	}
	
	//Métodos
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




















}
