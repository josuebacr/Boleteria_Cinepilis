// Nodo simple que se usa en la lista de ventas

package Version2;

public class NodoVenta {

    public Venta venta;
    public NodoVenta siguiente;

    public NodoVenta(Venta venta) {
        this.venta = venta;
        this.siguiente = null;
    }
}
