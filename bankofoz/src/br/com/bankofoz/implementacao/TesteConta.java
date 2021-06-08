package br.com.bankofoz.implementacao;
import br.com.bankofoz.modelo.Agencia;
import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;
import util.Magica;

/*
 * Polimorfismo:
 *  é o pilar que admite um elemento ter o mesmo nome e executar várias ações distintas.
 *  => objeto
 *  Quando fazemos uso da herança, criamos o objeto pelo pai e instanciamos pelo filho.
 *  Exemplo:
 *  Conta conta = new Corrente();
 *  => Método
 *  Dois tipos:
 *  overload (sobrecarga) => quandos os métodos estão na mesma classe (desacelerar() da classe Veiculo)
 *  Override (sobreescrita) => quando os métodos estão em classes distintas (pai e filha)
 *  Exemplo: getResumo() => está na classe Conta, Corrente e na classe Poupanca
 */

public class TesteConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(Magica.i("ID Cliente"),
				Magica.s("Nome Cliente:"),
				Magica.s("CPF:")
				);
		
		Agencia agencia = new Agencia(Magica.i("Id Agencia:"),
				Magica.s("Nome Agencia:"),
				Magica.s("Telefone Agencia: ")
				);
		
		double saldo = 1000;
		int numero = 123455;
		
		Conta conta = new Conta();
		if(Magica.b("Corrente?")) {
			conta = new Corrente(
					numero,
					saldo,
					cliente,
					agencia,
					5000, //limite
					50 // taxa da conta corrente
					);
		} else {
			conta = new Poupanca(
					numero,
					saldo,
					cliente,
					agencia,
					0.05, // rendimento
					10 // dia do aniversário da poupança
					);
		}
		System.out.println("Sacar: " + conta.sacar(2000));
		System.out.println(conta.toString());
		System.out.println(conta.getResumo());
	}
	
}
