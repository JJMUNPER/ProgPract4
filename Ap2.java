package org.losremedios.prog.ut4.Practica;

public class Ap2 {

    public static void main(String[] args) {

        String texto = "Todo hombre sabio teme tres cosas: la tormenta en el mar, la noche sin luna y la ira de un hombre amable.";

        System.out.println("El número de palabras distintas es: " + contarNumPalabras(texto));
    }

    private static int contarNumPalabras(String texto) {

        texto = texto.toLowerCase();

        String[] stringTexto = texto.split(" ");
        String[] palabrasDistintas = new String[stringTexto.length];

        int contadorDistintas = 0;

        for (String palabra : stringTexto) {
            if (!arrayContieneCadena(palabrasDistintas, contadorDistintas, palabra)) {
                palabrasDistintas[contadorDistintas] = palabra;
                contadorDistintas++;
            }
        }
        return contadorDistintas;
    }

    private static boolean arrayContieneCadena(String[] array, int longitudActualArray, String cadena) {
        boolean encontrada = false;
        for (int i = 0; i < longitudActualArray; i++) {
            if (array[i].equals(cadena)) {
                encontrada = true;
                break;
            }
        }
        return encontrada;
    }
}
