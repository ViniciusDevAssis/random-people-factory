package config;

import java.util.Arrays;
import java.util.List;

public class DadosPessoaFisica {

	private List<String> nomes;
	private List<String> sobrenomes;
	private List<String> cidadesBa;
	private List<String> estados;
	
	public DadosPessoaFisica() {
		nomes = Arrays.asList("Maria");
		sobrenomes = Arrays.asList("Assis", "Silva");
		cidadesBa = Arrays.asList();
		estados = Arrays.asList();
	}

	public List<String> getNomes() {
		return nomes;
	}

	public List<String> getSobrenomes() {
		return sobrenomes;
	}

	public List<String> getCidadesBa() {
		return cidadesBa;
	}

	public List<String> getEstados() {
		return estados;
	}
	
	
}
