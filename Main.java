package org.losremedios.prog.ut4.Practica;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Geometria tri1 = new Triangulo(3., 4., 5.);
        Geometria tri2 = new Triangulo(4., 5., 6.);
        Geometria cua1 = new Cuadrado(5.);
        Geometria cua2 = new Cuadrado(9.);
        Geometria cir1 = new Circulo(5.5);
        Geometria cir2 = new Circulo(9.99);

        Geometria[] geometrias = {tri1, tri2, cua1, cua2, cir1, cir2};

        System.out.println("El área de todas las geometrías es: " + calcularArea(geometrias) + " cm2" );
        System.out.println("El perímetro de todas las geometrías es: " + calcularPerimetro(geometrias) + " cm" );
    }

    static double calcularArea(Geometria[] calculoArea) {

        double totalAreas = 0;
        boolean primerCirculo = true, primerCuadrado = true, primerTriangulo = true;

        for (int i = 0; i < calculoArea.length; i++) {
            totalAreas += calculoArea[i].calcularArea();

            if (primerCirculo && calculoArea[i] instanceof Circulo) {
                primerCirculo = false;
                ((Circulo) calculoArea[i]).colorear("Azul");
            }

            else if (primerCuadrado && calculoArea[i] instanceof Cuadrado) {
                primerCuadrado = false;
                ((Cuadrado) calculoArea[i]).colorear("Azul");
            }

            else if (primerTriangulo && calculoArea[i] instanceof Triangulo) {
                primerTriangulo = false;
                ((Triangulo) calculoArea[i]).colorear("Azul");
            }
        }
        return totalAreas;
    }

    static double calcularPerimetro(Geometria[] calcularArea) {

        double totalPerimetros = 0;

        for(int i = 0; i < calcularArea.length; i++) {
            totalPerimetros += calcularArea[i].calcularPerimetro();
        }
        return totalPerimetros;
    }
}