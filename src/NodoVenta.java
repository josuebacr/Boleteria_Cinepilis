
public class NodoVenta {
   
  private Venta venta;
    private NodoVenta siguiente;

    public NodoVenta(Venta venta) {
        this.venta = venta;
        this.siguiente = null; // Inicialmente apunta a null
    }

    // Getters y Setters
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public NodoVenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVenta siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoVenta{" +
                "venta=" + venta +
                '}';
    }
}
