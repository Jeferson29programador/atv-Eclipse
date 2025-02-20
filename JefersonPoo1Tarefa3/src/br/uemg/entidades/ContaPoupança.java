package br.uemg.entidades;

public class ContaPoupança extends ContaBancaria {
	private int diaRendimento;

    public ContaPoupança(String cliente, int num_conta, float saldoInicial, int diaRendimento) {
        super(cliente, num_conta, saldoInicial);
        this.diaRendimento = diaRendimento;
    }

   
    public int getDiaRendimento() {
        return diaRendimento;
    }
    @Override
    public void calcularNovoSaldo(float taxaRendimento) {
        depositar(getSaldo() * taxaRendimento);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dia de Rendimento: " + diaRendimento);
    }

}
