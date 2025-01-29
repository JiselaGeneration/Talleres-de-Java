import java.util.Scanner;

public class Calculadora {
    public static void calculadora(){
        Scanner scanner = new Scanner(System.in);

        //!CALCULADORA
        double precio = 0;

        System.out.println("Cual es el precio del producto?: ");
        precio = scanner.nextDouble();

        for (int descuento = 10; descuento <= 50; descuento += 10) {
            double precioConDescuento = precio - (precio * descuento / 100);
            System.out.println(descuento + "% de descuento: $" + precioConDescuento);
        }

    }

}
