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

	public List<String> getNomes() {
		return nomes;
	}

	public List<String> getSobrenomes() {
		return sobrenomes;
	}

	public List<String> getFantasia() {
		return fantasia;
	}

	public List<String> getAtividade() {
		return atividade;
	}

	public List<String> getCidadesBa() {
		return cidadesBa;
	}

	public List<String> getBairros() {
		return bairros;
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getEnderecos() {
		return enderecos;
	}
	
	
}
