package br.com.rubinhocar.implementacao;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Cliente;
import br.com.rubinhocar.modelo.Veiculo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente nome = new Cliente();
		nome.preencherCliente(JOptionPane.showInputDialog("Digite o nome do Cliente: "));
		//System.out.println("Nome �: " + cliente.retornarCliente());
		
		Veiculo objeto = new Veiculo (); // instancia um objeto (pegou do molde e crio um objeto na mem�ria)
		objeto.preencherModelo(JOptionPane.showInputDialog("Digite o Modelo: "));
		System.out.println("Nome do cliente �: " + nome.retornarCliente() + " adquiriu: " + objeto.retornarModelo());
	}
	
}
