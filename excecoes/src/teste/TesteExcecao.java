package teste;

import excecao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		
		try {
		
			int numero = Integer.parseInt("7");
			System.out.println("Valor: " + numero);
			
			
			String palavra = "";
			System.out.println("Qtde de Letras: " + palavra.length());	
			/*
			 * Caracteristicas do Vetor:
			 * - o tamanho dele é estático
			 * - o vetor precisa de uma variável para controlar o indice (posição)
			 * - os dados são homogeneos (do mesmo tipo) 
			 * - não é possível excluir uma posição em tempo de execução
			 * - ordenação dos dados é complexa
			 */
			int numeros[] = new int[5]; // vetor
			numeros[0] = 542;
			numeros[1] = 100;
			numeros[2] = 12;
			numeros[3] = 18; 
			//System.out.println(numeros[1]);
			
			for (int posicao=0;posicao<numeros.length;posicao++) {
				System.out.println("Valor: " + numeros[posicao]);
			}
			
			
		}catch(Exception e) {

			System.out.println(MinhaExcecao.tratar(e));
		
		}
	}
}