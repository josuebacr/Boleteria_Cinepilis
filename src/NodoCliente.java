    
public class NodoCliente {
    
   private Cliente cliente;
    private NodoCliente siguiente;

    public NodoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null; // Inicialmente apunta a null.
    }

    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoCliente{" +
                "cliente=" + cliente +
                '}';
    }
}
