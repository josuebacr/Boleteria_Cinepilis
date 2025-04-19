
package Version2;


import java.util.ArrayList;
        
public class GrafoSalas {
    private ArrayList<Sala> salas;

    public GrafoSalas() {
        salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public Sala buscarSala(int numero) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numero) {
                return sala;
            }
        }
        return null;
    }

    public String mostrarTodasLasSalas() {
        if (salas.isEmpty()) return "No hay salas registradas.";

        StringBuilder sb = new StringBuilder();
        for (Sala sala : salas) {
            sb.append(sala.toString()).append("\n");
            sb.append(sala.mostrarCarteleraSala()).append("\n");
        }
        return sb.toString();
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }
    }