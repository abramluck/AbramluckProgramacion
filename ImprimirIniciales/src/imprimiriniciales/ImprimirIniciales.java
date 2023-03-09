package imprimiriniciales;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner Este programa imprime las iniciales del nombre introducido por el
 * usuario.
 *
 */
public class ImprimirIniciales {

    Scanner entrada = new Scanner(System.in);

    public void iniciales(String nombre, String apellido) {

        System.out.print("Introduzca su nombre y primer apellido separados por un espacio: ");
        nombre = entrada.nextLine();
        apellido = entrada.nextLine();
        System.out.println("Sus iniciales son " + nombre.charAt(0) + apellido.charAt(0) + ".");

    }

    public static void main(String[] args) {
        ImprimirIniciales iniciales = new ImprimirIniciales();
        String nombre = "";
        String apellido = "";
        iniciales.iniciales(nombre, apellido);
    }

}
