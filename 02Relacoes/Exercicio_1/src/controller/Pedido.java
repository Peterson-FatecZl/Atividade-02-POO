package controller;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> listaDePedidos = new ArrayList<ItemPedido>();

	// Construtores
	public Pedido() {
		this.numeroNota = 0;
		this.valorTotal = 0;
	}

	// Métodos
	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
		System.out.println("Número de Nota Registrado");
	}

	public double getValorTotal() {
		if (this.listaDePedidos.isEmpty()) {
			System.err.println("A Lista De Pedidos Está Vazia");
			return 0;

		} else {
			for (int i = 0; i < this.listaDePedidos.size(); i++) {
				//para cada item será calculado seu valor multiplicado pela sua quantidade
				double valorProduto = (listaDePedidos.get(i).produto.getValor());
				int quantidadeProduto = listaDePedidos.get(i).getQuantidade();
				valorTotal += valorProduto * quantidadeProduto;
			}
			return valorTotal;
		}

	}

	public void adicionaItem(ItemPedido Item) {
		this.listaDePedidos.add(Item);
		System.out.println("Item Adicionado a Lista de Pedidos");
	}

}
