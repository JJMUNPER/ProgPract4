package org.losremedios.prog.ut4.Practica;

public class Triangulo extends Geometria implements Coloreable {

    private double base;
    private double altura;
    private double lados = 3.;
    String color;

    public Triangulo(double base, double altura, double lados){
        this.base = base;
        this.altura = altura;
        this.lados = lados;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = lados + base;
        return perimetro;
    }
}