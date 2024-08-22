package br.uemg.clientes;

public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	
	
	public Endereco(String logradouro, String bairro, String cidade, String cep, String estado) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getCep() {
		return cep;
	}


	public String getEstado() {
		return estado;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "\nLogradouro: " + logradouro + "\nbairro: " + bairro + "\ncidade: " + cidade + "\ncep: " + cep
				+ ", estado=" + estado + "]";
	}
	
	
	
	
}
