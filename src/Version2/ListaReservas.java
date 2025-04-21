package Version2;

public class ListaReservas {

    private NodoReserva cabeza;

    public ListaReservas() {
        cabeza = null;
    }

    public void agregarReserva(Reserva reserva) {
        NodoReserva nuevo = new NodoReserva(reserva);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoReserva temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public String mostrarReservas() {
        StringBuilder sb = new StringBuilder();
        NodoReserva temp = cabeza;
        while (temp != null) {
            sb.append(temp.reserva.generarRecibo()).append("\n\n");
            temp = temp.siguiente;
        }
        return sb.length() == 0 ? "No hay reservas registradas." : sb.toString();
    }
}
