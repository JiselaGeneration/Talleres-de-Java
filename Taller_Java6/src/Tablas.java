import java.util.Scanner;

public class Tablas {
    public static void tablas() {
        Scanner scanner = new Scanner(System.in);

        //!TABLAS DE MULTIPLICAR
        int numero = 0;

        // Validar que el número esté entre 1 y 10
        System.out.print("Ingrese un número del 1 al 10: ");
        numero = scanner.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.print("Número fuera de rango. Intente nuevamente: ");
            numero = scanner.nextInt();
        }

        System.out.println("\nTabla de multiplicar del " + numero + ":");

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        //*QUISE PRACTICAR UN POCO MAS USANDO WHILE Y FOR

//        System.out.println("Por favor escriba un número del 1 al 10 para generar su tabla deseada: ");
//        int numero = scanner.nextInt();
//
//        // Validar que el número esté en el rango de 1 a 10
//        while (numero < 1 || numero > 10) {
//            System.out.println("Número fuera de rango. Por favor, ingrese un número entre 1 y 10:");
//            numero = scanner.nextInt();
//        }
//
//        // Generar y mostrar la tabla de multiplicar
//        System.out.println("\nTabla de multiplicar del " + numero + ":");
//        for (int i = 1; i <= 10; i++) {
//            int tabla = numero * i;
//            System.out.println(numero + " * " + i + " = " + tabla);
//        }

        scanner.close();
    }
}
