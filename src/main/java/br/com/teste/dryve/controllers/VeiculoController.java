package br.com.teste.dryve.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import br.com.teste.dryve.entities.Veiculo;
import br.com.teste.dryve.entities.VeiculoFipe;
import br.com.teste.dryve.repositories.VeiculoRepository;

@Controller
public class VeiculoController {

	@Autowired
	VeiculoRepository repository;

	public VeiculoFipe dadosFipe(int idMarca, int idModelo, int ano) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://fipeapi.appspot.com/api/1/carros/veiculo/"+ idMarca +"/" + idModelo + "/" + ano +"-1.json";
		VeiculoFipe veiculoFipe = restTemplate.getForObject(url, VeiculoFipe.class); 
		
		return veiculoFipe;
	}

	@GetMapping(value = "/desafio2/cadastrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Veiculo> anuncio(
			@RequestParam String placa,
			@RequestParam int idMarca, 
			@RequestParam int idModelo,
			@RequestParam float preco,
			@RequestParam int ano) {
		
		String preco_fipe = this.dadosFipe(idMarca, idModelo, ano).getPreco().replaceAll("[R$. ]", "").replaceAll(",", ".");
		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
		
		//TODO consultar banco para pegar o modelo
		Veiculo veiculo = new Veiculo(placa, preco, ano, Float.parseFloat(preco_fipe), formato.format(data), dadosFipe(idMarca, idModelo, ano).getName(), 
				dadosFipe(idMarca, idModelo, ano).getMarca().toUpperCase());
		
//		repository.save(veiculo);
		
		return ResponseEntity.ok().body(veiculo);
	}

}
