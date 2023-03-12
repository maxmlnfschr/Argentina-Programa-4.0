package clase4.programas_archivos;

public class CalcularPromedio {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[] {2, 24, 56};

        int resultado = sumatoria(numeros);
        int promedio = resultado / numeros.length;  // Calculando el promedio, reutilizando la función "sumatoria"

        System.out.println("El promedio es: " + promedio);
    }

    public static int sumatoria(int[] numerosASumar) {      // Un "int" es lo que va a retornar la función
        int resultado = 0;
        for (int i = 0; i < numerosASumar.length; i++) {
            resultado += numerosASumar[i];
        }
        return resultado;
    }
}
