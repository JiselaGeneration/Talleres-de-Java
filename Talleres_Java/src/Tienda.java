import java.text.NumberFormat;
import java.util.Scanner;

public class Tienda {
    public static void tienda(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoMoneda = NumberFormat.getInstance();

        //! Promociones en una Tienda de Ropa
        System.out.println("Promociones en una Tienda de Ropa \n");

        //? Tarifas para las prendas de vestir

        final int TARIFA_CAMISA = 50000;
        final int TARIFA_PANTALON = 200000;
        final int TARIFA_CHAQUETA = 150000;
        final double DESCUENTO = 0.15;

        //? Solicitar el tipo de prenda

        System.out.print("Ingrese el tipo de prenda que desea comprar (camisa, pantalon, chaqueta): ");
        String tipoPrenda = scanner.nextLine().toLowerCase();

        //? Solicitar la Cantidad de prendas
        System.out.print("Cuantas prendas desea comprar?: ");
        int cantidadPrenda = scanner.nextInt();

        //? Inicializar variables para el costo total
        int costoBase = 0;
        int costoTotal;

        //? Determinar el costo base según el tipo de vehículo
        switch (tipoPrenda) {
            case "camisa":
                costoBase = TARIFA_CAMISA;
                break;
            case "pantalon":
                costoBase = TARIFA_PANTALON;
                break;
            case "chaqueta":
                costoBase = TARIFA_CHAQUETA;
                break;
            default:
                System.out.println("Tipo de prenda no reconocido. Por favor, ingrese camisa, pantalon o chaqueta.");
                return; // Termina el programa si el tipo de vehículo no es válido
        }

        //? Calcular el costo total con o sin el Descuento
        if (cantidadPrenda > 5 ) {
            costoTotal = (int) ((costoBase * cantidadPrenda) * (1 - DESCUENTO));
            System.out.println("Se aplica un descuento del 15%% por llevar mas de 5 unidades de " + tipoPrenda);
        } else {
            costoTotal = (costoBase * cantidadPrenda);;
        }
        // Mostrar el costo total
        System.out.println("El costo total de las prendas es: $" + formatoMoneda.format(costoTotal));

        scanner.close();
    }
}
