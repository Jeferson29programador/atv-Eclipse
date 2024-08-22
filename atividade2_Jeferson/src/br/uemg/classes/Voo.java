package br.uemg.classes;

public class Voo {
	private String numeroVoo;
    private Data dataVoo;
    private boolean[] assentos;
    private int capacidade;

    public Voo(String numeroVoo, Data dataVoo, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        this.capacidade = capacidade;
        this.assentos = new boolean[capacidade];
    }

    public int proximoLivre() {
        for (int i = 0; i < capacidade; i++) {
            if (!assentos[i]) {
                return i + 1;
            }
        }
        return -1; // Retorna -1 se não houver assentos livres
    }

    public boolean verifica(int numeroAssento) {
        return assentos[numeroAssento - 1];
    }

    public boolean ocupa(int numeroAssento) {
        if (numeroAssento > 0 && numeroAssento <= capacidade && !assentos[numeroAssento - 1]) {
            assentos[numeroAssento - 1] = true;
            return true;
        }
        return false;
    }

    public int vagas() {
        int vagas = 0;
        for (boolean assento : assentos) {
            if (!assento) {
                vagas++;
            }
        }
        return vagas;
    }

    public String retVoo() {
        return numeroVoo;
    }

    public Data retData() {
        return dataVoo;
    }
}
