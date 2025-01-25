import java.util.Scanner;

public class Mascotas {
    public static void mascotas(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //! Clasificación de Mascotas en una Veterinaria

        System.out.println("Clasificación de Mascotas en una Veterinaria");

        System.out.println("Ingrese el tipo de animal (perro, gato, ave, otro): ");
        String tipo = scanner.nextLine();

        System.out.println("Cual es el nombre de tu mascota?: ");
        String nombre = scanner.nextLine();

        System.out.println("Cual es la edad de " + nombre + ":");
        int edad = scanner.nextInt();

        switch (tipo) {
            case "perro":
                System.out.println("Su medico asigano es: Dr. Machado - Especialista en Perros");
                if (edad > 5) {
                    System.out.println("Se recomienda una vacunación adicional.");
                }
                break;
            case "gato":
                System.out.println("Su medico asigano es: Dr. Martinez - Especialista en gatos");
                if (edad > 5) {
                    System.out.println("Se recomienda una vacunación adicional.");
                }
                break;
            case "ave":
                System.out.println("Su medico asigano es: Dr. Sandoval - Especialista en aves");
                break;
            case "otro":
                System.out.println("Su medico asigano es: Dr. Maria Jimenez - Especialista en animales exoticos");
        }

    }

}
