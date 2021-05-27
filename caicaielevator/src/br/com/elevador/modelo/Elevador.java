package br.com.elevador.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;

	public String retornarNome() {
		return nome;
	}

	public void preencherNome (String param) {
		nome = param.toUpperCase();
	}

	public void inicializar (int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapPessoas;
		return;
	}

	public String subir() {
		if(andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo";
		} else {
			return "Não é possível subir";
		}
	}

	public String descer() {
		if(andarAtual==andarMinimo) {
			System.out.println("Não é possível Descer!");
		} else
			andarAtual--;
		return "Desceu 1";
	}

	public void sair() {
		if(qtdePessoas>0) {
			qtdePessoas--;
		} else
			System.out.println("Não tem ninguém");
	}

	public void entrar(int qtde) {
		int resultado = qtdePessoas + qtde;
		if(resultado<=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}

	public void sair(int qtde) {
		int resultado = qtdePessoas - qtde;
		if(resultado>=0) {
			qtdePessoas-=qtde;
		}
	}

	public String retornarResumo() {
		return 
				"Nome:.................. " + nome + "\n" +
				"Andar Atual:........... " + andarAtual + "\n" +
				"Quantidade de pessoas:. " + qtdePessoas + "\n";
	}
}
