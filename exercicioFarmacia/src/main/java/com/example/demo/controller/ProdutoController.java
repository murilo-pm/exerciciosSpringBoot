package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

//Os métodos de ProdutoController estão feitos, mas não são funcionais (corrigir)

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){		//???????
		return ResponseEntity.ok(repository.findAll());
	}
	
	//id, comprimidos, laboratorio_orgao, nome, peso, preco, categoria_id

	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());			
	}
	
	@GetMapping("/produtos/{nome}")
	public ResponseEntity<List<Produto>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto produtos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtos));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produtos){			//precisa passar o ID do recurso que será alterado
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtos));	//devolverá o objeto/postagem que foi salvo(a)
		}
	
	@DeleteMapping("/{id}") 						//chaves = template literal = interpolação
	public void delete(@PathVariable long id) {		//deletará pelo ID
		repository.deleteById(id);
	}
	
}
