package br.uemg.contas;

import br.uemg.clientes.Endereco;
import br.uemg.clientes.Cliente;
import java.util.ArrayList;

public class Agencia {
	private String codigo;
	private Endereco endereco;
	private ArrayList<Cliente> clientes;   // cadastro de correntistas da agência bancária
	
	
	public Agencia(String codigo, Endereco endereco) {
		this.codigo = codigo;
		this.endereco = endereco;
		this.clientes = new ArrayList<>();  // cadastro inicialmente sem clientes
	}

	
	public Cliente procuraCliente(String cpf) {
		for(Cliente cli : clientes) {   // Cliente encontrado?
			if (cli.getCpf().equals(cpf)) {  //Sim, então retorna o cliente encontrado.
				return cli;
			}
		}
		
		return null;  // cliente inexistente
	}
	
	public void cadastraCliente(Cliente novoCliente, ContaCorrente conta) {
		this.clientes.add(novoCliente);
		novoCliente.abreConta(conta);
	}

	public String getCodigo() {
		return codigo;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Cdigo´da Agência: " + codigo + endereco;
	}
	
	
	
	
}
