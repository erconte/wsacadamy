package br.com.bankofoz.modelo;

import util.Magica;

public class Poupanca extends Conta {
	private double rendimento;
	private int aniversario;
	
	@Override
	public String toString() {
		return "Poupanca [\nrendimento=" + rendimento + "\naniversario=" + aniversario + "\ntoString()="
				+ super.toString() + "]";
	}


	public double getRendimento() {
		return rendimento;
	}


	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}


	public int getAniversario() {
		return aniversario;
	}


	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	public Poupanca() {
		super();
	}

	public Poupanca(int numero, double saldo, Cliente cliente, Agencia agencia, double rendimento, int aniversario) {
		super(numero, saldo, cliente, agencia);
		this.rendimento = rendimento;
		this.aniversario = aniversario;
	}

	public String getResumo() {
		return "Aniversário=" + aniversario +  "\nSaldo= " + super.getSaldo() + 
				"\nCliente= " + super.getCliente().getNome() +  
				"\nAgência= " + super.getAgencia().getNome();
	}
	
}
