package model;

public class Persona {
    private String rut;
    private String nombre;
    private Direccion domicilio;

    // Generamos un constructor vacío
    public Persona() {
    }

    // Generamos un constructor con todos los atributos
    public Persona(String rut, String nombre, Direccion domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    // Generamos los getter and setter

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    // Generamos el toString()

    @Override
    public String toString() {
        return "Persona: -> " +
                "RUT: " + rut + " - " +
                "NOMBRE: " + nombre + " -  " +
                "DOMICILIO: " + domicilio +
                "||";
    }
}
