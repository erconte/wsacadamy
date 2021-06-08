package br.com.bankofoz.modelo;
/*Nas classes filhas Cuidad:
- construtor cheio
- toString ()
*/

public class Corrente extends Conta{
	private double limite;
	private double taxa;
	
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Corrente [\nlimite=" + limite + "\ntaxa=" + taxa + "\ntoString()=" + super.toString() + "]";
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public Corrente() {
		super();
	}

	public Corrente(double limite, double taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}

	public boolean sacar (double valor) {
		double resultado = limite+ super.getSaldo();
		if (resultado >= valor) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}else 
			return false;
	}

	public double getSaldo( ) {
		return limite + super.getSaldo();
	}

	public String getResumo() {
		return "Limite: " + limite + "\nTaxa= " + taxa +
				"\nSaldo= " + super.getSaldo() + "\nCliente= " + super.getCliente();
	}
	
}
