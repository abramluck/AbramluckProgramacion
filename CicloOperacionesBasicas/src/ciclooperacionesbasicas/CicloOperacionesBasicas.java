
package ciclooperacionesbasicas;

import java.util.Scanner;

public class CicloOperacionesBasicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion("Suma", scanner);
                    break;
                case 2:
                    realizarOperacion("Resta", scanner);
                    break;
                case 3:
                    realizarOperacion("Multiplicación", scanner);
                    break;
                case 4:
                    realizarOperacion("División", scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----");
        System.out.println("1. Realizar suma");
        System.out.println("2. Realizar resta");
        System.out.println("3. Realizar multiplicación");
        System.out.println("4. Realizar división");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void realizarOperacion(String nombreOperacion, Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a " + nombreOperacion.toLowerCase() + ": ");
        int cantidadNumeros = scanner.nextInt();

        double resultado = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            switch (nombreOperacion.toLowerCase()) {
                case "suma":
                    resultado += numero;
                    break;
                case "resta":
                    if (i == 1) {
                        resultado = numero;
                    } else {
                        resultado -= numero;
                    }
                    break;
                case "multiplicación":
                    if (i == 1) {
                        resultado = numero;
                    } else {
                        resultado *= numero;
                    }
                    break;
                case "división":
                    if (i == 1) {
                        resultado = numero;
                    } else {
                        resultado /= numero;
                    }
                    break;
            }
        }

        System.out.println("\nOperación: " + nombreOperacion);
        System.out.println("Números ingresados: " + cantidadNumeros);
        System.out.println("Resultado: " + resultado + "\n");
    }
}
    