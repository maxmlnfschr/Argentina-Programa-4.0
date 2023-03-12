package Clase4_Programas_y_Archivos;

public class Sumatoria {
    public static void main(String[] args) throws Exception {

        /*

        int numeros[] = new int[]{2, 24, 56};
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        System.out.println(resultado);
         */

        int[] numeros = new int[]{2, 24, 56};

        System.out.println("Resultado: " + sumatoria(numeros));     // La "impresión" debe estar fuera de la función

    }

    // Función para sumar
    public static int sumatoria(int[] numerosASumar) {      // Un "int" es lo que va a retornar la función
        int resultado = 0;
        for (int i = 0; i < numerosASumar.length; i++) {
            resultado += numerosASumar[i];
        }
        return resultado;
    }

}