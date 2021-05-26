package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		short ano = Short.parseShort(JOptionPane.showInputDialog("ano: "));
		short mes = Short.parseShort(JOptionPane.showInputDialog("mes: "));
		short dia = Short.parseShort(JOptionPane.showInputDialog("dia: "));

		while (ano < 1920 || ano > 2003 ) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		}
		while (mes < 1 || mes > 12) {
			mes = Short.parseShort(JOptionPane.showInputDialog("Mês"));
		}

		if (mes==2) { // mes com 29 dias
			while (dia<1 || dia>29) {
				dia = Short.parseShort(JOptionPane.showInputDialog("Dia"));
			} 
		} else if(mes==4 || mes==6 || mes==9 || mes==11) { //meses com 30 dias
			while (dia<1 || dia>30) {
				dia = Short.parseShort(JOptionPane.showInputDialog("Dia"));
			}
		} else { //meses com 31 dias
			while (dia<1 || dia>31) {
				dia = Short.parseShort(JOptionPane.showInputDialog("Dia"));
			}
		}
	}
}