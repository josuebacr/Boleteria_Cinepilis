
public class NodoReserva {

  private Reserva reserva;
    private NodoReserva siguiente;

    public NodoReserva(Reserva reserva) {
        this.reserva = reserva;
        this.siguiente = null; // Inicialmente apunta a null.
    }

    // Getters y Setters
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public NodoReserva getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoReserva siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoReserva{" +
                "reserva=" + reserva +
                '}';
    }
}
