package config;

import java.util.Arrays;
import java.util.List;

public class DadosPessoaJuridica {

	private List<String> nomes;
	private List<String> sobrenomes;
	private List<String> fantasia;
	private List<String> atividade;
	private List<String> cidadesBa;
	private List<String> bairros;
	private List<String> estados;
	private List<String> enderecos;
	
	public DadosPessoaJuridica() {
		nomes = Arrays.asList();
		sobrenomes = Arrays.asList();
		cidadesBa = Arrays.asList();
		estados = Arrays.asList();
		enderecos = Arrays.asList();
	}
}
