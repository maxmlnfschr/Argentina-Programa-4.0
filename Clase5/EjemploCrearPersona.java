package Clase5;

import EShop.Persona;

import java.util.Scanner;

public class EjemploCrearPersona {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombreIngresado = scn.nextLine();

        Persona persona1 = new Persona(nombreIngresado, "Random");

        Persona persona2 = new Persona(nombreIngresado, "Random");

        persona1.setApellido("Fischer");
        persona2.setApellido("Fischer");

        System.out.println("La persona se creó con los siguientes datos:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());

        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
    }
}