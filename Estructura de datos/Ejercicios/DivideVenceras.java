package Ejercicios;
public class DivideVenceras {

    public static void main(String[] args) {

        // Creamos un arreglo de 4 números
        int[] numeros = {3, 4, 2, 6};

        // Llamamos al método indicando el inicio y el final
        int resultado = sumar(numeros, 0, numeros.length - 1);

        // Mostramos el resultado
        System.out.println("La suma de los números es: " + resultado);
    }

    // Método recursivo utilizando divide y vencerás
    public static int sumar(int[] numeros, int inicio, int fin) {

        // Caso base: cuando solo queda un número
        if (inicio == fin) {
            return numeros[inicio];
        }

        // Encontramos la posición del medio
        int medio = (inicio + fin) / 2;

        // Dividimos y sumamos la parte izquierda
        int izquierda = sumar(numeros, inicio, medio);

        // Dividimos y sumamos la parte derecha
        int derecha = sumar(numeros, medio + 1, fin);

        // Combinamos los resultados
        return izquierda + derecha;
    }
}


