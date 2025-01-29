package Talle_Java4;
import java.util.Scanner;
public class ComparadorDeEdad {
    public static void comparadorDeEdad(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pepito ingresa tu edad: ");
        int pepitoEdad = scanner.nextInt();

        System.out.print("Juan ingresa tu edad: ");
        int juanEdad = scanner.nextInt();

        System.out.println("¿Pepito es mayor que Juan? " + (pepitoEdad > juanEdad));
        System.out.println("¿Juan es mayor que Pepito? " + (pepitoEdad < juanEdad));
        System.out.println("¿Pepito y Juan tienen la misma edad? " + (pepitoEdad == juanEdad));

    }
}

