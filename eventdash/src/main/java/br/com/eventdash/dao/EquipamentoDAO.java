package br.com.eventdash.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eventdash.modelo.Equipamento;

public interface EquipamentoDAO extends CrudRepository<Equipamento, Integer>{
	
	List<Equipamento> findByHostnameLike(String equip);
	
}
