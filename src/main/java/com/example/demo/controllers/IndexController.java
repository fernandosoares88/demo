package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Chamou o meu método index do IndexController - Agora editado");
		return "home";
	}
	
	@RequestMapping("/ajuda")
	public String ajuda() {
		System.out.println("Chamou a página de ajuda");
		return "ajuda";
	}

}
