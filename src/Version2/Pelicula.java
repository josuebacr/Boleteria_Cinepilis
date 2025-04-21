
package Version2;

public class Pelicula {
    
     private String titulo;
    private int duracion; // en minutos
    private String genero;
    private String clasificacion;

    public Pelicula(String titulo, int duracion, String genero, String clasificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "🎬 " + titulo + " - " + duracion + " min - " + genero + " - Clasificacion: " + clasificacion;
    } 
    
    
}
