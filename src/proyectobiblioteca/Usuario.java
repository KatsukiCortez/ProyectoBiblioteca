package proyectobiblioteca;

import java.util.ArrayList;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String direccion;

    public Usuario(String idUsuario, String nombre, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
