package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		
		//char operador = JOptionPane.showInputDialog("Operador: ").charAt(0);
		String operador = JOptionPane.showInputDialog("Operador: ");
		short num1 = Short.parseShort(JOptionPane.showInputDialog("num1: "));
		short num2 = Short.parseShort(JOptionPane.showInputDialog("num2: "));
		//int resultado = 0;
		
		//if (operador=='*') se fosse com o CHAR
		if (operador.equals("+")) {
			//resultado = (num1 + num2);
			System.out.println("O resultado �: " + (num1 + num2));
		} else if (operador.equals("=")) {
			//resultado = (num1 - num2);
			System.out.println("O resultado �: " + (num1 - num2));			
		} else if (operador.equals("/")) {
			//resultado = (num1 / num2);
			System.out.println("O resultado �: " + (num1 / num2));
		} else if (operador.contentEquals("*")) {
			//resultado = (num1 * num2);
			System.out.println("O resultado �: " + (num1 * num2));
		}
	}

}
