package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	
	//sintaxe:
	//<modificador><tipo do retorno><nome do método>(<tipo do param><nome do param>...){ }
	
	public String retornarTudo() {
		String xpto = "Não";
		if(status==true) {
			xpto="Sim";
		}
		return 
			"Modelo: " + modelo + "\n" +
			"Valor: " + valor + "\n" +
			"VelocidadeAtual: " + velocidadeAtual + "\n" +
			"Status: " + status + "\n";
	}
	
	public void desacelerar() {
			velocidadeAtual=0;
	}
	
	public void desacelerar(int param) {
		if (status==true || velocidadeAtual>=param) {
			velocidadeAtual-=param;
		}
	}
	
	public void acelerar(int param) {
		if (status==true) {
			velocidadeAtual+=param;
		}
	}
	
	public String desligar() {
		velocidadeAtual=0;
		boolean status=false;
		return "desligado";
	}
	
	public String ligar() {
		boolean status=true;
		return "ligado";
	}
	
	public void preencherValor (double param) {
		if (param>0) {
		valor = param;
		}
	}
	
	public double retornarValor () {
		return valor;
	}
	
	public String retornarModelo () {
		return modelo;
	}
	
	public void preencherModelo (String param) {
		if (param.length()<10) {
		modelo = param.toUpperCase();
		}
	}
	
}
