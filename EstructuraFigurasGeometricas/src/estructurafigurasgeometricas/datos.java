
package estructurafigurasgeometricas;

import javax.swing.JOptionPane;

public class datos {
    public void ejecutarPrograma() {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción"));
            
            switch (opcion) {
                case 1:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
                    Figuras.areaCirculo(radio);
                    break;
                case 2:
                    double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                    Figuras.areaCuadrado(ladoCuadrado);
                    break;
                case 3:
                    double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo"));
                    double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo"));
                    Figuras.areaTriangulo(baseTriangulo, alturaTriangulo);
                    break;
                case 4:
                    double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo"));
                    double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo"));
                    Figuras.areaRectangulo(baseRectangulo, alturaRectangulo);
                    break;
                case 5:
                    double radioEsfera = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la esfera"));
                    Figuras.areaEsfera(radioEsfera);
                    break;
                case 6:
                    double aristaCubo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la arista del cubo"));
                    Figuras.areaCubo(aristaCubo);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                   
}
}
}
}