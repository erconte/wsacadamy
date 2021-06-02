package br.com.lojaregina.modelo;

/*
 * Design Pattern: compilado de boas pr�ticas para OO;
 * DTO (Design Transfer Object) => � um patter que indica as melhores pr�ticas para a montagem de uma classe modelo
 * (do diagrama de classe) na programa��o.
 * - TODOS os atributos devem ser privados;
 * - CADA atributo deve possuir INDIVIDUALMENTE um m�todo de input e outro m�todo e output.
 * - Deve possuir no m�nimo DOIS construtores, onde um deles deve estar vazio (sem parametros) e o outro deve estar completo
 * com todos os parametros para o preenchimento dos atributos.
 * 
 * 
 * Nomes que podemos encontrar para PACOTES de modelo:
 * modelo = beans = JavaBeans = dto = to
 * 
 */

public class Cliente {
	
	private int id; //atributo
	private String nome; //atributo
	private String email; //atributo
	private String telefone; //atributo
	private Endereco endereco;

	public Cliente() {}
	public Cliente(int id, String nome, String email, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}	
	
	public String getUser() {
		if (email.contains("@")==true) {
			return email.substring(0, email.indexOf("@"));
		}else {
			return email;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", endereco="
				+ endereco + "]";
	}

	public void setAll(Endereco endereco, int id, String nome, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	
	
	//todo m�todo come�a com uma a��o: ex.: showInputDialog; preencherId; retornarId;
	//<modificador> <tipo do retorno> <nome do m�todo> (<tipo param> <nome do param>
	//m�todo de output
	//m�todo de input

}
