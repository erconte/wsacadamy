package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		//int x = 0;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor tabuada: "));
		for (int cont=0; cont<100; cont++) {
			System.out.println("Tabuada de: " + valor + "x" + cont + "=" + (cont*valor));
		}
		/*
		 * Sintaxe do for:
		 * 1- Vari�vel que vai contar
		 * 2- Condi��o (at� quando)
		 * 3- Como ele vai contar?
		 */
	}
}
