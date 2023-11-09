package entities;

public class PessoaFisica {

	private String nome;
	private String rg;
	private String cpf;
	private String pai;
	private String mae;
	private String cidade;
	private String estado;
	private String nascimento;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, String rg, String cpf, String pai, String mae, String cidade, String estado,
			String nascimento) {
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "PessoaFisica\n{\n   Nome: " + nome + "\n   RG: " + rg + "\n   CPF: " + cpf + "\n   Nome do Pai: " + pai + "\n   Nome da Mãe: " + mae
				+ "\n   Cidade: " + cidade + "\n   Estado: " + estado + "\n   Data de Nascimento: " + nascimento + "\n}";
	}
}
