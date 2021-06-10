package br.com.eventdash.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eventdash.modelo.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme, Integer>{

	List<Alarme> findByNameLike(String alarme);
}
