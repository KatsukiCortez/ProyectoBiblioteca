/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class Prestamo {
    private int idPrestamo;
    private Date fecha;
    private String idUsuario;
    private String idLibro;

    // Constructor
        //Crea una instancia de préstamo con atributos específicos.

    public Prestamo(int idPrestamo, Date fecha, String idUsuario, String idLibro) {
        this.idPrestamo = idPrestamo;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
    }

    // Métodos para acceder y modificar los atributos
    //Devuelve el identificador único del préstamo.
    public int getIdPrestamo() {
        return idPrestamo;
    }

    //Devuelve la fecha del préstamo.
    public Date getFecha() {
        return fecha;
    }

    //Devuelve el identificador del usuario que realizó el préstamo. 
    public String getIdUsuario() {
        return idUsuario;
    }
    
    //Devuelve el identificador del libro prestado. 
    public String getIdLibro() {
        return idLibro;
    }

    //Establece o modifica el identificador del préstamo. 
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    //Establece o modifica la fecha del préstamo. 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Establece o modifica el identificador del usuario asociado al préstamo. 
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Establece o modifica el identificador del libro prestado. 
    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }
}
