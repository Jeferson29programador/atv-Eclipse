package br.uemg.principal;

import br.uemg.contas.Agencia;
import br.uemg.contas.ContaCorrente;
import br.uemg.clientes.Endereco;
import br.uemg.clientes.Cliente;

public class UsaContaCorrente {

	public static void main(String[] args) {
		Endereco end1 = 
				new Endereco("Av. Sobe e Desce, 9.999", "Universitário", "Ituiutaba", "38192-550","Minas Gerais");
		Endereco end2 = 
				new Endereco("Av. das Acacias, 7.900", "Universitário", "Ituiutaba", "38198-550","Minas Gerais");
			
		Agencia ag1 = new Agencia("5784", end1);
		
		ContaCorrente cc1 = new ContaCorrente("13243-X", 200.00F, 1000.00F, "10/04/2024");
		ContaCorrente cc2 = new ContaCorrente("98765-0", 100.00F, 2000.00F, "10/04/2024");
		
		Cliente cli1 = new Cliente("Roberto Carlos", "123456789-00", end2);
		
		ag1.cadastraCliente(cli1, cc1);
		
		System.out.println(ag1);
		
		
		
//		System.out.println(cc1);  // imprime relatório da situação atual da conta.
//		System.out.println(); // salta 1 linha
//		
//		System.out.println(cc2);  // imprime relatório da situação atual da conta.
//		System.out.println(); // salta 1 linha
//		
//		System.out.println("Depositando R$ 300,00");
//		cc1.deposita(300.00F);
//		
//		System.out.println(cc1); 
//		System.out.println(); // salta 1 linha
//		
//		saca(cc1, 500.00F);
//		
//		System.out.println(); // salta 1 linha
//
//		System.out.println(cc1);
//		
//		saca(cc1, 500.00F);
//		
//
//		System.out.println(); // salta 1 linha
//
//		System.out.println(cc1);
//		
//		saca(cc1, 1000.00F);
//		
//
//		System.out.println(); // salta 1 linha
//
//		System.out.println(cc1);
//		
//		saca(cc1, 500.00F);
//
//		System.out.println(); // salta 1 linha
//
//		System.out.println(cc1);
		
		
	}
	
	private static void saca(ContaCorrente cc, float valor) {
		System.out.println("\nSacando R$ " + valor);
		if (cc.saca(valor)) {
			System.out.println("Saque realizado com sucesso...");
		}
		else {
			System.out.println("Saque não realizado, saldo insuficiente...");
		}
		
	}

}
