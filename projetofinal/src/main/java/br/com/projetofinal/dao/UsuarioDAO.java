package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Usuario;

/*
 * DAO (Data Access Object) é um pattern que aponta como boa prática que todos os 
 * comandos DML (select, insert, update, delete) devem estar em uma camada isolada (dao)
 * Por isso, todo DAO contém um CRUD (CREATE, READ, UPDATE, DELETE).
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	/*
	 * save () => salve um objeto (serve para atualizar tb)
	 * findById() => pesquisa um ojbeto pela chave primária
	 * findAll() => retorna todas as linhas da tabela
	 * deleteAll() => apaga tudo
	 * deleteById() => apaga um usuário pela chave primária
	 */
	public Usuario findByEmailAndSenha(String email, String senha);
	
	

}
