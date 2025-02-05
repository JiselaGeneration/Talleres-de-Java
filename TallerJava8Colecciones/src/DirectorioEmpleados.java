import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DirectorioEmpleados {
    private Map<String, Double> empleadosSalarios;

    public DirectorioEmpleados() {
        // Inicializamos el HashMap de empleados y salarios
        empleadosSalarios = new HashMap<>();
    }

    // Método para agregar un empleado y su salario
    public void agregarEmpleado(String nombre, double salario) {
        empleadosSalarios.put(nombre, salario);
        System.out.println("Empleado " + nombre + " agregado con salario: " + salario);
    }

    // Método para mostrar todos los empleados y sus salarios
    public void mostrarEmpleados() {
        System.out.println("\nDirectorio de empleados y salarios:");
        for (Map.Entry<String, Double> entry : empleadosSalarios.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Salario: " + entry.getValue());
        }
    }

    // Método para actualizar el salario de un empleado
    public void actualizarSalario(String nombre, double nuevoSalario) {
        if (empleadosSalarios.containsKey(nombre)) {
            empleadosSalarios.put(nombre, nuevoSalario);
            System.out.println("Salario de " + nombre + " actualizado a: " + nuevoSalario);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    // Método para calcular el salario promedio de todos los empleados
    public void calcularSalarioPromedio() {
        if (empleadosSalarios.isEmpty()) {
            System.out.println("No hay empleados en el directorio.");
            return;
        }

        double sumaSalarios = 0;
        for (double salario : empleadosSalarios.values()) {
            sumaSalarios += salario;
        }

        double salarioPromedio = sumaSalarios / empleadosSalarios.size();
        System.out.println("El salario promedio de los empleados es: " + salarioPromedio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectorioEmpleados directorio = new DirectorioEmpleados();

        // Menú interactivo
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Actualizar salario de un empleado");
            System.out.println("4. Calcular salario promedio");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombreAgregar = scanner.nextLine();
                    System.out.println("Ingrese el salario de " + nombreAgregar + ":");
                    double salarioAgregar = scanner.nextDouble();
                    directorio.agregarEmpleado(nombreAgregar, salarioAgregar);
                    break;
                case 2:
                    directorio.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del empleado a actualizar:");
                    String nombreActualizar = scanner.nextLine();
                    System.out.println("Ingrese el nuevo salario de " + nombreActualizar + ":");
                    double salarioNuevo = scanner.nextDouble();
                    directorio.actualizarSalario(nombreActualizar, salarioNuevo);
                    break;
                case 4:
                    directorio.calcularSalarioPromedio();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}