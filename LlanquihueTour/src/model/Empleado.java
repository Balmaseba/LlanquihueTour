package model;

public class Empleado extends Persona {  // Hereda atributos de la clase Persona

    private String cargo;

    // Generamos los constructores de los atributos heredados y del atributo propioo de la clase
    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(String rut, String nombre, Direccion domicilio, String cargo) {
        super(rut, nombre, domicilio);
        this.cargo = cargo;
    }


    // Generamos el toString()

    @Override
    public String toString() {
        return super.toString() + "Empleado -> " +
                "Cargo: " + cargo + "||";
    }
}
