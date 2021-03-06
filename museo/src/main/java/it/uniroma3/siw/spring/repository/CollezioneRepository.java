package it.uniroma3.siw.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.siw.spring.model.Collezione;

@Repository
public interface CollezioneRepository extends CrudRepository<Collezione, String>{
	
}
