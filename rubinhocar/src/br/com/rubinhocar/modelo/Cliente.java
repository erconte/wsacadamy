package br.com.rubinhocar.modelo;

public class Cliente {

	private String nome;
	private int idade;
	private boolean status;
	//sintaxe:
	//<modificador><tipo do retorno><nome do método>(<tipo do param><nome do param>...){ }
	
	public String retornarCliente () {
		return nome;
	}
	public void preencherCliente (String banana) {
		nome = banana.toUpperCase();
	}
	
}
