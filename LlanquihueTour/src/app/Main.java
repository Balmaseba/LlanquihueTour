
package app;

import model.Persona;
import model.Empleado;
import model.Direccion;

public class Main {

    public static void main(String[] args){
        // 1.- Creamos direcciones
        Direccion dir1 = new Direccion ("Pedro de Valdivia 113", "Santiago");
        Direccion dir2 = new Direccion ("18 de Septiembre 16", "Chillán");
        Direccion dir3 = new Direccion ("Anibal pinto 154", "Concepción");

        // 2.- Creamos objetos
        Persona persona1 = new Persona("11.222.333-4", "Pablo Perez", dir1);
        Empleado empleado1 = new Empleado("22.333.444-5", "Ignacio Lagos", dir2, "Guía turístico");
        Empleado empleado2 = new Empleado("33.444.555-6", "Daniel Salas", dir2, "Secretario");

        // 3.- Mostrar
        System.out.println("---- Registro Llanquihue tour .---");
        System.out.println(persona1);
        System.out.println(empleado1);
        System.out.println(empleado2);



    }


}