package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int tentativa = 0;
		int jogador2 = 0;
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero J1: "));
		//if (jogador2 == jogador1) {
			//System.out.println("Parab�ns, voc� acertou com: " + tentativa + " tentativas");
		//} else {
			do {
				tentativa++;
				jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe J2: ")); {
					if (jogador2 < jogador1) {
						JOptionPane.showMessageDialog(null,  "O n�mero � maior que esse.");
						//System.out.println("o n�mero � maior do que esse");
					} else if (jogador2 > jogador1){
						JOptionPane.showMessageDialog(null,  "O n�mero � menor que esse.");
						//System.out.println("o n�mero � menor que esse");
					} else {
						System.out.println("Parab�ns, voc� acertou com: " + tentativa + " tentativas");
					}
				}
			} while (jogador2 != jogador1);
		}
	//	System.out.println("Boa");
	}
//}
