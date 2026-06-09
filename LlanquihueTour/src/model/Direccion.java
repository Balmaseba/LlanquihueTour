package model;

public class Direccion {
    private String calle;
    private String ciudad;

    // Generamos el constructor vacio
    public Direccion() {
    }

    // Generamos el constructor para ambos atributos
    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    // Generamos getter y setter

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Generamos el toString()

    @Override
    public String toString() {
        return "Direccion: " + calle + ", " + ciudad;
    }
}
