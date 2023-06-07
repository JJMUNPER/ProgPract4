package org.losremedios.prog.ut4.Practica;

import java.util.Arrays;

public class Ap3 {

    public static void main(String[] args) {

        int tamanio = 100;
        int[] array = numerosRandom(tamanio);

        int posicion = 10;
        int nuevoValor = 99;

        System.out.print("Imprimo el array aleatorio de tamaño " + tamanio + ": ");
        System.out.println(Arrays.toString(array) + "\n");

        System.out.print("Imprimo el número mayor: ");
        System.out.println(numeroMayor(array)  + "\n");

        System.out.print("Imprimo el número menor: ");
        System.out.println(numeroMenor(array, tamanio)  + "\n");

        System.out.print("Imprimo la suma de los números: ");
        System.out.println(suma(array) + "\n");

        System.out.print("Imprimo la media de los números: ");
        System.out.println(media(array) + "\n");

        System.out.print("El número de la posición " + posicion + " ha sido sustituido por el número " + nuevoValor + ". ");
        System.out.println("Imprimo el array con el número sustituido: ");
        System.out.println(Arrays.toString(sustituirValor(array, 10, 99)));
    }

    public static int[] numerosRandom (int tamanio) {
        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * tamanio);
        }
        return array;
    }

    public static int numeroMayor (int[] a) {
        int[] b = a.clone();
        int numMayor = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > numMayor) {
                numMayor = b[i];
            }
        }
        return numMayor;
    }

    public static int numeroMenor (int[] a, int tamanio) {
        int[] c = a.clone();
        int numMenor = tamanio;
        for (int i = 0; i < c.length; i++) {
            if (c[i] < numMenor) {
                numMenor = c[i];
            }
        }
        return numMenor;
    }

    public static int suma(int[] a) {
        int suma = 0;
        for (int numero : a) {
            suma += numero;
        }
        return suma;
    }

    public static int media(int[] a) {
        int suma = suma(a);
        return suma / a.length;
    }

    public static int[] sustituirValor(int[] a, int posicion, int nuevoValor) {
        a[posicion] = nuevoValor;
        return a;
    }
}
