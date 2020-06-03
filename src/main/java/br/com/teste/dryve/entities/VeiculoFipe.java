package br.com.teste.dryve.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoFipe {

	private String id;
	private String ano_modelo;
	private String marca;
	private String name;
	private String veiculo;
	private String preco;
	private String combustivel;
	private String referencia;
	private String fipe_codigo;
	private String key;
}
