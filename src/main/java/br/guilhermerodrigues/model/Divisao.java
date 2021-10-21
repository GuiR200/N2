package br.guilhermerodrigues.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="divisoes")
public class Divisao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 11,nullable = false)
	private String numero;
	@Column(length = 50, nullable = false)
	private String capitao;
	@Column(length = 70,nullable = false)
	private String tenente;
	
	public Divisao(int id, String numero, String capitao, String tenente) {
		this.numero = numero;
		this.capitao = capitao;
		this.tenente = tenente;
		
		
	}
	public Divisao() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCapitao() {
		return capitao;
	}
	public void setCapitao(String capitao) {
		this.capitao = capitao;
	}
	public String getTenente() {
		return tenente;
	}
	public void setTenente(String tenente) {
		this.tenente = tenente;
	}

}