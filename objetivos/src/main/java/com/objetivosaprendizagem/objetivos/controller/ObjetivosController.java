package com.objetivosaprendizagem.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "Objetivos de aprendizagem: compreender e aprender a utilizar o Spring Boot para apicá-lo no projeto do blog pessoal e no projeto integrador";
	}
}
