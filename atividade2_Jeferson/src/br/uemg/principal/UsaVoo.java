package br.uemg.principal;
import br.uemg.classes.*;

public class UsaVoo {
    public static void main(String[] args) {
        // Criando uma instância de Data
        Data dataVoo = new Data(23, 4, 2024);

        // Criando uma instância de Voo
        Voo voo = new Voo("1234", dataVoo, 100);

        // Testando os métodos da classe Voo
        System.out.println("Número do próximo assento livre: " + voo.proximoLivre());
        System.out.println("Verificando assento 5: " + voo.verifica(5));
        System.out.println("Ocupando assento 5: " + voo.ocupa(5));
        System.out.println("Verificando assento 5: " + voo.verifica(5));
        System.out.println("Número de vagas disponíveis: " + voo.vagas());
        System.out.println("Número do voo: " + voo.retVoo());
        System.out.println("Data do voo: " + voo.retData());
    }
}