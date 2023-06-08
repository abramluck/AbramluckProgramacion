
package menuoperaciones;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese la opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Funciones.Suma(num1, num2);
                break;
            case 2:
                Funciones.Resta(num1, num2);
                break;
            case 3:
                Funciones.Multiplicacion(num1, num2);
                break;
            case 4:
                Funciones.Division(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        scanner.close();
    }
}