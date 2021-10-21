package br.guilhermerodrigues.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.guilhermerodrigues.model.Personagem;
import br.guilhermerodrigues.service.PersonagemService;


@RestController
@RequestMapping("/personagens")
public class PersonagemController {

	@Autowired
	private PersonagemService personagemService;
	
	@PostMapping
	public Personagem insert(@RequestBody Personagem personagem) {
		return personagemService.insertOrupdate(personagem);
	}
	
	@PutMapping
	public Personagem update(@RequestBody Personagem personagem) {
		return personagemService.insertOrupdate(personagem);

	}
	
	@GetMapping
	public List<Personagem> findAll() {
		return personagemService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Personagem> findOne(@PathVariable int id){
		return personagemService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id){
		personagemService.remove(id);
	}
}
