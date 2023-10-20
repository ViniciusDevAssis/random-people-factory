package factories;

import java.util.Random;

import entities.PessoaFisica;
import pessoaFactory.PessoaFisicaFactory;

public class GeradorPessoaFisicaAleatoria implements PessoaFisicaFactory{

	private Random random = new Random();
	
	@Override
	public PessoaFisica criarPessoaFisica() {
		PessoaFisica pessoa = new PessoaFisica();
	}
}
