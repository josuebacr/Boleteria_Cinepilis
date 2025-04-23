// Esta clase representa la carterlera del cine
// Se usa una lista doblemente enlazada circular para guardar las peliculas
package Version2;

public class ListaPeliculasCircular {

    private NodoPeliculaCircular cabeza; // Nodo principal de la lista (inicio de la cartelera)

    // Constructor, al inicio la lista esta vacia
    public ListaPeliculasCircular() {
        cabeza = null;
    }

    // Este metodo agrega una pelicula nueva al final de la lista circular
    public void agregarPelicula(Pelicula pelicula) {
        NodoPeliculaCircular nueva = new NodoPeliculaCircular(pelicula);

        if (cabeza == null) {
            // Si esta vacio, el nuevo nodo se apunta a si mismo (circular)
            cabeza = nueva;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            // Si ya hay elementos, se conecta el nuevo nodo al final
            NodoPeliculaCircular ultimo = cabeza.anterior;

            ultimo.siguiente = nueva;
            nueva.anterior = ultimo;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
        }
    }

    // Este metodo modifica una pelicula buscando por su titulo
    public boolean modificarPelicula(String tituloOriginal, Pelicula nuevaPelicula) {
        NodoPeliculaCircular actual = cabeza;
        if (actual == null) {
            return false;
        }
        
// Se recorre la lista buscando el nombre de la pelicula
        do {
            if (actual.pelicula.getTitulo().equalsIgnoreCase(tituloOriginal)) {
                actual.pelicula = nuevaPelicula;
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza); // Como es circular, se regresa al inicio

        return false;
    }

    // Muestra toda la cartelera completa como texto
    
    public String mostrarCartelera() {
        if (cabeza == null) {
            return "La cartelera esta vacia.";
        }

        StringBuilder sb = new StringBuilder();
        NodoPeliculaCircular actual = cabeza;

        do {
            sb.append(actual.pelicula.toString()).append("\n");
            actual = actual.siguiente;
        } while (actual != cabeza); // Recorremos hasta volver al inicio

        return sb.toString();
    }

    // Busca una pelicula por titulo
    public Pelicula buscarPelicula(String titulo) {
        NodoPeliculaCircular actual = cabeza;
        if (actual == null) {
            return null;
        }

        do {
            if (actual.pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return actual.pelicula;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return null;
    }

    /// Metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }

}
