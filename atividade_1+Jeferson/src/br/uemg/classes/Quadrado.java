package br.uemg.classes;

public class Quadrado {
    private double lado;
    private double area;
    private double perimetro;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    public void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
