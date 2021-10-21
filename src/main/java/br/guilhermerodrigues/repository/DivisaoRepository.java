package br.guilhermerodrigues.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.guilhermerodrigues.model.Divisao;

@Repository
public interface DivisaoRepository extends CrudRepository<Divisao, Integer> {
}