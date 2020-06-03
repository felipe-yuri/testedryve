package br.com.teste.dryve.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.teste.dryve.entities.Anuncio;

public interface AnuncioRepository extends CrudRepository<Anuncio, String> {

}
