
package restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú del restaurante
        String[] desayuno = {"Desayuno 1", "Desayuno 2", "Desayuno 3"};
        double[] preciosDesayuno = {10.99, 8.99, 7.99};

        String[] comida = {"Platillo 1", "Platillo 2", "Platillo 3"};
        double[] preciosComida = {12.99, 10.99, 9.99};

        String[] cena = {"Platillo 1", "Platillo 2", "Platillo 3"};
        double[] preciosCena = {15.99, 13.99, 11.99};

        String[] bebidas = {"Bebida 1", "Bebida 2", "Bebida 3"};
        double[] preciosBebidas = {2.99, 1.99, 3.99};

        String[] postres = {"Postre 1", "Postre 2", "Postre 3"};
        double[] preciosPostres = {4.99, 3.99, 5.99};

        List<String> orden = new ArrayList<>();
        List<Double> preciosOrden = new ArrayList<>();

        // Mostrar menú y capturar orden
        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una opción del menú (Ingrese 0 para salir): ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            String[] menu;
            double[] preciosMenu;

            switch (opcion) {
                case 1:
                    menu = desayuno;
                    preciosMenu = preciosDesayuno;
                    break;
                case 2:
                    menu = comida;
                    preciosMenu = preciosComida;
                    break;
                case 3:
                    menu = cena;
                    preciosMenu = preciosCena;
                    break;
                case 4:
                    menu = bebidas;
                    preciosMenu = preciosBebidas;
                    break;
                case 5:
                    menu = postres;
                    preciosMenu = preciosPostres;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            System.out.println("----- " + obtenerTituloMenu(opcion) + " -----");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - $" + preciosMenu[i]);
            }

            System.out.print("Seleccione un platillo (Ingrese 0 para cancelar): ");
            int platillo = scanner.nextInt();

            if (platillo == 0) {
                continue;
            }

            if (platillo < 1 || platillo > menu.length) {
                System.out.println("Platillo inválido.");
                continue;
            }

            orden.add(menu[platillo - 1]);
            preciosOrden.add(preciosMenu[platillo - 1]);
        }

        // Calcular total de la orden
        double total = 0;
        for (double precio : preciosOrden) {
            total += precio;
        }

        // Generar ticket de la orden
        System.out.println("----- TICKET -----"

 
                    
}