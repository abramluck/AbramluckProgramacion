/*Creacion de menu*/
package estructuraoperaciones;

import java.util.Scanner;

public class Numeros {

    public static void numeros() {
        Scanner scanner = new Scanner(System.in);

        int opccion;
        do {
            mostrarMenu();
            opccion = scanner.nextInt();

            switch (opccion) {
                case 1:
                    EstructuraOperaciones.suma();
                    break;
                case 2:
                    EstructuraOperaciones.resta();
                    break;
                case 3:
                    EstructuraOperaciones.multiplicacion();
                    break;
                case 4:
                    EstructuraOperaciones.division();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;

            }

        } while (opccion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

    }
}
