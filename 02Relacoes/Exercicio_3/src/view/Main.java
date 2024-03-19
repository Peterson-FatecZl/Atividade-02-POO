package view;

import controller.AgendaTelefonica;
import model.Contatos;

public class Main {

	public static void main(String[] args) {

	AgendaTelefonica agenda = new AgendaTelefonica();
	
	//Massa De dados Aleatória
	Contatos contato1 = new Contatos("Nome1","(11)91111-1111","Nome1@email.com.br");
	Contatos contato2 = new Contatos("Nome2","(11)92222-1111","Nome2@email.com.br");
	Contatos contato3 = new Contatos("Nome3","(11)93333-1111","Nome3@email.com.br");
	Contatos contato4 = new Contatos("Nome4","(11)94444-1111","Nome4@email.com.br");
	Contatos contato5 = new Contatos("Nome5","(11)95555-1111","Nome5@email.com.br");
	
	//Teste Método adicionaContato
	agenda.adicionaContato(contato1);
	agenda.adicionaContato(contato2);
	agenda.adicionaContato(contato3);
	agenda.adicionaContato(contato4);
	agenda.adicionaContato(contato5);
		
	agenda.removeContato(contato1);
	agenda.removeContato(contato3);
	
	System.out.println(agenda.buscaContato(contato5));
	
	}

}
