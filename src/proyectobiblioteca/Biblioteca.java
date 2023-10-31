package proyectobiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> librosDisponibles;
    private ArrayList<Usuario> usuariosRegistrados;
    private ArrayList<Prestamo> prestamosRealizados;
    
    public Biblioteca() {
        librosDisponibles = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public ArrayList<Libro> buscarLibrosPorTitulo(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarLibrosPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarLibrosPorGenero(String genero) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getGenero().equalsIgnoreCase(genero)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    /*
    Permite a un usuario tomar prestado un libro de la biblioteca
    */
    
    public void realizarPrestamo(String idUsuario, String idLibro){
        if ( == true){
            
        }
    }
    
    /*
    Permite a un usuario devolver un libro a la biblioteca
    */
    
    public void realizarDevolucion(String idUsuario, String idLibro){
        if (this.librosDisponibles == true){
            
        }
    }
    
    // devuelve la lista de libros disponibles en la biblioteca
    public void verLibrosDisponibles(){
    
    }
    
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (libro.isDisponible()) {
            usuario.tomarPrestado(libro);
            libro.prestar();
        }
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        if (usuario.getLibrosPrestados().contains(libro)) {
            usuario.devolverLibro(libro);
            libro.devolver();
        }
    }

    public ArrayList<Libro> verLibrosDisponibles() {
        return librosDisponibles;
    }
}
