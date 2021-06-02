package br.com.lojaregina.implementacao;
import javax.swing.JOptionPane;

import br.com.lojaregina.modelo.Cliente;

public class TesteCliente {
	public static void main(String[] args) {
		
		//Instanciando o Objeto
		Cliente objeto = new Cliente ();
		
		//Preenchendo o objeto
		objeto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id: ")));
		objeto.setNome(JOptionPane.showInputDialog("Digite o nome: ").toLowerCase());
		objeto.setEmail(JOptionPane.showInputDialog("Digite o email: ").toLowerCase());
		objeto.setTelefone(JOptionPane.showInputDialog("Digite o Telefone: "));
		
		//Retornar os dados
		System.out.println("Id: " + objeto.getId());
		System.out.println("Nome: " + objeto.getNome());
		System.out.println("Email: " + objeto.getEmail());
		System.out.println("Telefone: " + objeto.getTelefone() + "\n");
		System.out.println("Usuário: " + objeto.getUser());
		
	}
}
