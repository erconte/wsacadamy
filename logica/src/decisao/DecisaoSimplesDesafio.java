package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	public static void main(String[] args) {
		
		/*
		 * Capture nome de pessoa e idade
		 * De acordo com as leis eleitorais apresente uma das msgs abaixo:
		 * - Voto obrigat�rio
		 * - Voto facultativo
		 * - Voc� n�o pode votar
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));

		if(idade < 16) {
			System.out.println(nome + " voc� n�o pode votar!");
		}
		if(idade >= 18 && idade < 70) {
			System.out.println(nome + " o seu voto � obrigat�rio");
		} 
		if(idade == 16 || idade == 17 || idade >= 70) {
			System.out.println(nome + " o seu voto � facultativo");
		}

		
}
}
