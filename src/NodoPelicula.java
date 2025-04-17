
public class NodoPelicula {
    
private Pelicula pelicula;
    private NodoPelicula siguiente;

    public NodoPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.siguiente = null; // Inicialmente apunta a null.
    }

    // Getters y Setters
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public NodoPelicula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPelicula siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoPelicula{" +
                "Pelicula=" + pelicula +
                '}';
    }
    
}
