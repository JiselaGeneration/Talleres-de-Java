import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private Set<String> titulosLibros;

    public Biblioteca() {
        // Inicializamos el conjunto de libros
        titulosLibros = new HashSet<>();
    }

    // Método para agregar un libro
    public void agregarLibro(String titulo) {
        if (titulosLibros.add(titulo)) {
            System.out.println("Libro agregado: " + titulo);
        } else {
            System.out.println("El libro '" + titulo + "' ya está en la biblioteca.");
        }
    }

    // Método para eliminar un libro
    public void eliminarLibro(String titulo) {
        if (titulosLibros.remove(titulo)) {
            System.out.println("Libro eliminado: " + titulo);
        } else {
            System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
        }
    }

    // Método para comprobar si un libro está en la biblioteca
    public boolean libroDisponible(String titulo) {
        return titulosLibros.contains(titulo);
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (String libro : titulosLibros) {
            System.out.println(libro);
        }
    }

    // Método para obtener el número total de libros únicos
    public void mostrarTotalLibros() {
        System.out.println("Número total de libros únicos: " + titulosLibros.size());
    }

}
