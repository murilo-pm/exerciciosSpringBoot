package com.lojaDeJogos.Fun.model;

import java.util.List;

import javax.persistence.CascadeType;
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
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@NotNull
	@Size(min = 3, max = 100)
	public String nome;
	
	@NotNull
	public float preco;
	
	@NotNull
	@Size(min = 3, max = 50)
	public String parcelamento;

	@NotNull
	@Size(min = 5, max = 300)
	public String descricaoProduto;
	
	@ManyToOne	//tipo de relação, cujas chaves são criada pelo JPA + relação de cascata p/ a integridade da tabela					//tipo de relação, cujas chaves são criada pelo JPA
	@JsonIgnoreProperties("produto")//propriedade que será ignorada p/ não afetar a relação das tabelas
	private Categoria categoria;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(String parcelamento) {
		this.parcelamento = parcelamento;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

}
