package Talle_Java4;
import java.util.Scanner;
public class ParticipacionEvento {
    public static void participacionEvento() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la primera persona: ");
        int edadPrimera = scanner.nextInt();

        System.out.print("Ingrese la edad de la segunda persona: ");
        int edadSegunda = scanner.nextInt();

        System.out.println("¿Ambas personas son mayores de 18 años? " + (edadPrimera >= 18 && edadSegunda >= 18));
        System.out.println("¿Ambas personas son menores de 30 años? " + (edadPrimera < 30 && edadSegunda < 30));
        System.out.println("¿Alguna de las personas es mayor de 50 años? " + (edadPrimera > 50 || edadSegunda > 50));

        scanner.close();
    }
}
