package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {	//lugar dos atributos (chave porimaria, etc), getters e setters
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//Muitos produtos para uma categoria
	@ManyToOne						//tipo de relação, cujas chaves são criada pelo JPA
	@JsonIgnoreProperties("produto")//propriedade que será ignorada p/ não afetar a relação das tabelas
	private Categoria categoria;	
	
	@NotNull
	@Size(min = 3, max = 85)
	private String nome;
	
	@NotNull
	@Size(min = 1, max = 55)
	private String laboratorio_orgao;
	
	@NotNull
	private double peso;
	
	@NotNull
	private double preco;
	
	@NotNull
	private int comprimidos;
	
	
	
	
	
	
	
	
}
