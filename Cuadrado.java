package org.losremedios.prog.ut4.Practica;

public class Cuadrado extends Geometria implements Coloreable {

    private double lado;
    String color;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    double calcularArea() {
        return Math.pow(lado, 2);
    }

    double calcularPerimetro() {
        return lado * 4;
    }
}