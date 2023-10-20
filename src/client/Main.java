package client;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		String a = pf.toString();
		String b = pj.toString();
		System.out.println(a);
		System.out.println(b);
	}

}
