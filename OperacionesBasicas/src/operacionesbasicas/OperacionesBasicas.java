
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    int valor1 = 10, valor2 = 8, val3 = 6, val4 = 2,val5 = 4,val6 = 2;
    float suma, resta, multiplicación, division;

    public void Operaciones(){
        
        //Reliza el cálculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
        
        //Reliza el cálculo de la resta
        resta= val3 - val4;
        System.out.println("La resta es: " + resta);
        
        //Reliza el cálculo de la multiplicación
        multiplicación = val5 * val6;
        System.out.println("La multiplicación es: " + multiplicación);
        
        //Reliza el cálculo de la división
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.Operaciones();
    }
    
}
