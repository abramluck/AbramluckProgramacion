
package ciclomedia;
import java.util.Scanner;

public class cicloMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        System.out.println("Calculadora de Media");
        System.out.println("Ingrese los números (Ingrese 0 para salir):");

        while (true) {
            System.out.print("Número: ");
            double numero = scanner.nextDouble();

            if (numero == 0) {
                break;
            }

            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("Conjunto de números ingresados: " + contador);
            System.out.printf("La media es: %.2f%n", media);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}