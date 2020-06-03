package br.com.teste.dryve.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import br.com.teste.dryve.entities.Anuncio;
import br.com.teste.dryve.entities.Veiculo;
import br.com.teste.dryve.entities.VeiculoFipe;
import br.com.teste.dryve.repositories.VeiculoRepository;

@Controller
public class VeiculoController {

	@Autowired
	VeiculoRepository repository;

	@PostMapping(value = "/desafio2/cadastrar")
	public String cadastrar(@RequestParam String placa, @RequestParam int idMarca, @RequestParam int idModelo,
			@RequestParam float preco, @RequestParam int ano, Model model) {

		Veiculo veiculo = new Veiculo(placa, idMarca, idModelo, preco, ano);
		repository.save(veiculo);
		model.addAttribute("sucesso", true);
		return "/desafio2";

	}

//	@GetMapping(value = "/desafio2/veiculo/anuncio")
//	public ResponseEntity<Anuncio> anuncio(
//			@RequestParam String placa,
//			@RequestParam int idMarca, 
//			@RequestParam int idModelo,
//			@RequestParam float preco,
//			@RequestParam int ano, Model model) {
//		
//		RestTemplate restTemplate = new RestTemplate();
//		String url = "http://fipeapi.appspot.com/api/1/carros/veiculo/"+ idMarca +"/" + idModelo + "/" + ano +"-1.json";
//		VeiculoFipe veiculoFipe = restTemplate.getForObject(url, VeiculoFipe.class);
////		model.addAttribute("veiculoFipe", veiculoFipe);
//		
////		Anuncio anuncio = new Anuncio(placa, preco, ano, veiculoFipe.getPreco(), new Date(), veiculoFipe.getVeiculo().replaceAll("[R$ ]", ""), veiculoFipe.getMarca());
//		String preco_fipe = veiculoFipe.getPreco().replaceAll("[R$. ]", "").replaceAll(",", ".");
//		Anuncio anuncio = new Anuncio(placa, preco, ano, Float.parseFloat(preco_fipe), new Date(), "fiat", veiculoFipe.getMarca());
//		return ResponseEntity.ok().body(anuncio);
//	}

}
