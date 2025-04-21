//uso de las listas doblemente enlazadas circularmente 

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
