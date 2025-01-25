import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoMoneda = NumberFormat.getInstance();

        SuperMercado.supermercado(args);
        Mascotas.mascotas(args);
        Parqueadero.parqueadero(args);
        Tienda.tienda(args);
    }
}
