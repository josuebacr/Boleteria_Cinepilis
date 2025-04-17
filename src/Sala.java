import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private List<Asiento> asientos;

    public Sala(int numero, int cantidadAsientos) {
        this.numero = numero;
        this.asientos = new ArrayList<>();
        
        for (int i = 1; i <= cantidadAsientos; i++) {
            asientos.add(new Asiento(i)); // Creando asientos numerados
        }
    }

    public int getNumero() {
        return numero;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public boolean estaDisponible(Asiento asiento) {
        return !asiento.estaReservado();
    }

    public void reservarAsiento(int numeroAsiento) {
        for (Asiento asiento : asientos) {
            if (asiento.getNumero() == numeroAsiento) {
                asiento.reservar();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Sala " + numero + " con " + asientos.size() + " asientos.";
    }
}