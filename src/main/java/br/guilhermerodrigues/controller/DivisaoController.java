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

import br.guilhermerodrigues.model.Divisao;
import br.guilhermerodrigues.service.DivisaoService;

@RestController
@RequestMapping("/divisoes")
public class DivisaoController {
	
	@Autowired
	private DivisaoService divisoesService;
	
	@PostMapping
	public Divisao insert(@RequestBody Divisao divisoes) {
		return divisoesService.insertOrupdate(divisoes);
	}
	
	@PutMapping
	public Divisao update(@RequestBody Divisao divisoes) {
		return divisoesService.insertOrupdate(divisoes);

	}
	
	@GetMapping
	public List<Divisao> findAll() {
		return divisoesService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Divisao> findOne(@PathVariable int id){
		return divisoesService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id){
		divisoesService.remove(id);
	}
}
