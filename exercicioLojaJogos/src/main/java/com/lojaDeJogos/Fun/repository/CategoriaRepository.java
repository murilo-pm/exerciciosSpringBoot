package com.lojaDeJogos.Fun.repository;

import java.util.List;
import com.lojaDeJogos.Fun.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
	public List<Categoria> findAllByDescricaoCategoriaContainingIgnoreCase(String descricaoCategoria);
	//"descricaoCategoria", neste caso, está com letra maiúscula em razão do camelCase	
	//"Containing" assemelha-se ao "like" do MySQL
	
}
