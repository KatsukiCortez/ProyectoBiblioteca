package proyectobiblioteca;

public class Libro {
    private String idLibro;
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponible;

    public Libro(String idLibro, String titulo, String autor, String genero) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = true;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean estaDisponible() {
        return isDisponible();
    }

    public void prestar() {
        setDisponible(false);
    }

    public void devolver() {
        setDisponible(true);
    }

    /**
     * @return the idLibro
     */
    public String getIdLibro() {
        return idLibro;
    }

    /**
     * @param idLibro the idLibro to set
     */
    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
