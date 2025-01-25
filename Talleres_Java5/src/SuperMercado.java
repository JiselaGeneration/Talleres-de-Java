import java.text.NumberFormat;
import java.util.Scanner;

public class SuperMercado {
    public static void supermercado(String[] args) {
        // Crear un formateador para números con separadores de miles
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoMoneda = NumberFormat.getInstance();

        //!Sistema de Facturación para un Supermercado

        System.out.println("Sistema de Facturación para un Supermercado");

        System.out.print("Por favor, ingrese el total de la compra: ");
        int total = scanner.nextInt();

        System.out.print("Por favor, ingrese el número de productos: ");
        int cantidad = scanner.nextInt();

        System.out.print("¿Cuenta usted con Membresía? Escriba 1 para Sí y 2 para No: ");
        int membresia = scanner.nextInt();

        if (membresia == 1) {
            // Calcular el 10% de descuento
            int descuento = total * 10 / 100;
            int totalConDescuento = total - descuento;
            System.out.println("Usted tiene un descuento del 10%. Su saldo total es: " + formatoMoneda.format(totalConDescuento));
        } else {
            if (cantidad >= 10) {
                // Calcular el 5% de descuento
                int descuento = total * 5 / 100;
                int totalConDescuento = total - descuento;
                System.out.println("Usted tiene un descuento del 5%. Su total es: " + formatoMoneda.format(totalConDescuento));
            } else {
                System.out.println("Usted ha comprado " + cantidad + " productos. Debe comprar más de 10 para aplicar el descuento. Su saldo total es: " + formatoMoneda.format(total));
            }
        }
//        scanner.close();
    }
}

