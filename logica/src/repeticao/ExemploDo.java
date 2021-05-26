package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {
	public static void main(String[] args) {
		String nome = "";
		float peso=0;
		float altura=0;
		float imc=0;
		do {
			nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
			peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
			imc = peso / (altura*altura);
			System.out.printf("%s seu IMC é: %.2f\n", nome, imc);
		} while(JOptionPane.showConfirmDialog(
				null, "Continuar?", "Titulo", JOptionPane.YES_NO_CANCEL_OPTION)==0);
		//null = se eu tivesse criado uma tela, eu colocaria o nome da tela ali pra servir como referência para mostrar a tela do show confirm.
		//null = to falando que não tenho janela, e ele usa o espaço do meu monitor - centralizado na tela.
		//não é boa prática criar variável dentro de um laço de repetição.
		
		
		
		
		
	}

}
