package com.objetivo.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Objetivo")

public class ObjetivoCrontoller {

	@GetMapping
	public String objetivo() {
		return "Essa semana para o meu objetivo de aprendizagem é absorver o conteúdo novo (Spring, MySQL) e ter uma zona de conforto mais agradavél";
	}
	
}
