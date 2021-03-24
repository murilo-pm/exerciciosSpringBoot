package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	//"nome", neste caso, refere-se ao remédio e está com letra maiúscula em razão do camelCase
	//Neste contexto, "Containing" assemelha-se ao "like" do MySQL

}
