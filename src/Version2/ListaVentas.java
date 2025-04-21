package Version2;

public class ListaVentas {

    private NodoVenta cabeza;

    public ListaVentas() {
        cabeza = null;
    }

    public void agregarVenta(Venta venta) {
        NodoVenta nuevo = new NodoVenta(venta);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoVenta temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

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
