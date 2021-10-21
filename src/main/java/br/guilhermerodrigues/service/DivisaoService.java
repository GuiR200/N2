package br.guilhermerodrigues.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.guilhermerodrigues.model.Divisao;
import br.guilhermerodrigues.repository.DivisaoRepository;

@Service
public class DivisaoService {

	@Autowired
	private DivisaoRepository divisaoRepository;
	
	public Divisao insert(Divisao divisao) {
		return divisaoRepository.save(divisao);
	}

	public Divisao insertOrupdate(Divisao divisao) {
		return divisaoRepository.save(divisao);
	}
	
	public List<Divisao> findAll(){
		List<Divisao> divisao = new ArrayList<>();
		divisaoRepository .findAll().forEach(divisao::add);
		return divisao;
	}
	
	public Optional<Divisao> findOne(int id) {
		return divisaoRepository.findById(id);
	}
	
	public void remove(int id) {
		divisaoRepository.deleteById(id);
	}
		
}