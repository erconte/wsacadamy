package br.com.bankofoz.modelo;

import util.Magica;

public class Poupanca extends Conta {
	private double rendimento;
	private int aniversario;
	
	
	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", aniversario=" + aniversario + ", getSaldo()=" + getSaldo()
				+ ", getCliente()=" + getCliente() + ", getAgencia()=" + getAgencia() + "]";
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


	public Poupanca(double rendimento, int aniversario) {
		super();
		this.rendimento = rendimento;
		this.aniversario = aniversario;
	}
	
	public String getResumo() {
		return "Resumo: [Aniversário=" + aniversario +  "Saldo= " + super.getSaldo() + " Cliente= " + super.getCliente() +  ", Agência= "
				+ super.getAgencia() + "]";
	}
	
}
