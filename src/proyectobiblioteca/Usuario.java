package proyectobiblioteca;

import java.util.ArrayList;

public class Usuario {
     private String nombre;
    private int identificacion;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void tomarPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
}
