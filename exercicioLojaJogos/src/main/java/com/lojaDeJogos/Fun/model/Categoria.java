package com.lojaDeJogos.Fun.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 300)
	private String descricaoCategoria;
	
	@NotNull
	private boolean desconto;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)//tipo de relação, cujas chaves são criada pelo JPA + relação de cascata p/ a integridade da tabela					//tipo de relação, cujas chaves são criada pelo JPA
	@JsonIgnoreProperties("categoria")//propriedade que será ignorada p/ não afetar a relação das tabelas
	private List<Produto> produto;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public boolean isDesconto() {
		return desconto;
	}

	public void setDesconto(boolean desconto) {
		this.desconto = desconto;
	}
}
