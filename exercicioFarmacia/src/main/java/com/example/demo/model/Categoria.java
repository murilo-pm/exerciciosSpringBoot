package com.example.demo.model;

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
public class Categoria {	//lugar dos atributos (chave primaria, etc), getters e setters
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@NotNull 
	public boolean original;
	
	@NotNull
	public boolean generico;
	
	@NotNull
	public boolean retencao_receita;
	
	@NotNull
	@Size(min = 3, max = 75)
	public String descricao;
	
	//uma categoria para muitos produtos
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)//tipo de relação, cujas chaves são criada pelo JPA + relação de cascata p/ a integridade da tabela					//tipo de relação, cujas chaves são criada pelo JPA
	@JsonIgnoreProperties("categoria")//propriedade que será ignorada p/ não afetar a relação das tabelas
	private List<Produto> produto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isOriginal() {
		return original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public boolean isGenerico() {
		return generico;
	}

	public void setGenerico(boolean generico) {
		this.generico = generico;
	}
	
	
}
