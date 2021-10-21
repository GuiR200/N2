package br.guilhermerodrigues.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Personagem")
public class Personagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 11,nullable = false)
	private String nome;
	@Column(length = 50,nullable = false)	
	private String sobrenome;
	@Column(length = 70,nullable = false)
	private String habilidade;
	
	public Personagem(int id, String nome, String sobrenome, String habilidade) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.habilidade = habilidade;
		
		
	}
	public Personagem() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

}