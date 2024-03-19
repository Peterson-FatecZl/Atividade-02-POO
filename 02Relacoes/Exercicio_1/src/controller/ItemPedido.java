package controller;

public class ItemPedido {
	
	protected Produto produto = new Produto();
	private int quantidade;
	
	//Construtores
	public ItemPedido() {
		this.produto.setCodigo(1);
		this.produto.setValor(1599.99);
		this.produto.setDescricao("Cadeira Gamer Ergonômica Preta");
		this.quantidade = 0;
	}
	
	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public ItemPedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 0;
	}

	//Métodos
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
