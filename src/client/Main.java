package client;

import config.DadosPessoaFisica;
import entities.PessoaFisica;
import factories.GeradorPessoaFisicaAleatoria;
import pessoaFactory.PessoaFisicaFactory;

public class Main {

	public static void main(String[] args) {
		
		DadosPessoaFisica dados = new DadosPessoaFisica();
		PessoaFisicaFactory factory = new GeradorPessoaFisicaAleatoria(dados);
        PessoaFisica pessoaFicticia = factory.criarPessoaFisica();
        System.out.println(pessoaFicticia.toString());
	}

}
