/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodeinteres;

import java.util.Scanner;
/**
 *
 * @author rayug
 */
public class Calculodeinteres {

   public static void main(String[] args) {
        
        
        double c, i, capital;
        float dias;
        final int t;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el capital a invertir: ");
        c = teclado.nextFloat();
        System.out.print("Introduce el interés anual (%): ");
        dias = teclado.nextFloat();
        System.out.print("Introduce el numero de dias a invertir: ");
        t = teclado.nextInt();
        i = c * dias * t / 360+100;
        capital = c + i;
        System.out.println("El capital final será: " + capital);
        System.out.println("El interés generado será: " + i);
    }
    
}