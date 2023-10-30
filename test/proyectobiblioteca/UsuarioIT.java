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
public class UsuarioIT {
    
    public UsuarioIT() {
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
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificacion method, of class Usuario.
     */
    @Test
    public void testGetIdentificacion() {
        System.out.println("getIdentificacion");
        Usuario instance = null;
        int expResult = 0;
        int result = instance.getIdentificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tomarPrestado method, of class Usuario.
     */
    @Test
    public void testTomarPrestado() {
        System.out.println("tomarPrestado");
        Libro libro = null;
        Usuario instance = null;
        instance.tomarPrestado(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverLibro method, of class Usuario.
     */
    @Test
    public void testDevolverLibro() {
        System.out.println("devolverLibro");
        Libro libro = null;
        Usuario instance = null;
        instance.devolverLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibrosPrestados method, of class Usuario.
     */
    @Test
    public void testGetLibrosPrestados() {
        System.out.println("getLibrosPrestados");
        Usuario instance = null;
        ArrayList<Libro> expResult = null;
        ArrayList<Libro> result = instance.getLibrosPrestados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
