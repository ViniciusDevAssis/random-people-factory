package factories;

import java.util.Random;

import entities.PessoaJuridica;

public class GeradorPessoaJuridicaAleatoria {

private Random random = new Random();
	
	@Override
	public PessoaFisica criarPessoaJuridica() {
		PessoaJuridica pessoa = new PessoaJuridica();
	}
}
