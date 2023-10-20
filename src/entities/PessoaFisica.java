package entities;

import java.time.LocalDate;

public class PessoaFisica {

	private String nome;
	private Integer rg;
	private Integer cpf;
	private String pai;
	private String mae;
	private String cidade;
	private String estado;
	private LocalDate nascimento;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Integer rg, Integer cpf, String pai, String mae, String cidade, String estado,
			LocalDate nascimento) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.pai = pai;
		this.mae = mae;
		this.cidade = cidade;
		this.estado = estado;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "PessoaFisica\n{\n   Nome: " + nome + "\n   RG: " + rg + "\n   CPF: " + cpf + "\n   Nome do Pai: " + pai + "\n   Nome da Mãe: " + mae
				+ "\n   Cidade: " + cidade + "\n   Estado: " + estado + "\n   Data de Nascimento: " + nascimento + "\n}";
	}
}
