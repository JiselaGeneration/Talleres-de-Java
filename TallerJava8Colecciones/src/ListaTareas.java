import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    public static void ArrayTareas(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;
        String tarea;

        System.out.println("[[[GESTIÓN DE LISTA DE TAREAS]]]");
        //Agregar tareas
        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("1)Agregar tareas");
            System.out.println("2)Mostrar todas las tareas");
            System.out.println("3)marcar una tarea como completada");
            System.out.println("4)Mostrar número total de tareas pendientes");
            System.out.println("5)Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba su tarea: ");
                    sc.nextLine(); // Limpiar el buffer
                    tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada: " + tarea);
                    break;
                case 2:
                    System.out.println("Mis tareas: ");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Número de tarea completada: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine(); // Limpiar el buffer
                    if (index >= 0 && index < tareas.size()) {
                        System.out.println("Tarea eliminada: " + tareas.remove(index));
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Tareas pendientes: " + tareas.size());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

        }

    }while (opcion != 5);

   }
}
