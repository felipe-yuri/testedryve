package br.com.teste.dryve.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuantidadeNotas {
	
	private int valor;
	private int notas100;
	private int notas50;
	private int notas20;
	private int notas10;
	private int notas5;
	private int notas2;
	private int notas1;

}
