package Clase1_Algoritmos;

public class PracticoClase1 {
    public static void main(String[] args) throws Exception {

        // a. Utilizando la sentencia while, imprima todos
        // los números entre dos variables “a” y “b”.

        int a = 5;
        int b = 14;
        boolean extra = false;

        while (a <= b) {
            System.out.println(a);
            a += 1;
        }

        // b. Muestre los números pares.

        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a += 1;
        }

        // Con una variable extra, elija si se deben mostrar
        // los números pares o impares.

        while (a <= b) {
            if (extra) {
                if (a % 2 == 0) {
                    System.out.println(a);
                }
            } else if (a % 2 != 0) {
                System.out.println(a);
            }
            a += 1;
        }


        // d: Utilizando la sentencia for, hacer lo mismo
        // que en (b) pero invirtiendo el orden.

        for (int num=14; num>5; num-=2) {
            System.out.println(num);
        }

        // 2. “Determinar si una persona pertenece al segmento de ingresos altos”.

        float ingresosHogar = 489082;
        int cantidadVehiculos = 1;
        int antiguedadVehiculos = 5;
        int cantidadInmuebles = 2;
        boolean tieneEmbarcacion = false;
        boolean tieneAeroave = false;
        boolean tieneActivos = false;

        if ((ingresosHogar >= 489083) || (cantidadVehiculos >= 3 && antiguedadVehiculos < 5) ||
                (cantidadInmuebles >= 3) || (tieneEmbarcacion || tieneAeroave || tieneActivos)) {
            System.out.println("Pertenece al segmento de ingresos altos.");
        } else {
            System.out.println("NO pertenece al segmento de ingresos altos.");
        }
    }
}