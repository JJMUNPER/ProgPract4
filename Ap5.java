package org.losremedios.prog.ut4.Practica;

public class Ap5 {

    public static void main(String[] args) {

        String texto = "Buenos días Buenos días Buenos días Buenos días Buenos días";
        String palabra = "días";

        int numOcurrencias = buscarPalabra(texto, palabra);

        System.out.println("La palabra '" + palabra + "' aparece " + numOcurrencias + " veces en el texto.");
    }

    public static int buscarPalabra(String texto, String palabra) {

        int contador = 0;

        String[] palabras = texto.split(" ");

        for (String xPalabra : palabras) {
            if (xPalabra.equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}
