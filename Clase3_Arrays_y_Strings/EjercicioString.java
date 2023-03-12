package Clase3_Arrays_y_Strings;

public class EjercicioString {
    public static void main(String[] args) throws Exception {
        String texto1 = "Hello World!";
        String texto2 = "Bye World!";
        System.out.println(texto1.charAt(6));    // mostrar el caracter en la posición 6: W

        // Comparar dos strings

        texto1.equals(texto2);

        // Longitud del string

        texto1.length();

        // Visualizar los datos del string
        for (int i = 0; i < texto1.length(); i++) {
            System.out.println(texto1.charAt(i));
        }

        // Métodos...

        System.out.println(texto1.toUpperCase().replace("Hello", "Bye"));

        // Split

        String[] textoPartido = texto1.split(" ");
        System.out.println(textoPartido);
    }
}