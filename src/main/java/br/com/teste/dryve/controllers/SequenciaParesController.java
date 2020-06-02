package br.com.teste.dryve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SequenciaParesController {
	
	@SuppressWarnings("null")
	@GetMapping(value = "/desafio1c/somarpares")
	public String somarPares(Model model, @RequestParam int n, @RequestParam String seq) {
		String[] seqChar = null;
		int seqInt = 0;
		int somaPares = 0;
		seq = seq.replaceAll(" ", "");
		seqChar = seq.split("", n);
		for (int i = 0; i < seqChar.length; i++) {
			seqInt = Integer.parseInt(seqChar[i]);
			
			if (seqInt % 2 == 0) {
				somaPares += seqInt;
			}
		}
		model.addAttribute("soma", somaPares);
		return "desafio1c";
	}

}
