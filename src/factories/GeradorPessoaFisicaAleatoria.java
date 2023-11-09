package factories;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import config.DadosPessoaFisica;
import entities.PessoaFisica;
import pessoaFactory.PessoaFisicaFactory;

public class GeradorPessoaFisicaAleatoria implements PessoaFisicaFactory{

	private Random random = new Random();
	private DadosPessoaFisica dados;

    public GeradorPessoaFisicaAleatoria(DadosPessoaFisica dados) {
        this.dados = dados;
    }
	
	@Override
	public PessoaFisica criarPessoaFisica() {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome(gerarNomeAleatorio());
		pessoa.setRg(gerarRgAleatorio());
		pessoa.setCpf(gerarCpfAleatorio());
		pessoa.setPai(gerarNomeAleatorioPai());
		pessoa.setMae(gerarNomeAleatorioMae());
		pessoa.setCidade(selecionarCidadeAleatoria());
		pessoa.setEstado(selecionarEstadoAleatorio());
		pessoa.setNascimento(gerarDataAleatoria());
		return pessoa;
	}
	
	public String gerarNomeAleatorio() {
		List<String> nomes = dados.getNomes();
        List<String> sobrenomes = dados.getSobrenomes();
        String nome = nomes.get(random.nextInt(nomes.size()));
        int indiceSobrenome1 = random.nextInt(sobrenomes.size());
        int indiceSobrenome2;
        do {
            indiceSobrenome2 = random.nextInt(sobrenomes.size());
        } while (indiceSobrenome2 == indiceSobrenome1);
        String sobrenome1 = sobrenomes.get(indiceSobrenome1);
        String sobrenome2 = sobrenomes.get(indiceSobrenome2);
        String nomeCompleto = nome + " " + sobrenome1 + " " + sobrenome2;
        return nomeCompleto;
	}
	
	public String gerarNomeAleatorioPai() {
		List<String> nomes = dados.getNomes();
        List<String> sobrenomes = dados.getSobrenomes();
        String nome = nomes.get(random.nextInt(nomes.size()));
        int indiceSobrenome1 = random.nextInt(sobrenomes.size());
        int indiceSobrenome2;
        do {
            indiceSobrenome2 = random.nextInt(sobrenomes.size());
        } while (indiceSobrenome2 == indiceSobrenome1);
        String sobrenome1 = sobrenomes.get(indiceSobrenome1);
        String sobrenome2 = sobrenomes.get(indiceSobrenome2);
        String nomeCompleto = nome + " " + sobrenome1 + " " + sobrenome2;
        return nomeCompleto;
	}
	
	public String gerarNomeAleatorioMae() {
		List<String> nomes = dados.getNomes();
        List<String> sobrenomes = dados.getSobrenomes();
        String nome = nomes.get(random.nextInt(nomes.size()));
        int indiceSobrenome1 = random.nextInt(sobrenomes.size());
        int indiceSobrenome2;
        do {
            indiceSobrenome2 = random.nextInt(sobrenomes.size());
        } while (indiceSobrenome2 == indiceSobrenome1);
        String sobrenome1 = sobrenomes.get(indiceSobrenome1);
        String sobrenome2 = sobrenomes.get(indiceSobrenome2);
        String nomeCompleto = nome + " " + sobrenome1 + " " + sobrenome2;
        return nomeCompleto;
	}
	
	public String selecionarCidadeAleatoria() {
		List<String> cidades = dados.getCidadesBa();
		String cidade = cidades.get(random.nextInt(cidades.size()));
		return cidade;
	}
	
	public String selecionarEstadoAleatorio() {
		List<String> estados = dados.getEstados();
		String estado = estados.get(random.nextInt(estados.size()));
		return estado;
	}
	
	public String gerarRgAleatorio() {
		long min = 1110011101L;
        long max = 2099999999L;

        Random random = new Random();

        long numeroAleatorio = min + (long) (random.nextDouble() * (max - min));
		String numeroFormatado = formatarNumeroRg(numeroAleatorio);
		return numeroFormatado;
	}
	
	public static String formatarNumeroRg(long numeroAleatorio) {
        String numeroFormatado = String.valueOf(numeroAleatorio);
        if (numeroFormatado.length() == 10) {
            return numeroFormatado.substring(0, 2) + "." + numeroFormatado.substring(2, 5) + "." + numeroFormatado.substring(5, 8) + "-" + numeroFormatado.substring(8);
        }
        return numeroFormatado;
    }
	
	public String gerarCpfAleatorio() {
		long min = 1110011101L;
        long max = 9999999999L;

        Random random = new Random();

        long numeroAleatorio = min + (long) (random.nextDouble() * (max - min));
		String numeroFormatado = formatarNumeroCpf(numeroAleatorio);
		return numeroFormatado;
	}
	
	public static String formatarNumeroCpf(long numeroAleatorio) {
        String numeroFormatado = String.valueOf(numeroAleatorio);
        if (numeroFormatado.length() == 10) {
            return numeroFormatado.substring(0, 3) + "." + numeroFormatado.substring(3, 6) + "." + numeroFormatado.substring(6, 8) + "5-" + numeroFormatado.substring(8);
        }
        return numeroFormatado;
    }
	

	public String gerarDataAleatoria() {
		Calendar calendar = Calendar.getInstance();
		int ano = random.nextInt(124) + 1900;
		calendar.set(Calendar.YEAR, ano);
		int mes = random.nextInt(12);
		calendar.set(Calendar.MONTH, mes);
		int maxDias = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dia = random.nextInt(maxDias) + 1;
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String data = formato.format(calendar.getTime());
		return data;
	}
}
