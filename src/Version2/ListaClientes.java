package Version2;

public class ListaClientes {

    private NodoCliente cabeza;

    public ListaClientes() {
        cabeza = null;
    }

    public void agregarCliente(Cliente cliente) {
        NodoCliente nuevo = new NodoCliente(cliente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoCliente temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public boolean eliminarCliente(String cedula) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.cliente.getCedula().equalsIgnoreCase(cedula)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        NodoCliente temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.cliente.getCedula().equalsIgnoreCase(cedula)) {
                temp.siguiente = temp.siguiente.siguiente;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    public Cliente buscarCliente(String cedula) {
        NodoCliente temp = cabeza;
        while (temp != null) {
            if (temp.cliente.getCedula().equalsIgnoreCase(cedula)) {
                return temp.cliente;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    public String mostrarClientes() {
        StringBuilder sb = new StringBuilder();
        NodoCliente temp = cabeza;
        while (temp != null) {
            sb.append(temp.cliente.toString()).append("\n");
            temp = temp.siguiente;
               
        }
        return sb.length() == 0 ? "No hay clientes registrados." : sb.toString();
     
    }

}
