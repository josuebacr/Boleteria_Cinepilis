package Version2;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private List<Asiento> asientos;
    private NodoAdyacente cartelera; // Lista de películas asociadas a esta sala

    public Sala(int numero, int cantidadAsientos) {
        this.numero = numero;
        this.asientos = new ArrayList<>();
        for (int i = 1; i <= cantidadAsientos; i++) {
            asientos.add(new Asiento(i));
        }
        this.cartelera = null;
    }

    public int getNumero() {
        return numero;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public NodoAdyacente getCartelera() {
        return cartelera;
    }

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

    public String mostrarCarteleraSala() {
        if (cartelera == null) return "No hay películas asignadas a esta sala.";

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