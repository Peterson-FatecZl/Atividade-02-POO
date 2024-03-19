package view;

import controller.ItemPedido;
import controller.Pedido;
import controller.Produto;

public class Main {

	public static void main(String[] args) {
		// Testando Classe Produto
		Produto produtoSmartphone = new Produto();
		produtoSmartphone.setCodigo(2);
		produtoSmartphone.setValor(999.99);
		produtoSmartphone.setDescricao("Celular Inteligente Com SO Android");
		
		System.out.println(produtoSmartphone.getCodigo());
		System.out.println(produtoSmartphone.getValor());
		System.out.println(produtoSmartphone.getDescricao());
		
		//Testando Classe ItemPedido
		ItemPedido quantidadeCadeiraGamer = new ItemPedido(); 
		quantidadeCadeiraGamer.setQuantidade(5);
		
		ItemPedido quantidadeSmartphone = new ItemPedido(produtoSmartphone, 2);
		
		//Testando Classe Pedido
		Pedido pedido = new Pedido();
		
		pedido.setNumeroNota(123456000);
		
		System.out.println(pedido.getNumeroNota());
		pedido.adicionaItem(quantidadeSmartphone);
		pedido.adicionaItem(quantidadeCadeiraGamer);
		
		//O Total deve ser 9999,93
		System.out.println(pedido.getValorTotal());
	}

}
