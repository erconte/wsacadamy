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
			System.out.printf("%s seu IMC �: %.2f\n", nome, imc);
		} while(JOptionPane.showConfirmDialog(
				null, "Continuar?", "Titulo", JOptionPane.YES_NO_CANCEL_OPTION)==0);
		//null = se eu tivesse criado uma tela, eu colocaria o nome da tela ali pra servir como refer�ncia para mostrar a tela do show confirm.
		//null = to falando que n�o tenho janela, e ele usa o espa�o do meu monitor - centralizado na tela.
		//n�o � boa pr�tica criar vari�vel dentro de um la�o de repeti��o.
		
		
		
		
		
	}

}
