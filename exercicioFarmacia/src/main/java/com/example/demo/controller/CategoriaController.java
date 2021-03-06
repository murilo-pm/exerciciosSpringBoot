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
import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;


//Os métodos de CategoriaController estão okay e funcionando 100%

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
						
	@Autowired		//amarre-os
	private CategoriaRepository repository;
	
	@GetMapping		//p/ buscar todos
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());			
	}
	
	@GetMapping("/categoria/{descricao}")
	public ResponseEntity<List<Categoria>> getByName(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria){			//precisa passar o ID do recurso que será alterado
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));	//devolverá o objeto/postagem que foi salvo(a)
		}
	
	@DeleteMapping("/{id}") 						//chaves = template literal = interpolação
	public void delete(@PathVariable long id) {		//deletará pelo ID que será informado
		repository.deleteById(id);
	}
	
	
}
