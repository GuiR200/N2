package br.guilhermerodrigues.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.guilhermerodrigues.model.Personagem;
import br.guilhermerodrigues.repository.PersonagemRepository;


@Service
public class PersonagemService {
	
	@Autowired
	private PersonagemRepository personagemRepository;

	public Personagem insert(Personagem personagem) {
		return  personagemRepository.save(personagem);
	}
	
	public Personagem insertOrupdate(Personagem personagem) {
		return personagemRepository.save(personagem);
	}
	
	public List<Personagem> findAll(){
		List<Personagem> personagem = new ArrayList<>();
		personagemRepository.findAll().forEach(personagem::add);
		return personagem;
		
	}
	public Optional<Personagem> findOne(int id) {
		return personagemRepository.findById(id);
	}
	
	public void remove(int id) {
		personagemRepository.deleteById(id);
	}
		
}