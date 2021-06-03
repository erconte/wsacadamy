package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;
import util.Magica;

public class TesteTurma {
	
	public static void main(String[] args) {
		Turma turma = new Turma (
				Magica.s("Sigla"),
				Magica.s("Período"),
				Magica.s("Sala"),
				new Professor(
						
						),
				new Curso(
						Magica.s("Nome"),
						Magica.s("Titulação"),
						Magica.d("Valor"),
						Magica.i("Carga Horaria")
						),
				new Aluno(
						Magica.i("RM"),
						new Endereco()
						)
				);
		System.out.println(turma);
		
	}
	
}
