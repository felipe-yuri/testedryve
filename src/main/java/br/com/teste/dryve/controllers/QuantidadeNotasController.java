package br.com.teste.dryve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.teste.dryve.entities.QuantidadeNotas;

@Controller
public class QuantidadeNotasController {
	
	@GetMapping(value = "/desafio1b/calcularnotas")
	public String calcularNotas(Model model, @RequestParam int valor) {
		QuantidadeNotas quantidadeNotas = new QuantidadeNotas();
		quantidadeNotas.setValor(valor);
		quantidadeNotas.setNotas100(valor/100);
		quantidadeNotas.setNotas50(valor/50);
		quantidadeNotas.setNotas20(valor/20);
		quantidadeNotas.setNotas10(valor/10);
		quantidadeNotas.setNotas5(valor/5);
		quantidadeNotas.setNotas1(valor/1);
		model.addAttribute("notas", quantidadeNotas);
		return "desafio1b";
	}
}
