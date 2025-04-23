// Esta clase representa el "grafo" de salas del cine
// Cada sala puede tener varias peliculas asignadas (como adyacentes)

package Version2;

import java.util.ArrayList;

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
}
