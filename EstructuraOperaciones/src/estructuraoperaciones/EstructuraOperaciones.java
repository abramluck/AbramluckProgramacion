
package estructuraoperaciones;

/*Progama que reincorpore la creacion menu, heco con estruturas de control if
    estructura de operaciones
    */
public class EstructuraOperaciones {

    public static void main(String[] args) {
        resultado();
    }
    
    public static void suma() {
        int n1 = 4;
        int n2 = 10;
        int resultado = n1 + n2;
        System.out.println("Suma: " + resultado);
    }
    public static void resta() {
        int n1 = 10;
        int n2 = 4;
        int resultado = n1 + n2;
        System.out.println("Resta: " + resultado);
        }
    public static void multiplicacion() {
        int n1 = 4;
        int n2 = 10;
        int resultado = n1 + n2;
        System.out.println("Multiplicacion: " + resultado);
        }
    public static void division(){
        int n1 = 10;
        int n2 = 4;
        if (n2 != 0) {
            double resultado = (double) n1 / n2;
            System.out.println("Division: "+ String.format("%.3f", resultado));
        } else {
        System.out.println("No se puede dividir por 0");
        }
        }
    
    public static void resultado() {
        suma();
        resta();
        multiplicacion();
        division();
        
    }
}
