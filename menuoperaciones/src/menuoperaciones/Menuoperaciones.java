/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuoperaciones;
import java.util.Scanner;

public class Menuoperaciones {

    public static void Suma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.printf("La suma de %.5f y %.5f es %.5f%n", num1, num2, resultado);
    }

    public static void Resta(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.printf("La resta de %.5f y %.5f es %.5f%n", num1, num2, resultado);
    }

    public static void Multiplicacion(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.printf("La multiplicación de %.5f y %.5f es %.5f%n", num1, num2, resultado);
    }

    public static void Division(double num1, double num2) {
        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.printf("La división de %.5f entre %.5f es %.5f%n", num1, num2, resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    public static void Resultado(double num1, double num2) {
        System.out.println("Resultados:");
        Suma(num1, num2);
        Resta(num1, num2);
        Multiplicacion(num1, num2);
        Division(num1, num2);
    }
}
