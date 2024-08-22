package br.uemg.entidades;

public class ContaEspecial extends ContaBancaria{
	private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldoInicial, float limite) {
        super(cliente, num_conta, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        if (getSaldo() + limite >= valor) {
            depositar(-valor);
            return true;
        } else {
            System.out.println("Saldo e limite insuficientes.");
            return false;
        }
    }

    public float getLimite() {
        return limite;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite: " + limite);
    }

}
