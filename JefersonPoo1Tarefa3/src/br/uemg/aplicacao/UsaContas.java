package br.uemg.aplicacao;
import br.uemg.entidades.*;

public class UsaContas {

	public static void main(String[] args) {
		
	        // Criando as contas
	        ContaBancaria conta1 = new ContaPoupança("João", 12345, 1000f, 5);
	        ContaBancaria conta2 = new ContaEspecial("Maria", 67890, 2000f, 500f);

	        // Operações nas contas
	        conta1.depositar(500f);
	        conta2.sacar(2500f);

	     // Calcular novo saldo para todas as contas
	        conta1.calcularNovoSaldo(0.05f);
	        conta2.calcularNovoSaldo(0.05f);  // Não terá efeito em ContaEspecial

	        // Mostrar dados das contas
	        conta1.mostrarDados();
	        System.out.println();
	        conta2.mostrarDados();
	    }

	        
		
	}


