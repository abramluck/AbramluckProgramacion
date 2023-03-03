package calculadoradebonos;

/**
 *
 * @author maryse
 *
 * Este programa calcula e imprime el bono por trabajo de una persona.
 *
 */
public class CalculadoraDeBonos {

    int salario; // salario de una persona
        String mensajeDeBono; // especifica el bono de trabajo
   
    public void Calculo(){
    salario = 50000;
        mensajeDeBono = "Bono = $" + (.02 * salario);
        System.out.println(mensajeDeBono);
        
    }
    
    public static void main(String[] args) {

  CalculadoraDeBonos calcular = new CalculadoraDeBonos ();
  calcular.Calculo();
    }

}
