package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{ 
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
//"descricao", neste caso, pertence ao remédio e está com letra maiúscula em razão do camelCase
//Neste contexto, "Containing" assemelha-se ao "like" do MySQL

}
