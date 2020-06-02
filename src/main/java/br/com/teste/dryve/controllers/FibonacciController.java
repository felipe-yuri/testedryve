package br.com.teste.dryve.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FibonacciController {
	
	public long calcularFibonacci(int n) {
		return (n < 2) ? n : calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
	}
	
	@GetMapping(value = "/desafio1a/fibonacci")
	public String fibonacci(@RequestParam int n, Model model) {
		ArrayList<Long> seq = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			seq.add(this.calcularFibonacci(i));
		}
		model.addAttribute("sequenciaFibonacci", seq);
		return "desafio1a";
	}
}
