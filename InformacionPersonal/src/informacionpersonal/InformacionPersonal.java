
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Abraham",
           apellido_paterno = "Urzua",
           apellido_materno = "Garduno";
    int edad = 19;
    int numero_de_cuenta = 1817129;
    String semeste_en_curso = "cuarto";
    String materias = "Pogramacion, Administracion, Desarrollo de aplicaciones web";
    String hobbies = "Creas cosas";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo del alumno es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su edad es: " + edad );
        System.out.println("Su numero de cuenta: " + numero_de_cuenta );
        System.out.println("Cursa el semestre: " + semeste_en_curso);
        System.out.println("Las materias que cursa son: " + materias);
        System.out.println("Su pasatiempo es: " + hobbies);
        
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
