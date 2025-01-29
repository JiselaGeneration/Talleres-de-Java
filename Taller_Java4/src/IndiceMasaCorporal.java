package Talle_Java4;

import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void indiceMasaCorporal() {
        // Indice de masa corporal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en Kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en Metros: ");
        double altura = scanner.nextDouble();

        double imc = (peso / (altura * altura));

        int imc2 = (int) imc;

        System.out.println("Su indice de masa corporal en entero es : " + imc2);
        System.out.println("Su indice de masa corporal en decimal es : " + imc);

        // Cerrar el scanner
//        scanner.close();
    }
}
