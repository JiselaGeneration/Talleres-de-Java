import java.util.Random;
import java.util.Scanner;

public class Contrasena {
    public static void contrasena() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Definir los caracteres permitidos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*():;.-_=+";

        // Pedir la longitud de la contraseña
        System.out.print("Ingrese la longitud deseada para la contraseña: ");
        int longitud = scanner.nextInt();

        // Generar la contraseña aleatoria
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        // Mostrar la contraseña generada
        System.out.println("Contraseña generada: " + contrasena);

        scanner.close();
    }
}
