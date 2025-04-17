
public class ListaReservas {
    
    private NodoReserva cabeza;

    public ListaReservas() {
        this.cabeza = null;
    }

    // Método para agregar una nueva reserva a la lista
    public void agregarReserva(Reserva reserva) {
        NodoReserva nuevoNodo = new NodoReserva(reserva);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoReserva temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Método para buscar una reserva por cliente
    public Reserva buscarReserva(String nombreCliente) {
        NodoReserva temp = cabeza;
        while (temp != null) {
            if (temp.getReserva().getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                return temp.getReserva();
            }
            temp = temp.getSiguiente();
        }
        return null; // Retorna null si la reserva no se encuentra
    }

    // Método para eliminar una reserva por cliente
    public boolean eliminarReserva(String nombreCliente) {
        if (cabeza == null) {
            return false; // Lista vacía, no hay nada que eliminar
        }
        
        if (cabeza.getReserva().getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        
        NodoReserva temp = cabeza;
        while (temp.getSiguiente() != null) {
            if (temp.getSiguiente().getReserva().getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false; // No se encontró la reserva
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para obtener la lista de reservas en formato de texto
    public String obtenerLista() {
        StringBuilder sb = new StringBuilder();
        NodoReserva temp = cabeza;
        while (temp != null) {
            sb.append(temp.getReserva().toString()).append("\n");
            temp = temp.getSiguiente();
        }
        return sb.toString();
    }
}
