package Clase3;

import java.util.Arrays;

public class PracticoClase3 {
    public static void main(String[] args) throws Exception {

        // Punto 1
        // A) Dado un String y una letra, cuente la cantidad
        // de apariciones de la letra en el String.

        String texto = "Mañana";
        String letra = "a";
        int contadorLetras = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra.charAt(0)) {
                contadorLetras++;
            }
        }
        System.out.println("Cantidad de \"" + letra + "\" en " + texto + ": " + contadorLetras);

        // B) Dados 3 números y un orden (ascendente o decreciente)
        // ordene los mismos y retornelos en un vector de 3.

        int num1 = 3;
        int num2 = 14;
        int num3 = 21;

        int may = 0;
        int mid = 0;
        int men = 0;

        // String orden = "Ascendente";
        String orden = "Decreciente";

        // Ordenamiento de números.

        if ((num1 > num2) && (num2 > num3)) {
            may = num1;
            mid = num2;
            men = num3;
        } else if ((num1 > num3) && (num3 > num2)) {
            may = num1;
            mid = num3;
            men = num2;

        } else if ((num2 > num1) && (num1 > num3)) {
            may = num2;
            mid = num1;
            men = num3;
        } else if ((num2 > num3) && (num3 > num1)) {
            may = num2;
            mid = num3;
            men = num1;

        } else if ((num3 > num1) && (num1 > num2)) {
            may = num3;
            mid = num1;
            men = num2;
        } else {
            may = num3;
            mid = num2;
            men = num1;
        }

        // Inicialización de los vectores.

        int[] arregloNumerosAscendentes = {men, mid, may};
        int[] arregloNumerosDescendientes = {may, mid, men};

        // Impresión de vectores.

        if (orden.equals("Ascendente")) {
            System.out.println("Orden ascendente: " + Arrays.toString(arregloNumerosAscendentes));
        } else if (orden.equals("Decreciente")) {
            System.out.println("Orden decreciente: " + Arrays.toString(arregloNumerosDescendientes));
        }

        // C) Dado un vector de números, y un número X, que sume
        // todos los números > X y retorne el resultado.

        int[] numeros = {1, 2, 3, 4, 5, 6};
        int numeroEquis = 4;
        int suma = 0;

        for (int numero : numeros) {
            if (numero > numeroEquis) {
                suma += numero;
            }
        }
        System.out.println("La suma de los números > " + numeroEquis + " es: " + suma);

        // Punto 2
        // Genere una clase que tenga los métodos para realizarla codificación
        // y decodificación de un string, dado un número de desplazamiento.

        int numeroDesplazamiento = 2;
        String nuevaCadena = "";

        String cadena = "hola que tal";
        String abecedario = " abcdefghijklmnñopqrstuvwxyz";

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < abecedario.length(); ++j) {
                if (cadena.charAt(i) == abecedario.charAt(j)) {
                    nuevaCadena = cadena.replace(cadena.charAt(i), abecedario.charAt(j+numeroDesplazamiento));
                }
            }
        System.out.print(nuevaCadena.charAt(i));
        }
    }
}