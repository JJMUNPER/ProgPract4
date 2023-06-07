package org.losremedios.prog.ut4.Practica.Apartado6;

public class Sede {

    private String nombreCiudad;
    private String departamento1;
    private String departamento2;
    private String departamento3;

    Sede(String nombreCiudad, String departamento1, String departamento2, String departamento3) {
        this.nombreCiudad = nombreCiudad;
        this.departamento1 = departamento1;
        this.departamento2 = departamento2;
        this.departamento3 = departamento3;
    }

    public Sede(String nombre) {
        this.nombreCiudad = nombre;
    }

    public String getNombre() {
        return nombreCiudad;
    }

    public void setNombre(String nombre) {
        this.nombreCiudad = nombre;
    }

}
