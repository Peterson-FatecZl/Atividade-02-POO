package controller;

import java.util.ArrayList;
import java.util.List;

import model.Contatos;

public class AgendaTelefonica {

	private List<Contatos> listaDeContatos = new ArrayList<Contatos>();

	public AgendaTelefonica() {
		super();
	}
	
	//Métodos
	public void adicionaContato(Contatos contato) {
		listaDeContatos.add(contato);
		System.out.println("Contato Adicionado!");
	}
	
	public void removeContato(Contatos contato) {
		listaDeContatos.remove(contato);
		System.out.println("Contato Removido com Sucesso!");
	}
	
	public Contatos buscaContato(Contatos contato) {
		int indiceDoContato = listaDeContatos.indexOf(contato);
		Contatos contatoBuscado = listaDeContatos.get(indiceDoContato);
		return contatoBuscado;
	}
}
