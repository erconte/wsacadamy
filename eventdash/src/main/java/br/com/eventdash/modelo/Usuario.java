package br.com.eventdash.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica para o Spring que esta classe estar´ligada a uma tabela do BD
@Table(name="TB_USUARIO")
public class Usuario {
	@GeneratedValue(strategy=GenerationType.IDENTITY) //fala para o spring que o campo será autoincremento;
	@Id //indica para o spring que o campo é a chave primária da tabela;
	@Column(name="id")// especifica qual a coluna da tabela que está relacionada com o atributo.
	private int id;
	@Column(name="nome", length=50)// especifica qual a coluna da tabela que está relacionada com o atributo.
	private String nome;
	@Column(name="email", length=70)// especifica qual a coluna da tabela que está relacionada com o atributo.
	private String email;
	@Column(name="senha", length=20)// especifica qual a coluna da tabela que está relacionada com o atributo.
	private String senha;
	@Column(name="foto", length=100)// especifica qual a coluna da tabela que está relacionada com o atributo.
	private String foto;
	@Column(name="racf", length=100)// especifica qual a coluna da tabela que está relacionada com o atributo.
	private String racf;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", foto=" + foto
				+ ", racf=" + racf + "]";
	}
	public Usuario(int id, String nome, String email, String senha, String foto, String racf) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
		this.racf = racf;
	}
	public Usuario() {
		super();
	}
	

	
}

