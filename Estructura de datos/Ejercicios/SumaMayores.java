package Ejercicios;
public class SumaMayores {

    public static void main(String[] args) {

        // Creamos un arreglo con varios números
        int[] arreglo = {5, 8, 2, 10, 4, 15};

        // Número que vamos a utilizar como límite
        int numero = 6;

        // Llamamos al método recursivo
        int resultado = sumarMayores(arreglo, numero, 0);

        // Mostramos el resultado
        System.out.println("La suma de los números mayores a " + numero + " es: " + resultado);
    }

    // Método recursivo que suma los números mayores al número dado
    public static int sumarMayores(int[] arreglo, int numero, int posicion) {

        // Caso base: llegamos al final del arreglo
        if (posicion == arreglo.length) {
            return 0;
        }

        // Si el número actual es mayor que el número dado
        if (arreglo[posicion] > numero) {

            // Lo sumamos y continuamos con la siguiente posición
            return arreglo[posicion] + sumarMayores(arreglo, numero, posicion + 1);
        }

        // Si no es mayor, continuamos sin sumarlo
        return sumarMayores(arreglo, numero, posicion + 1);
    }
}