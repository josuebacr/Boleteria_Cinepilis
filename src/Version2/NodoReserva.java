package Version2;

public class NodoReserva {

    public Reserva reserva;
    public NodoReserva siguiente;

    public NodoReserva(Reserva reserva) {
        this.reserva = reserva;
        this.siguiente = null;
    }

}
