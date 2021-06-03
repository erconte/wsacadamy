package br.com.unixyz.modelo;

public class Graduacao extends Curso {
	//o extends é para herança
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	
	
	public Graduacao() {
		super();
	}

	public Graduacao(String nome, String titulacao, double valor, int cargaHoraria, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(nome, titulacao, valor, cargaHoraria);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	@Override
	public String toString() {
		return "Graduacao [projetoConclusao=" + projetoConclusao + ", cargaHorariaEstagio=" + cargaHorariaEstagio
				+ ", toString()=" + super.toString() + "]";
	}
	
	//o SUPER é necessário para chamar a classePai(Curso), por isso fica "super.toString", senão ele se autochamaria
	
	
}
