
package estructurafigurasgeometricas;

import javax.swing.JOptionPane;

public class EstructuraFigurasGeometricas {

    public static void areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + String.format("%.5f", area));
    }

    public static void areaCuadrado(double lado) {
        double area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + String.format("%.5f", area));
    }

    public static void areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + String.format("%.5f", area));
    }

    public static void areaRectangulo(double base, double altura) {
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + String.format("%.5f", area));
    }

    public static void areaEsfera(double radio) {
        double area = 4 * Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la esfera es: " + String.format("%.5f", area));
    }

    public static void areaCubo(double arista) {
        double area = 6 * Math.pow(arista, 2);
        JOptionPane.showMessageDialog(null, "El área del cubo es: " + String.format("%.5f", area));
    }
}