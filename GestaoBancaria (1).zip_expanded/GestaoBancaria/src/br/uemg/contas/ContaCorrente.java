package br.uemg.contas;

public class ContaCorrente {
	private String numeroConta;
	private float saldo;
	private float limite;
	private String dataAbertura;

	// Abertura de conta com depósito obrigatório
	public ContaCorrente(String numeroConta, float saldo, float limite, String dataAbertura) {
		this.numeroConta = numeroConta;
		this.saldo = saldo + limite; // Saldo com limite
		this.limite = limite;
		this.dataAbertura = dataAbertura;
	}

	// Não é exigido um depósito na abertura da conta, se assim a regra de negócio
	// permitir.
	public ContaCorrente(String correntista, String numeroConta, float limite, String dataAbertura) {
		this.saldo = 0.0F;
		this.limite = limite;
		this.dataAbertura = dataAbertura;
	}

	public boolean saca(float valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true; // saque realiazado com sucesso
		} else {
			return false; // saque não realizado. Saldo insuficiente.
		}
	}

	public void deposita(float valor) {
		saldo += valor; // saldo = saldo + valor;
	}
	
	// Transfere entre contas
	public boolean transfere(float valor, ContaCorrente destino) {
		if (this.saca(valor)) {  // saque foi possível?
			destino.deposita(valor);  // sim, então transfere.
			return true;
		}
		return false;
	}

	// Obtém o saldo com o limite incluído.
	public float getSaldoLimite() {
		return saldo;
	}

	// Obtém saldo sem o limite.
	public float getSaldo() {
		return saldo - limite;
	}

	
	public float getLimite() {
		return limite;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}

	@Override
	public String toString() {
		return "ContaCorrente\n numeroConta=" + numeroConta + "\n saldo= R$ " + (saldo - limite)
				+ "\n saldo com limite= R$ " + saldo +  "\n limite= R$ " + limite + "\n dataAbertura=" + dataAbertura;
	}
	
	

}
