package pruebadeoperadores;

/**
 *
 * @author maryse
 *
 * Programa pruebaDeOperadores y su flujo asociado.
 *
 */
public class PruebaDeOperadores {

    int x;
    int y;
    double z;

    public void Calculo() {
        int y = 2;
        double z = 3.0;
        x = 5;
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        y++;
        z--;
        z *= x;
        System.out.println("x + y + z = " + (x + y + z));
    }

    public static void main(String[] args) {

        PruebaDeOperadores calcular = new PruebaDeOperadores();
        calcular.Calculo();
    }

}
