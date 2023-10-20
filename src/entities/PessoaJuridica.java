package entities;

public class PessoaJuridica {

	private String cnpj;
	private String inscricao;
	private String razao;
	private String fantasia;
	private String logradouro;
	private String cep;
	private String numero;
	private String bairro;
	private String municipio;
	private String uf;
	private String telefone;
	private String email;
	private String inclusao;
	private String situacao;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String cnpj, String inscricao, String razao, String fantasia, String logradouro, String cep,
			String numero, String bairro, String municipio, String uf, String telefone, String email, String inclusao,
			String situacao) {
		super();
		this.cnpj = cnpj;
		this.inscricao = inscricao;
		this.razao = razao;
		this.fantasia = fantasia;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
		this.inclusao = inclusao;
		this.situacao = situacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInclusao() {
		return inclusao;
	}

	public void setInclusao(String inclusao) {
		this.inclusao = inclusao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
