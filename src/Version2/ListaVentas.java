// Esta clase guarda todas las ventas realizadas en el cine
// Utiliza una lista enlazada simple de nodos (NodoVenta)

package Version2;

public class ListaVentas {

    private NodoVenta cabeza;

    public ListaVentas() {
        cabeza = null;
    }

     // Metodo para agregar una nueva venta
    public void agregarVenta(Venta venta) {
        NodoVenta nuevo = new NodoVenta(venta);
        if (cabeza == null) {
            cabeza = nuevo; // Si la lista esta vacia, el nuevo nodo es la cabeza
        } else {
            NodoVenta temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo; // Se agrega al final
        }
    }

    // Muestra todas las ventas registradas
    
    public String mostrarVentas() {
        if (cabeza == null) {
            return "No hay ventas registradas.";
        }

        StringBuilder sb = new StringBuilder();
        NodoVenta temp = cabeza;
        while (temp != null) {
            sb.append(temp.venta.generarComprobante()).append("\n\n");
            temp = temp.siguiente;
        }
        return sb.toString();
    }
}
