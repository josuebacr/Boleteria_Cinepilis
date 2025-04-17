
public class ListaPeliculas {
    
    private NodoPelicula cabeza;

    public ListaPeliculas() {
        this.cabeza = null;
    }

    // Método para agregar una película a la lista
    public void agregarPelicula(Pelicula pelicula) {
        NodoPelicula nuevoNodo = new NodoPelicula(pelicula);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoPelicula temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Método para buscar una película por título
    public Pelicula buscarPelicula(String titulo) {
        NodoPelicula temp = cabeza;
        while (temp != null) {
            if (temp.getPelicula().getTitulo().equalsIgnoreCase(titulo)) {
                return temp.getPelicula();
            }
            temp = temp.getSiguiente();
        }
        return null; // Retorna null si la película no se encuentra
    }

    // Método para eliminar una película por título
    public boolean eliminarPelicula(String titulo) {
        if (cabeza == null) {
            return false; // Lista vacía, no hay nada que eliminar
        }
        
        if (cabeza.getPelicula().getTitulo().equalsIgnoreCase(titulo)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        
        NodoPelicula temp = cabeza;
        while (temp.getSiguiente() != null) {
            if (temp.getSiguiente().getPelicula().getTitulo().equalsIgnoreCase(titulo)) {
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false; // No se encontró la película
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para obtener la lista de películas en formato de texto
    public String obtenerLista() {
        StringBuilder sb = new StringBuilder();
        NodoPelicula temp = cabeza;
        while (temp != null) {
            sb.append(temp.getPelicula().toString()).append("\n");
            temp = temp.getSiguiente();
        }
        return sb.toString();
    } 
}
