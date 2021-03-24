package com.lojaDeJogos.Fun.model.repository;

import java.util.List;
import com.lojaDeJogos.Fun.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByDescricaoProdutoContainingIgnoreCase(String descricaoProduto);
	//"descricaoProduto", neste caso, está com letra maiúscula em razão do camelCase	
	//"Containing" assemelha-se ao "like" do MySQL
	
}
