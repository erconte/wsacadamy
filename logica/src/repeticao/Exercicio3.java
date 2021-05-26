package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		//String email = JOptionPane.showInputDialog("Email: ").toUpperCase();
		String produto = "";
		int qtde=0;
		//float valor=0;
		float valorUni=0;
		
		do {
			produto = JOptionPane.showInputDialog("Produto: ").toUpperCase();
			valorUni = Float.parseFloat(JOptionPane.showInputDialog("Valor Unitário: "));
			qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde: "));
			System.out.printf(nome + " o produto: %s na quantidade de: " + qtde + " com valor unitário de: " + valorUni + "\n" +
			" fica com o total de: " + (valorUni * qtde) ,produto);
			
		} while(JOptionPane.showConfirmDialog(
				null, "Deseja adicionar itens a sua compra?", "Compra", JOptionPane.YES_NO_CANCEL_OPTION)==0);
	}
}
