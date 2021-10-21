package br.guilhermerodrigues.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.guilhermerodrigues.model.Personagem;

@Repository
public interface PersonagemRepository extends CrudRepository<Personagem, Integer> {
}
