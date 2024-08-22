package br.uemg.clientes;

import java.util.ArrayList;

import br.uemg.contas.ContaCorrente;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private ArrayList<ContaCorrente> contas;
	
	
	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contas = new ArrayList<>();
	}

	
	public void abreConta(ContaCorrente conta) {
		this.contas.add(conta);
	}

	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "/Nome do Correntista: " + nome + "\nCPF: " + cpf + endereco;
	}
	
	
	
	
	
	
}
