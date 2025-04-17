import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Reserva {

    private String idReserva;
    private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private List<Asiento> asientosReservados;
    private EstadoReserva estado;

    public enum EstadoReserva {
        PENDIENTE, CONFIRMADO, CANCELADO
    }

    public Reserva(Cliente cliente, Pelicula pelicula, Sala sala) {
        this.idReserva = UUID.randomUUID().toString(); // Genera un ID único
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.asientosReservados = new ArrayList<>();
        this.estado = EstadoReserva.PENDIENTE;
    }

    public boolean agregarAsiento(Asiento asiento) {
        if (!sala.estaDisponible(asiento)) { // Verifica disponibilidad
            JOptionPane.showMessageDialog(null, "El asiento " + asiento.getNumero() + " ya está reservado.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        asientosReservados.add(asiento);
        return true;
    }

    public boolean removerAsiento(Asiento asiento) {
        if (asientosReservados.contains(asiento)) {
            asientosReservados.remove(asiento);
            return true;
        }
        return false;
    }

    public void confirmarReserva() {
        estado = EstadoReserva.CONFIRMADO;
        JOptionPane.showMessageDialog(null, "Reserva confirmada:\n" + this.toString(), 
                                      "Reserva Confirmada", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cancelarReserva() {
        estado = EstadoReserva.CANCELADO;
        JOptionPane.showMessageDialog(null, "Reserva cancelada para " + cliente.getNombre(), 
                                      "Reserva Cancelada", JOptionPane.WARNING_MESSAGE);
    }

    // Getters
    public String getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Asiento> getAsientosReservados() {
        return asientosReservados;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Reserva ID: " + idReserva + "\nCliente: " + cliente.getNombre() + 
               "\nPelicula: " + pelicula.getTitulo() + "\nSala: " + sala.getNumero() + 
               "\nAsientos: " + asientosReservados.size() + "\nEstado: " + estado;
    }
}