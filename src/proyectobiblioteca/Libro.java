package proyectobiblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private Boolean disponible;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    public Boolean isDisponible(){
        return disponible;
    }
    
    public boolean prestar(boolean disponible){
        boolean EsDisponible = false;
        return EsDisponible;
    }
    
    public boolean devolver(boolean disponible){
        boolean EsDisponible = true;
        return EsDisponible;
    }
    
}
