package br.com.teste.dryve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/")
public class MenuController {
	
	@GetMapping(value = "/")
	public String testedryve() {
		return "testedryve";
	}
	
	@GetMapping(value = "/desafio1a")
	public String desafio1a() {
		return "desafio1a";
	}
	
	@GetMapping(value = "/desafio1b")
	public String desafio1b() {
		return "desafio1b";
	}
	
	@GetMapping(value = "/desafio1c")
	public String desafio1c() {
		return "desafio1c";
	}
	
	@GetMapping(value = "/desafio2")
	public String desafio2() {
		return "desafio2";
	}
	
}
