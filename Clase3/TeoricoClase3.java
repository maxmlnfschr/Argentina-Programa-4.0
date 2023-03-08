package Clase3;

public class TeoricoClase3 {
    public static void main(String[] args) throws Exception {

        // Pregunta 2

        int nums[] = new int[]{1,37,16};
        System.out.println(nums[2]);

        // Pregunta 3
        String texto = "hola que tal?".toUpperCase().replace("hola","chau");
        System.out.println(texto);

        // Pregunta 4

        char letras[] = {'a','b','c','d'};
        int numeros[] = new int[]{1,37,16};

        for(int i=0;i<numeros.length;i++){
            if (numeros[i] < 30) {
                System.out.println(letras[i+1]);
            } else {
                System.out.println(numeros[i]);
            }
        }

        // Pregunta 5

        String[] separado = "3_tristes tigres_del_13".split("_");
        System.out.println(separado[1]);
    }
}
