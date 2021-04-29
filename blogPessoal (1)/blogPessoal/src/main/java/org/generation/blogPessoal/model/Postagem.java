package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity  // Determina entidade do JPA 
@Table(name = "postagem")  // Essa entidade virara uma tabela de nome "postagem"
public class Postagem {
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // VALOR QUE VAI SER GERADO COMO CHAVE ESTRANGEIRA DA CHAVE ID
	private long id;
	
	@NotNull  // NÃO PODE SER VAZIO 
	@Size(min = 5, max = 100)  // MINIMO DE CARACTER E MAXIMO
	private String titulo;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)  // TEMPORAL DETERMINA A HORA QUE A POSTAGEM PASSOU EXATAMENTE 
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
