/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author rayug
 * 
 * Programa para el calculo de figuras geometricas
 * circulo, cuadrado, triangulo, rectangulo, esfera y cubo
 */
public class FigurasGeometricas {

   static int areacuadrado (int n1){
      return n1*n1;
    }
    static double areaCirculo(int r){
  double PI=3.1416;
  return  PI * Math.pow(r,2);
 }
    static int areatriangulo(int a, int b){
     return (a*b)/2;
    }
    static int arearectangulo(int b , int h){
     return b*h ;
    }
    static int areacubo(int l, int a){
     return (l*l) * 6;
    }
    static int areaesfera(int r){
        double x = 4;
        double PI=3.1416;
        return PI * Math.pow(r,2);       
    }
   
   

 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int opcion=0;
  do{
   System.out.println();
   System.out.println();
  System.out.println("  MENU DE OPCIONES  ");
  System.out.println("  1. Cuadrado ");
  System.out.println("  2. Circulo ");
  System.out.println("  3. Triangulo  ");
  System.out.println("  4. Rectangulo ");
  System.out.println("  5. Cubo ");
  System.out.println("  6. Esfera ");
  System.out.println(" Ingrese una opcion ");
  opcion = teclado.nextInt();
  switch (opcion){
  case 1:
   System.out.println("Ingrese el lado ");
   int lado = teclado.nextInt();
      System.out.println(" EL AREA DEL CUADRADO ES :"+ areacuadrado(lado));
  break;
        case 2:
          System.out.println("Ingrese el radio ");
         int radio = teclado.nextInt();
           System.out.println(" EL AREA DEL CIRCULO ES :"+ areaCirculo(radio));
  break;
        case 3:
         System.out.println(" Ingrese la base ");
         int base = teclado.nextInt();
         System.out.println(" Ingrese la altura ");
         int altura = teclado.nextInt();
         
         System.out.println(" EL AREA DEL TRIANGULO ES :"+areatriangulo(base,altura));
  break;
        case 4:
         System.out.println(" Ingrese la BASE ");
         int base_rec = teclado.nextInt();
         System.out.println(" Ingrese la ALTURA ");
         int altura_rec = teclado.nextInt();
         System.out.println(" EL AREA DEL RECTANGULO ES :"+arearectangulo(base_rec,altura_rec));
        break;
        case 5:
         System.out.println(" Ingrese el lado");
         int perimetro = teclado.nextInt();
         System.out.println("Ingrese el lado");
         int lado1= teclado.nextInt();
         System.out.println(" EL AREA DEL CUBO ES :"+areacubo(perimetro,lado1));
        break;
        case 6:
         System.out.println("Ingrese el radio ");
         int radio1 = teclado.nextInt();
           System.out.println(" EL AREA DEL CIRCULO ES :"+ areaesfera(radio1));
        break; 

  }
 
  }while(opcion!=7);
 }

}
    
    