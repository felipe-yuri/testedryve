package br.com.teste.dryve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private String placa;
	
	private int idMarca;
	private int idModelo;
	private float preco;
	private int ano;

}
