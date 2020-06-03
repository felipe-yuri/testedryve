package br.com.teste.dryve.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Anuncio {
	
	private String placa;
	private float preco_anuncio;
	private int ano;
	private float preco_fipe;
	private Date data_cadastro;
	private String modelo;
	private String marca;
	
}
