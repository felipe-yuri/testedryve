package br.com.teste.dryve.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.teste.dryve.entities.Veiculo;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {

}
