package Clase3;

public class EjercicioUno {
    public static void main(String[] args) throws Exception {

        // ARRAY

        int numeros[] = new int[5];

        numeros[0] = 15;
        numeros[1] = 20;
        numeros[2] = 10;
        numeros[3] = 5;
        numeros[4] = 50;

        // int numeros[] = new int[]{1, 37, 16};

        System.out.println(numeros[2]);
        System.out.println(numeros.length);        // length me dice el tamaño del vector

        // Visualizar los datos del vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        char letras[] = {'a', 'b', 'c'};

        for (char letra : letras) {
            System.out.println(letra);
        }

        //

        int suma = 0;    // acumulador

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {    // estoy preguntando si la posición es par, no el contenido
                suma = suma + numeros[i];    // sumo el contenido en la posición
            }
        }
        System.out.println("La suma es: " + suma);


        // STRING

        String texto1 = "Hola";

        texto1.charAt(3);    // acceder al elemento en la posición 3: a

    }
}