
public class Pelicula { //creacion de la clase pelicula 

    private String titulo;
    private String genero;
    private int duracion; // Duración en minutos
    private String clasificacion; // Ejemplo: "PG-13", "R", "G"

    public Pelicula(String titulo, String genero, int duracion, String clasificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Lista de Peliculas : "
                + "Titulo='" + titulo + '\''
                + ", Genero='" + genero + '\''
                + ", Duracion=" + duracion + " min"
                + ", Clasificacion='" + clasificacion + '\''
                + ' ';
    }
}
