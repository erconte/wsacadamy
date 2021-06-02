package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda2 {

	public static void main(String[] args) {
		
		Venda venda = new Venda(
				1,
				"02/06/2021",
				new Produto(
						100,
						"Churros",
						6,
						12,
						10
						),
				new Cliente(
						5,
						"Xpto",
						"xpto@xpto.com.br",
						"1234-4321",
						new Endereco(
								"Rua X",
								"45",
								"Viela 2",
								"Pimentas",
								"Guarulhos",
								"SP",
								"12345"
								)
						),
				new Colaborador(
						10,
						"Vendedor Y",
						new Endereco(
								"Rua X",
								"45",
								"Viela 2",
								"Pimentas",
								"Guarulhos",
								"SP",
								"12345"							
								),
						"Vendedor",
						4000
						),
				new Pagamento(
						50,
						5000,
						"02/06/2021",
						"Dinheiro"
						)
				);
		
		System.out.println(venda.toString());
		
	}
}
