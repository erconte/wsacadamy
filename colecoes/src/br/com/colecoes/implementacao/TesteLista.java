package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * Sobre o List
		 * - o tamanho é dinâmico
		 * - os dados podem ser heterogeneos (distintos)
		 */

		List<String> lista = new ArrayList<String>(); // lista generics
		lista.add("DBA");
		lista.add("DEV");
		lista.add("INFRA");
		lista.add("DEV1");
		System.out.println(lista);
		System.out.println("Primeiro elemento: " + lista.get(0));
		lista.remove(1);
		System.out.println("Depois de remover: " + lista);
		Collections.sort(lista); //Ordena em ordem alfabética e o reverse ordena ao contrário.
		System.out.println("Ordenada: " + lista);
		
		for (int posicao=0; posicao<lista.size(); posicao++) {
			System.out.println("Cargo: " + lista.get(posicao));
		}
	}
	
	
}
