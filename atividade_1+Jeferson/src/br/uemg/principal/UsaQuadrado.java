package br.uemg.principal;

import br.uemg.classes.Quadrado;

public class UsaQuadrado {
    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado(5); 

        
        quadrado.calcularArea();
        quadrado.calcularPerimetro();
        quadrado.imprimir();
    }
}
