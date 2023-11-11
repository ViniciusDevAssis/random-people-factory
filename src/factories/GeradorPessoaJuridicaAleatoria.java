package factories;

import java.util.Random;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class GeradorPessoaJuridicaAleatoria {

private Random random = new Random();
	
	public PessoaJuridica criarPessoaJuridica() {
		PessoaJuridica pessoa = new PessoaJuridica();
		return pessoa;
	}
}
