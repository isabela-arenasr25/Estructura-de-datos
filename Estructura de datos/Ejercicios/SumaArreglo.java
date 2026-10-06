package Ejercicios;
public class SumaArreglo {

    public static void main(String[] args) {

        // Creamos un arreglo con varios números
        int[] arreglo = {5, 8, 2, 10, 4};

        // Llamamos al método y guardamos el resultado
        int resultado = sumar(arreglo, 0);

        // Mostramos el resultado en pantalla
        System.out.println("La suma de los números es: " + resultado);
    }

    // Método recursivo que suma los números del arreglo
    public static int sumar(int[] arreglo, int posicion) {

        // Caso base: cuando llegamos al final del arreglo
        if (posicion == arreglo.length) {
            return 0;
        }

        // Sumamos el número actual y llamamos nuevamente al método
        return arreglo[posicion] + sumar(arreglo, posicion + 1);
    }
}