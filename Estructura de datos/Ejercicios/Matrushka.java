package Ejercicios;
// Define una clase llamada Matrushka
public class Matrushka {

    // Método principal: aquí empieza a ejecutarse el programa
    public static void main(String[] args) {

        // Ciclo for que empieza en 5 y va disminuyendo hasta llegar a 1
        for (int numero = 5; numero >= 1; numero--) {

            // Imprime en pantalla el número de la Matrushka que se está abriendo
            System.out.println("Abriendo matrushka #" + numero);
        }

        // Ciclo for que empieza en 1 y aumenta hasta llegar a 5
        for (int numero = 1; numero <= 5; numero++) {

            // Imprime en pantalla el número de la Matrushka que se está cerrando
            System.out.println("Cerrando matrushka #" + numero);
        }
    }
}