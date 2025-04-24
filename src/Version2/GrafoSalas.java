// Esta clase representa el "grafo" de salas del cine
// Cada sala puede tener varias peliculas asignadas (como adyacentes)
package Version2;

import java.util.ArrayList;
import java.util.List;

public class GrafoSalas {

    private ArrayList<Sala> salas; // Lista principal de salas del cine

    // Constructor, el cual se inicia con una lista vacia de salas
    public GrafoSalas() {
        salas = new ArrayList<>();
    }

    // Agrega una sala nueva al grafo
    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    // Busca una sala por su numero
    public Sala buscarSala(int numero) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numero) {
                return sala;
            }
        }
        return null;
    }

    // Muestra todas las salas y las peliculas asignadas a cada una
    public String mostrarTodasLasSalas() {

        // Si no hay salas muestra este mensaje
        if (salas.isEmpty()) {
            return "No hay salas registradas.";
        }
        // Si hay salas, crea un objeto tipo StringBuilder con las salas que existen
        StringBuilder sb = new StringBuilder();

        for (Sala sala : salas) {

            //El metodo .Append se usa para agregar texto
            sb.append(sala.toString()).append("\n");
            sb.append(sala.mostrarCarteleraSala()).append("\n");
        }
        return sb.toString();
    }

    // Devuelve la lista de salas completa (por si se quiere recorrer desde afuera)
    public ArrayList<Sala> getSalas() {
        return salas;
    }

    // Convierte la lista de adyacencia (grafo) en una matriz de adyacencia
    public String generarMatrizAdyacencia() {
        // Cantidades
        int numSalas = salas.size();

        /*
    
Recolectamos todas las peliculas unicas (para formar las columnas),ademas, se recorre cada sala del cine

        Por cada sala, se accede a su lista de películas proyectadas (NodoAdyacente).

        Si la película no está ya en la lista peliculasUnicas, se agrega,esto evita duplicados y garantiza que solo haya una vez cada película, aunque esté en varias salas.
         */
        
        List<Pelicula> peliculasUnicas = new ArrayList<>();
        for (Sala sala : salas) {
            NodoAdyacente actual = sala.getCartelera();
            while (actual != null) {
                if (!peliculasUnicas.contains(actual.pelicula)) {
                    peliculasUnicas.add(actual.pelicula);
                }
                actual = actual.siguiente;
            }
        }

        int numPeliculas = peliculasUnicas.size();
        int[][] matriz = new int[numSalas][numPeliculas];

        // Llenamos la matriz
        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);
            NodoAdyacente actual = sala.getCartelera();

            while (actual != null) {
                int j = peliculasUnicas.indexOf(actual.pelicula);
                if (j != -1) {
                    matriz[i][j] = 1;
                }
                actual = actual.siguiente;
            }
        }

        // Armamos una representacion visual de la matriz
        StringBuilder sb = new StringBuilder();
        sb.append("Matriz de Adyacencia (Salas x Películas):\n\n");

        // Encabezado de columnas
        sb.append("        ");
        for (Pelicula p : peliculasUnicas) {
            sb.append(String.format("%-15s", p.getTitulo()));
        }
        sb.append("\n");

        // Contenido de filas
        for (int i = 0; i < numSalas; i++) {
            sb.append(String.format("Sala %-3d", salas.get(i).getNumero())).append("  ");
            for (int j = 0; j < numPeliculas; j++) {
                sb.append(String.format("%-15d", matriz[i][j]));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
