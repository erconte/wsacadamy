package br.com.elevador.implementacao;

import javax.swing.JOptionPane;

import br.com.elevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		//String pessoas = "";
		//boolean pessoas=false;
		//1° Instanciar Objeto
		Elevador objeto = new Elevador (); // instancia um objeto (pegou do molde e criou um objeto na memória)
		
		objeto.preencherNome(JOptionPane.showInputDialog("Digite o nome do Elevador: "));
		objeto.inicializar(10, 0, 10);
		System.out.println("Resumo: \n" + objeto.retornarResumo());
		objeto.subir();
		objeto.subir();
		System.out.println("Resumo: \n" + objeto.retornarResumo());
		objeto.entrar(5);
		System.out.println("Resumo: \n" + objeto.retornarResumo());
		objeto.descer();
		System.out.println("Resumo: \n" + objeto.retornarResumo());
		objeto.sair();
		System.out.println("Resumo: \n" + objeto.retornarResumo());
		
		//do {
			//objeto.entrar(1);
			//pessoas = JOptionPane.showConfirmDialog(null, "Deseja subir?", "Elevador", JOptionPane.YES_NO_CANCEL_OPTION)==0);
				//if (objeto.subir()) {
					//objeto.subir();
				//}
				
		System.out.println("Resumo: \n" + objeto.retornarResumo());
		//} while(JOptionPane.showConfirmDialog(
				//null, "Tem mais pessoas?", "Elevador", JOptionPane.YES_NO_CANCEL_OPTION)==0);
		
	}
}
