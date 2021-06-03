package br.com.bankofoz.modelo;

public class Corrente extends Conta{
	private double limite;
	private double taxa;
	
	
	

	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
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
		if (valor - super.getSaldo() <= 0) {
			return false;
		}else 
			super.setSaldo(super.getSaldo()-valor);
			return true;
	}

	public double getSaldo( ) {
		return limite + super.getSaldo();
	}
	public String getResumo() {
		return "Taxa= " + taxa +  "Saldo= " + super.getSaldo() + " Cliente= " + super.getCliente();
	}
	
}
