package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite e-mail: ").toLowerCase();
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Tem arroba?: " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Qtde: " + email.length());
		System.out.println("Do segundo at� o quinto: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Antes do @: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Antes do @: " + email.substring(1 + email.indexOf("@"), email.length()));
		System.out.println("Primeiro Caracter: " + email.toLowerCase().charAt(0)); //colocar o LowerCase antes do charAt
		
		/*
		 * Identificador (nome dos elementos que criamos: vari�veis, classes, pacotes, etc...)
		 * - Regras: 
		 * 1� - N�o come�ar�s com n�meros. Exemplo: 1berto (errado) h1berto (certo).
		 * 2� - N�o utilizar�s palavras reservadas. Exemplo: n�o criar uma vari�vel chamada "class" "void" "public" "int" "double"
		 * 3� - N�o far�s uso de caracteres especiais. Sem acento, sem cedilha, sem &. Exemplo: n@me (errado), n�o utilize espa�o.
		 * 
		 * - Padr�es: 
		 * 1 - CamelCase: quando tem mais que uma palavra, da segunda palavra em diante tem que come�ar com letra mai�scula
		 * certo: dataNascimento, errado: datanascimento
		 * certo: data_nascimento
		 * 
		 * 2 - UML: � respons�vel por padronizar elementos da Orienta��o a Objetos
		 * - Toda classe deve come�ar com letra mai�scula
		 * - Toda vari�vel deve come�ar com letra minuscula
		 * - Todo m�todo deve come�ar com letra minuscula (main, print, parseInt...) e deve
		 * ser seguido de parenteses.
		 * 
		 * Xpto.xpto() - � um m�todo
		 * xpto() - � uma fun��o
		 * xpto - � uma vari�vel
		 * Xpto - � uma classe
		 * 
		 */
		
		
		//e r i c k c o n t e @ o u t l o o k . c o m
		//0 1 2 3 4 5 ...
		
		
		
	}

}
