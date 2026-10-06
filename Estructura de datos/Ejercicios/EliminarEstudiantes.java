package Ejercicios;
import java.util.ArrayList;

public class EliminarEstudiantes {

    public static void eliminar(ArrayList<String> estudiantes, int posicion) {
        if (posicion == estudiantes.size()) {  // Caso base: se llega al final de la lista
            return;
        }

        if (estudiantes.get(posicion).charAt(0) == 'A') { // La primera letra del nombre

            estudiantes.remove(posicion);

            eliminar(estudiantes, posicion); // Se revisa esta posición

        } else {

            eliminar(estudiantes, posicion + 1); // Siguiente
        }
    }

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("Andres");
        estudiantes.add("Laura");
        estudiantes.add("Pedro");
        estudiantes.add("Andrea");

        eliminar(estudiantes, 0);

        System.out.println(estudiantes);
    }
}