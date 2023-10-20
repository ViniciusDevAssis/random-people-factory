package entities;

import java.time.LocalDate;

public class PessoaJuridica {

	private Integer cnpj;
	private Integer inscricao;
	private String razao;
	private String fantasia;
	private String logradouro;
	private Integer cep;
	private Integer numero;
	private String bairro;
	private String municipio;
	private String uf;
	private Integer telefone;
	private String email;
	private LocalDate inclusao;
	private LocalDate situacao;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(Integer cnpj, Integer inscricao, String razao, String fantasia, String logradouro, Integer cep,
			Integer numero, String bairro, String municipio, String uf, Integer telefone, String email, LocalDate inclusao,
			LocalDate situacao) {
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

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getInscricao() {
		return inscricao;
	}

	public void setInscricao(Integer inscricao) {
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

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
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

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getInclusao() {
		return inclusao;
	}

	public void setInclusao(LocalDate inclusao) {
		this.inclusao = inclusao;
	}

	public LocalDate getSituacao() {
		return situacao;
	}

	public void setSituacao(LocalDate situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "PessoaJuridica\n{\n   CNPJ: " + cnpj + "\n   Inscricao Estadual: " + inscricao + "\n   Razao: " + razao + "\n   Fantasia: "
				+ fantasia + "\n   Logradouro: " + logradouro + "\n   CEP: " + cep + "\n   N°: " + numero + "\n   Bairro: " + bairro
				+ "\n   Municipio: " + municipio + "\n   UF: " + uf + "\n   Telefone: " + telefone + "\n   Email: " + email
				+ "\n   Inclusao: " + inclusao + "\n   Situacao: " + situacao + "\n]";
	}
}
