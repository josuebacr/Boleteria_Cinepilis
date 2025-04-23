// Nodo que se usa dentro de la pila de boletos

package Version2;

public class NodoPila {

    public Venta venta;
    public NodoPila siguiente;

    public NodoPila(Venta venta) {
        this.venta = venta;
        this.siguiente = null;
    }
}
