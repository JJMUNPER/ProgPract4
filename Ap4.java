package org.losremedios.prog.ut4.Practica;

public class Ap4 {

    public static void main(String[] args) {

        String dni = "32071007Z";

        if (validarDNI(dni)) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }
    }

    public static boolean validarDNI(String dni) {
        String patron = "\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]";
        if (!dni.matches(patron)) {
            return false;
        }
        int numero = Integer.parseInt(dni.substring(0, 8));
        char letraCalculada = calcularLetraDNI(numero);
        char letraDNI = dni.charAt(8);
        return letraCalculada == letraDNI;
    }

    public static char calcularLetraDNI(int numero) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numero % 23;
        return caracteres.charAt(indice);
    }
}
