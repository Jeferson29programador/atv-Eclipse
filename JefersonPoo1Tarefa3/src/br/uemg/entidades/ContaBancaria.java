package br.uemg.entidades;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldoInicial) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldoInicial;
    }

    public boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return num_conta;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        // Método padrão que não faz nada
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da Conta: " + num_conta);
        System.out.println("Saldo: " + saldo);
    }
}
