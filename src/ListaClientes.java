
public class ListaClientes {
    
     private NodoCliente cabeza;

    public ListaClientes() {
        this.cabeza = null;
    }

    // Método para agregar un cliente a la lista
    public void agregarCliente(Cliente cliente) {
        NodoCliente nuevoNodo = new NodoCliente(cliente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoCliente temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Método para buscar un cliente por nombre
    public Cliente buscarCliente(String nombre) {
        NodoCliente temp = cabeza;
        while (temp != null) {
            if (temp.getCliente().getNombre().equalsIgnoreCase(nombre)) {
                return temp.getCliente();
            }
            temp = temp.getSiguiente();
        }
        return null; // Retorna null si el cliente no se encuentra
    }

    // Método para buscar un cliente por cédula
    public Cliente buscarClientePorCedula(String cedula) {
        NodoCliente temp = cabeza;
        while (temp != null) {
            if (temp.getCliente().getCedula().equalsIgnoreCase(cedula)) {
                return temp.getCliente();
            }
            temp = temp.getSiguiente();
        }
        return null; // Retorna null si el cliente no se encuentra
    }

    // Método para eliminar un cliente por nombre
    public boolean eliminarCliente(String nombre) {
        if (cabeza == null) {
            return false; // Lista vacía, no hay nada que eliminar
        }

        if (cabeza.getCliente().getNombre().equalsIgnoreCase(nombre)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        NodoCliente temp = cabeza;
        while (temp.getSiguiente() != null) {
            if (temp.getSiguiente().getCliente().getNombre().equalsIgnoreCase(nombre)) {
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false; // No se encontró el cliente
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para obtener la lista de clientes en formato de texto
    public String obtenerLista() {
        StringBuilder sb = new StringBuilder();
        NodoCliente temp = cabeza;
        while (temp != null) {
            sb.append(temp.getCliente().toString()).append("\n");
            temp = temp.getSiguiente();
        }
        return sb.toString();
    }
}
