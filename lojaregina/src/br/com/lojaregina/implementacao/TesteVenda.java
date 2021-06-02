package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		Colaborador colaborador = new Colaborador();
		Endereco endereco = new Endereco();
		Pagamento pagamento = new Pagamento();
		Venda venda = new Venda();
		
		endereco.setLogradouro("Rua x");
		endereco.setNumero("50");
		endereco.setUf("SP");
		endereco.setComplemento("0");
		endereco.setCidade("Santo André");
		endereco.setCep("12345-123");
		endereco.setBairro("Campestre");
		
		cliente.setAll(endereco, 1, "Erick", "econte@outlook.com", "11974482774");
		
		colaborador.setEndereco(endereco);
		colaborador.setCargo("Vendedor");
		colaborador.setId(12);
		colaborador.setNome("Igor");
		colaborador.setSalario(5000);
		
		produto.setAll(1, "CHURROS", 6, 12, 10);
		
		pagamento.setData("02/05/2021");
		pagamento.setForma("DINHEIRO");
		pagamento.setId(125);
		pagamento.setValor(120);
		
		venda.setId(5421);
		venda.setData("02/05/2021");
		venda.setCliente(cliente);
		venda.setPagamento(pagamento);
		venda.setProduto(produto);
		venda.setVendedor(colaborador);
		
		System.out.println("Cliente: " + venda.getCliente().getNome());
		System.out.println("Cidade: " + venda.getCliente().getEndereco().getCidade());
		System.out.println("Vendedor: " + venda.getVendedor().getNome());
		System.out.println("Produto: " + venda.getProduto().getDescricao());
		System.out.println("Pagamento: " + venda.getPagamento().getForma());
	
	}
}
