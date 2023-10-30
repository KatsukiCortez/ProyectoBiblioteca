/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectobiblioteca;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author burro
 */
public class BibliotecaIT {
    
    public BibliotecaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarLibro method, of class Biblioteca.
     */
    @Test
    public void testAgregarLibro() {
        System.out.println("agregarLibro");
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        instance.agregarLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibrosPorTitulo method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibrosPorTitulo() {
        System.out.println("buscarLibrosPorTitulo");
        String titulo = "";
        Biblioteca instance = new Biblioteca();
        ArrayList<Libro> expResult = null;
        ArrayList<Libro> result = instance.buscarLibrosPorTitulo(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibrosPorAutor method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibrosPorAutor() {
        System.out.println("buscarLibrosPorAutor");
        String autor = "";
        Biblioteca instance = new Biblioteca();
        ArrayList<Libro> expResult = null;
        ArrayList<Libro> result = instance.buscarLibrosPorAutor(autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibrosPorGenero method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibrosPorGenero() {
        System.out.println("buscarLibrosPorGenero");
        String genero = "";
        Biblioteca instance = new Biblioteca();
        ArrayList<Libro> expResult = null;
        ArrayList<Libro> result = instance.buscarLibrosPorGenero(genero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prestarLibro method, of class Biblioteca.
     */
    @Test
    public void testPrestarLibro() {
        System.out.println("prestarLibro");
        Usuario usuario = null;
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        instance.prestarLibro(usuario, libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverLibro method, of class Biblioteca.
     */
    @Test
    public void testDevolverLibro() {
        System.out.println("devolverLibro");
        Usuario usuario = null;
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        instance.devolverLibro(usuario, libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verLibrosDisponibles method, of class Biblioteca.
     */
    @Test
    public void testVerLibrosDisponibles() {
        System.out.println("verLibrosDisponibles");
        Biblioteca instance = new Biblioteca();
        ArrayList<Libro> expResult = null;
        ArrayList<Libro> result = instance.verLibrosDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
