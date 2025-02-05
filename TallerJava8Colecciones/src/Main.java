import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        DirectorioEmpleados directorio = new DirectorioEmpleados();

        //ListaTareas.ArrayTareas();

        // Menú interactivo Biblioteca
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Comprobar si un libro está disponible");
            System.out.println("5. Mostrar número total de libros únicos");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro a agregar:");
                    String tituloAgregar = scanner.nextLine();
                    biblioteca.agregarLibro(tituloAgregar);
                    break;
                case 2:
                    System.out.println("Ingrese el título del libro a eliminar:");
                    String tituloEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(tituloEliminar);
                    break;
                case 3:
                    biblioteca.mostrarLibros();
                    break;
                case 4:
                    System.out.println("Ingrese el título del libro a comprobar:");
                    String tituloComprobar = scanner.nextLine();
                    if (biblioteca.libroDisponible(tituloComprobar)) {
                        System.out.println("El libro '" + tituloComprobar + "' está disponible.");
                    } else {
                        System.out.println("El libro '" + tituloComprobar + "' no está disponible.");
                    }
                    break;
                case 5:
                    biblioteca.mostrarTotalLibros(); // Mostrar el total de libros únicos
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }


    }



}

