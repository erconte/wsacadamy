package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	/* Tipos Primitivos (TODOS aqueles que começam com letra minúscula)
	 * boolean - lógico (true/false)
	 * char - um caracter entre apóstrofos ''
	 * 
	 * byte - números inteiros (-127 até 128)
	 * short - números inteiros (-32 mil até +32 mil) 
	 * int - números inteiros (-2 trilhões até +2 trilhões)
	 * long - números inteiros (quintilhões)
	 * 
	 * float - até 5 casas decimais
	 * double - acima disso
	 */
	
	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto: ");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite Qtde: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		double total = (qtde * valor);
		//double imposto = (total*0.17);
		double totalimposto = (total*0.17+(total));
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor total: " + total);
		System.out.println("Imposto: " + (total*0.17));
		System.out.println("Valor total com imposto: " + totalimposto);
	
		/*
		 * Capturem:
		 * -nome do produto
		 * qtde do produto
		 * valor do produto
		 * exibir no final:
		 * -nome do produto
		 * -valor total
		 * -valor do imposto (17% sobre o valor total)
		 */
		
	}

}
