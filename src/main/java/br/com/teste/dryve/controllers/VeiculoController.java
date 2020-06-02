package br.com.teste.dryve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.teste.dryve.entities.Veiculo;
import br.com.teste.dryve.repositories.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	VeiculoRepository repository;
	
	@PostMapping(value = "/desafio2/cadastrar")
	public String cadastrar(
			@RequestParam String placa, 
			@RequestParam int idMarca, 
			@RequestParam int idModelo, 
			@RequestParam float preco, 
			@RequestParam int ano,
			Model model) {
		
		Veiculo veiculo = new Veiculo(placa, idMarca, idModelo, preco, ano);
		repository.save(veiculo);
		model.addAttribute("sucesso", true);
		return "/desafio2";
		
	}

}
