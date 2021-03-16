package com.hellomentalidades.mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades") //caminho que será utilizado pelo postman para entrar nesse acesso
public class MentalidadesController {
	
	@GetMapping
	public String mentalidades() {
		return "Mentalidades: persistência, mentalidade de crescimento e responsabilidade pessoal \n"
				+ "Habilidades: atenção aos detalhes";
	}
}
