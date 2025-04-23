package Version2;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    private int numero; // Numero identificador de la sala
    private List<Asiento> asientos; // Lista de asientos que hay en esta sala
    private NodoAdyacente cartelera; // Lista de peliculas asociadas a esta sala

    // Constructor el cual  se crea una sala con un numero y una cantidad de asientos
    public Sala(int numero, int cantidadAsientos) {
        this.numero = numero;
        this.asientos = new ArrayList<>();

        // Se crean todos los asientos en estado disponible
        for (int i = 1; i <= cantidadAsientos; i++) {
            asientos.add(new Asiento(i));
        }
        this.cartelera = null;// Al principio, no hay peliculas asignadas a la sala
    }

    public int getNumero() {
        return numero;
    }
// Devuelve la lista completa de asientos de esta sala

    public List<Asiento> getAsientos() {
        return asientos;
    }

    // Devuelve el inicio de la lista de películas asignadas a esta sala
    public NodoAdyacente getCartelera() {
        return cartelera;
    }

    // Este metodo agrega una pelicula a la sala mediante una lista de adyacencia, la cual crea un nuevo nodo y se conecta al final
    
    public void agregarPelicula(Pelicula pelicula) {
        
        NodoAdyacente nuevo = new NodoAdyacente(pelicula);

        if (cartelera == null) {
            cartelera = nuevo;
        } else {
            NodoAdyacente temp = cartelera;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    // Muestra las películas asignadas a esta sala
    
    public String mostrarCarteleraSala() {
        if (cartelera == null) {
            return "No hay películas asignadas a esta sala.";
        }

        StringBuilder sb = new StringBuilder("Películas en Sala " + numero + ":\n");
        NodoAdyacente temp = cartelera;
        while (temp != null) {
            sb.append(temp.pelicula.toString()).append("\n");
            temp = temp.siguiente;
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Sala " + numero + " - " + asientos.size() + " asientos";
    }
}
