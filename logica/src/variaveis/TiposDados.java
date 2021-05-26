package variaveis;

import javax.swing.JOptionPane;
//swing - nativo java - não usou nenhum framework externo

public class TiposDados {
	//método main - a JVM precisa saber por onde começar, o "main" é o start point
	//é a chave de ignição do carro
	public static void main(String[] args) {
	
		//Sintaxe: <tipo de dado><nome da variavel> = <dado>
		//String precisa de aspas e int não precisa
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		//showInput é um método, todo método vem seguido de parenteses e começa com letra minuscula
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade: "));
		//parseInt tranforma String em INT
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: " + nome); //system - sistema operacional, out - saída, print - tela
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);		
		System.out.println("IMC...: " + imc);
		
		/*
		 * toda classe começa com Letra maiúscula 
		 * Alfanumérico: é um texto, parte de um texto ou um número que não será utilizado
		 * em operações matemáticas.
		 * Em java: *String* - string é uma classe instalada na máquina em algum lugar
		 * 
		 * 
		 * Numérico: representa um dado que pode ser utilizado em expressões matemáticas
		 * e/ou é considerado um dado crítico pelo contexto.
		 * CEP: Correios
		 * CPF: Receita Federal
		 * Funcional: Itaú
		 * RM: entre alunos de faculdade
		 * - int => para representação de números inteiros
		 * - Double => para números reais (com casas decimais)
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
	//Em uma classe encontramos: métodos e atributos
	//Nossa classe é pública
	/*
	 * JVM - é o interpretador do JAVA
	 * JRE é o ambiente de execução
	 * JDK é o ambiente dev do JAVA
	 */
	
} //fechando o bloco da classe TiposDados
