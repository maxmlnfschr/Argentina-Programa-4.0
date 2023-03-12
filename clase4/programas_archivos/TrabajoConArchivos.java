package clase4.programas_archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TrabajoConArchivos {
    public static void main(String[] args) throws Exception {

        // Ruta del archivo de texto
        String ruta = "D:\\Mis Archivos (Local)\\Yo, programo\\GitHub\\Argentina-Programa-4.0\\" +
                "Clase4_Programas_y_Archivos\\Documento de texto.txt";

        // Lectura del archivo, línea por línea
        try {
            for (String linea: Files.readAllLines(Paths.get(ruta))) {

                // Mostrar solo las líneas que comienzan con...
                if (linea.startsWith("2")) {
                    System.out.println(linea);
                }

                // Mostrar todas las líneas
                System.out.println(linea);

                // Mostrar por posición de integrantes
                // System.out.println(linea.split(",")[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading");
        }


        // Escritura del archivo de texto
        try {
            Files.writeString(Paths.get(ruta),"3,MR. Heckles,Ugly Naked Man", StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing");
        }
    }
}
