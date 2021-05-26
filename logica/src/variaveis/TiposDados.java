package variaveis;

import javax.swing.JOptionPane;
//swing - nativo java - n�o usou nenhum framework externo

public class TiposDados {
	//m�todo main - a JVM precisa saber por onde come�ar, o "main" � o start point
	//� a chave de igni��o do carro
	public static void main(String[] args) {
	
		//Sintaxe: <tipo de dado><nome da variavel> = <dado>
		//String precisa de aspas e int n�o precisa
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		//showInput � um m�todo, todo m�todo vem seguido de parenteses e come�a com letra minuscula
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade: "));
		//parseInt tranforma String em INT
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: " + nome); //system - sistema operacional, out - sa�da, print - tela
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);		
		System.out.println("IMC...: " + imc);
		
		/*
		 * toda classe come�a com Letra mai�scula 
		 * Alfanum�rico: � um texto, parte de um texto ou um n�mero que n�o ser� utilizado
		 * em opera��es matem�ticas.
		 * Em java: *String* - string � uma classe instalada na m�quina em algum lugar
		 * 
		 * 
		 * Num�rico: representa um dado que pode ser utilizado em express�es matem�ticas
		 * e/ou � considerado um dado cr�tico pelo contexto.
		 * CEP: Correios
		 * CPF: Receita Federal
		 * Funcional: Ita�
		 * RM: entre alunos de faculdade
		 * - int => para representa��o de n�meros inteiros
		 * - Double => para n�meros reais (com casas decimais)
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
	//Em uma classe encontramos: m�todos e atributos
	//Nossa classe � p�blica
	/*
	 * JVM - � o interpretador do JAVA
	 * JRE � o ambiente de execu��o
	 * JDK � o ambiente dev do JAVA
	 */
	
} //fechando o bloco da classe TiposDados
