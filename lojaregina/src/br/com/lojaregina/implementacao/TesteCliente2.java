package br.com.lojaregina.implementacao;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Cliente;

public class TesteCliente2 {
	public static void main(String[] args) {
		Cliente objeto = new Cliente ();
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua x");
		endereco.setNumero("50");
		endereco.setUf("SP");
		endereco.setComplemento("0");
		endereco.setCidade("Santo André");
		endereco.setCep("12345-123");
		endereco.setBairro("Campestre");
		
		objeto.setAll(endereco, 1, "Erick", "xpto@xpto.com.br", "1234-1234");
		System.out.println(objeto.toString());
		System.out.println("Bairro: " + objeto.getEndereco().getBairro());
		System.out.println("Usuário: " + objeto.getUser());
	}

}
