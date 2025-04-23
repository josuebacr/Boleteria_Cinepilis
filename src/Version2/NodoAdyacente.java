// Este nodo se usa para enlazar una pelicula a una sala especifica

package Version2;

public class NodoAdyacente {
   
       public Pelicula pelicula;       // Pelicula que se proyecta en una sala
    public NodoAdyacente siguiente;     // Enlace al siguiente nodo (otra pelicula en la misma sala)

    public NodoAdyacente(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.siguiente = null;
    }
    
}
