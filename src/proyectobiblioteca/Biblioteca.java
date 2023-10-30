/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

import java.util.ArrayList;

/**
 *
 * @author burro
 */
public class Biblioteca {
    private ArrayList<Libro> librosDisponibles;

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
