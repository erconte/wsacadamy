package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
	
		//String nome = JOptionPane.showInputDialog("nome: ").toUpperCase();
		float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("sal�rio: "));
		//float salario = 0;
		//float fgts = (float)0.8;
		short faltas = Short.parseShort(JOptionPane.showInputDialog("faltas: "));
		if (faltas == 0) {
			salarioBruto = salarioBruto * (float)1.02;
			//System.out.println("Sal�rio Bruto: " + salarioBruto);
		}
		float inss = 0;
		if (salarioBruto <= 1100) {
			inss = salarioBruto * (float) 0.07;	
			//System.out.println(nome + " o seu sal�rio l�quido �: " + (salarioBruto - ((salarioBruto * (float) 0.075) * fgts)));
		} else if (salarioBruto >= 1100 && salarioBruto < 2200){
			inss = salarioBruto * (float) 0.09;
			//System.out.println(nome + " o seu sal�rio l�quido �: " + (salarioBruto - ((salarioBruto * (float) 0.09) * fgts)));
		} else if (salarioBruto >= 2200 && salarioBruto <= 3300) {
			inss = salarioBruto * (float) 0.12;
			//System.out.println(nome + " o seu sal�rio l�quido �: " + (salarioBruto - ((salarioBruto * (float) 0.14) * fgts)) + "\nsal�rio Bruto �: " + salarioBruto);
		} else {
			inss = salarioBruto * (float) 0.14;
			//System.out.println(nome + " o seu sal�rio l�quido �: " + (salarioBruto - ((salarioBruto * (float) 0.14) * fgts)) + "\nsal�rio Bruto �: " + salarioBruto);
		}
		System.out.println("Sal�rio Bruto: " + salarioBruto);
		System.out.println("Sal�rio Liquido: " + (salarioBruto - inss - salarioBruto*0.08));
	}
}
		/*
		 * Exercicio 3:
		 * Receba o valor do sal�rio bruto, o nome de um colaborador e 
		 * a qtde de faltas.
		 * Se n�o houver faltas o salario bruto receber� um aumento de 2%.
		 * Calcule o valor do INSS sobre o sal�rio bruto.
		 * Exiba no final o sal�rio bruto, e o sal�rio liquido (retirando
		 * o INSS e 8% do FGTS)
		 */
