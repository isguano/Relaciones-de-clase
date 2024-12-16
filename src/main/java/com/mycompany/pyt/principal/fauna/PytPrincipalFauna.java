package com.mycompany.pyt.principal.fauna;

import java.util.Scanner;

public class PytPrincipalFauna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del mamífero:");
        System.out.print("Nombre: ");
        String nombreMamifero = scanner.nextLine();
        System.out.print("Edad: ");
        int edadMamifero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Tipo de pelaje: ");
        String pelajeMamifero = scanner.nextLine();

        Mamifero mamifero = new Mamifero(nombreMamifero, edadMamifero, pelajeMamifero);

        System.out.println("\nIngrese los datos del ave:");
        System.out.print("Nombre: ");
        String nombreAve = scanner.nextLine();
        System.out.print("Edad: ");
        int edadAve = scanner.nextInt();
        System.out.print("Envergadura de alas (en metros): ");
        double envergaduraAve = scanner.nextDouble();
        scanner.nextLine(); 

        Ave ave = new Ave(nombreAve, edadAve, envergaduraAve);

        System.out.println("\nIngrese los datos del reptil:");
        System.out.print("Nombre: ");
        String nombreReptil = scanner.nextLine();
        System.out.print("Edad: ");
        int edadReptil = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Tipo de piel: ");
        String pielReptil = scanner.nextLine();

        Reptil reptil = new Reptil(nombreReptil, edadReptil, pielReptil);

        boolean salir = false;

        while (!salir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Mostrar datos del mamífero");
            System.out.println("2. Mostrar datos del ave");
            System.out.println("3. Mostrar datos del reptil");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nDatos del Mamífero:");
                    System.out.println("Nombre: " + mamifero.nombre);
                    System.out.println("Edad: " + mamifero.edad);
                    System.out.println("Pelaje: " + mamifero.tipoPelaje);
                    mamifero.comer();
                    mamifero.dormir();
                    mamifero.amamantarCrias();
                    break;
                case 2:
                    System.out.println("\nDatos del Ave:");
                    System.out.println("Nombre: " + ave.nombre);
                    System.out.println("Edad: " + ave.edad);
                    System.out.println("Envergadura de alas: " + ave.envergaduraAlas+ " metros");
                    ave.comer();
                    ave.dormir();
                    ave.volar();
                    break;
                case 3:
                    System.out.println("\nDatos del Reptil:");
                    System.out.println("Nombre: " + reptil.nombre);
                    System.out.println("Edad: " + reptil.edad);
                    System.out.println("Piel: " + reptil.tipoEscamas);
                    reptil.comer();
                    reptil.dormir();
                    reptil.arrastrarse();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
