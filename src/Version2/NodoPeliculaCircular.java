// Nodo para la lista doblemente enlazada circular de peliculas

package Version2;


public class NodoPeliculaCircular {
   
   public Pelicula pelicula;
    public NodoPeliculaCircular siguiente;
    public NodoPeliculaCircular anterior;

     public NodoPeliculaCircular(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.siguiente = this.anterior = null;
    }
    
}
