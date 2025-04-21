
package Version2;


public class NodoCliente {
    
     public Cliente cliente;
    public NodoCliente siguiente;

    public NodoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }
}
