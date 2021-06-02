package br.com.lojaregina.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaregina.modelo.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		
		//Instancia objeto
		Produto produto = new Produto();
		
		//Preenchendo o objeto
		produto.setAll(1, "CHURROS", 5, 10, 50);
		System.out.println("Produto: " + produto.toString());
		System.out.println("10% Desconto: " + produto.getDesconto());
		System.out.println("50% Desconto: " + produto.getDesconto(50));
		System.out.println("Total Venda: " + produto.getTotalVenda());
		System.out.println("Estoque: " + produto.getVerificarEstoque());
		produto.setAtualizarValores(100);
		System.out.println("Após o aumento: " + produto.toString());
		
	}
}
