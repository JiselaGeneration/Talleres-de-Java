import java.text.NumberFormat;
import java.util.Scanner;
public class Parqueadero {
    public static void parqueadero(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoMoneda = NumberFormat.getInstance();

        //! Control de Acceso a un Parqueadero
        System.out.println("Control de Acceso a un Parqueadero");

        //? Tarifas base por tipo de vehículo
        final int TARIFA_AUTO = 5000;
        final int TARIFA_MOTO = 3000;
        final int TARIFA_BICICLETA = 1000;
        final double RECARGO = 0.20; // 20% de recargo

        //? Solicitar el tipo de vehículo

        System.out.print("Ingrese el tipo de vehículo (auto, moto, bicicleta): ");
        String tipoVehiculo = scanner.nextLine().toLowerCase();

        //? Solicitar la hora de llegada
        System.out.print("Ingrese la hora de llegada en formato 24 horas (ejemplo: 19, 21): ");
        int horaLlegada = scanner.nextInt();

        //? Inicializar variables
        int costoBase = 0;
        double costoTotal;

        //? Determinar el costo base según el tipo de vehículo
        switch (tipoVehiculo) {
            case "auto":
                costoBase = TARIFA_AUTO;
                break;
            case "moto":
                costoBase = TARIFA_MOTO;
                break;
            case "bicicleta":
                costoBase = TARIFA_BICICLETA;
                break;
            default:
                System.out.println("Tipo de vehículo no reconocido. Por favor, ingrese auto, moto o bicicleta.");
                return; // Termina el programa si el tipo de vehículo no es válido
        }

        // Calcular el costo total con o sin recargo
        if (horaLlegada >= 20) {
            costoTotal = costoBase + (costoBase * RECARGO);
            System.out.println("Se aplica un recargo del 20% por llegar después de las 8:00 p.m.");
        } else {
            costoTotal = costoBase;
        }

        // Mostrar el costo total

        System.out.println("El costo total del parqueo es: $" + formatoMoneda.format(costoTotal));

//        scanner.close();
    }
}
