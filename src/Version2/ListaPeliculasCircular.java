// Lista doblemente enlazada circular que representa la cartelera de películas
package Version2;

public class ListaPeliculasCircular {

    private NodoPeliculaCircular cabeza;

    public ListaPeliculasCircular() {
        cabeza = null;
    }

    // Agregar película al final de la lista
    public void agregarPelicula(Pelicula pelicula) {
        NodoPeliculaCircular nueva = new NodoPeliculaCircular(pelicula);

        if (cabeza == null) {
            cabeza = nueva;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            NodoPeliculaCircular ultimo = cabeza.anterior;
            ultimo.siguiente = nueva;
            nueva.anterior = ultimo;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
        }
    }

    // Modificar una película por título
    public boolean modificarPelicula(String tituloOriginal, Pelicula nuevaPelicula) {
        NodoPeliculaCircular actual = cabeza;
        if (actual == null) {
            return false;
        }

        do {
            if (actual.pelicula.getTitulo().equalsIgnoreCase(tituloOriginal)) {
                actual.pelicula = nuevaPelicula;
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }

    // Mostrar todas las películas
    public String mostrarCartelera() {
        if (cabeza == null) {
            return "La cartelera está vacía.";
        }

        StringBuilder sb = new StringBuilder();
        NodoPeliculaCircular actual = cabeza;

        do {
            sb.append(actual.pelicula.toString()).append("\n");
            actual = actual.siguiente;
        } while (actual != cabeza);

        return sb.toString();
    }

    // Buscar una película por título
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

    public boolean estaVacia() {
        return cabeza == null;
    }

}
