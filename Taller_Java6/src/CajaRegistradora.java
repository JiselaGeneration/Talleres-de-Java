import java.util.Scanner;

public class CajaRegistradora {
    public static void caja() {
        //!CAJA REGISTRADORA
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double total = 0;
        int cantidad = 0;
        double precio = 0;

        do {
            // Menú de opciones
            System.out.println("=== Menú de Comida Rápida ===");
            System.out.println("1. Hamburguesa - $50");
            System.out.println("2. Papas - $30");
            System.out.println("3. Refresco - $20");
            System.out.println("4. Salir");

            System.out.print("\nSelecciona una opción (1-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    precio += 50;
                    System.out.println("Cuantas hamburguesas desea?: ");
                    cantidad = scanner.nextInt();
                    total = (cantidad * precio);
                    System.out.println("Numero de hamburguesas a añadidas: " + cantidad + ", Total: $" + total);
                    break;
                case 2:
                    precio += 30;
                    System.out.println("Cuantas porciones de papas desea?: ");
                    cantidad = scanner.nextInt();
                    total = (cantidad * precio);
                    System.out.println("Numero de porciones de papas añadidas: " + cantidad + ", Total: $" + total);
                    break;
                case 3:
                    precio += 20;
                    System.out.println("Cuantos vasos de refresco desea?: ");
                    cantidad = scanner.nextInt();
                    total = (cantidad * precio);
                    System.out.println("Numero de vasos de refresco añadidos: " + cantidad + ", Total: $" + total);
                    break;
                case 4:
                    System.out.println("Gracias por tu compra.");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        // Mostrar total y calcular cambio
        if (total > 0) {
            System.out.println("\nEl total a pagar es: $" + total);
            System.out.print("Ingresa el monto con el que pagarás: $");
            double pago = scanner.nextDouble();

            if (pago >= total) {
                double cambio = pago - total;
                System.out.println("Pago recibido. Tu cambio es: $" + cambio);
            } else {
                System.out.println("Monto insuficiente. Por favor, verifica.");
            }
        }

        scanner.close();
    }
}

   //*OTRA FORMA DE HACERLO ESTABA TRATANDO DE APRENDER ALGO MAS AVANZADO

//public class CajaRegistradora {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Menú del restaurante
//        String[] menu = {"Hamburguesa", "Papas", "Refresco"};
//        int[] precios = {50, 30, 20};
//
//        boolean continuar = true;
//        int total = 0;
//
//        System.out.println("--- Bienvenido al Restaurante ---");
//
//        // Mostrar el menú
//        do {
//            System.out.println("\nMenú:");
//            for (int i = 0; i < menu.length; i++) {
//                System.out.printf("%d. %s - $%d\n", i + 1, menu[i], precios[i]);
//            }
//            System.out.println("4. Finalizar pedido");
//
//            System.out.print("Seleccione una opción: ");
//            int opcion = scanner.nextInt();
//
//            if (opcion >= 1 && opcion <= 3) {
//                total += precios[opcion - 1];
//                System.out.printf("Has agregado %s por $%d. Total actual: $%d\n", menu[opcion - 1], precios[opcion - 1], total);
//            } else if (opcion == 4) {
//                continuar = false;
//            } else {
//                System.out.println("Opción inválida. Intenta nuevamente.");
//            }
//        } while (continuar);
//
//        // Mostrar el total y calcular el cambio
//        System.out.printf("\nTotal a pagar: $%d\n", total);
//        System.out.print("Ingrese el monto con el que pagará: ");
//        int pago = scanner.nextInt();
//
//        if (pago >= total) {
//            int cambio = pago - total;
//            System.out.printf("Pago recibido: $%d. Su cambio es: $%d\n", pago, cambio);
//        } else {
//            System.out.println("Monto insuficiente. No se puede completar la compra.");
//        }
//
//        System.out.println("¡Gracias por su compra! Vuelva pronto.");
//        scanner.close();
//    }
//}
