// Esta clase representa una pila de boletos
// Guarda las ultimas ventas para permitir anular la mas reciente

package Version2;

public class PilaBoletos {

    private NodoPila cima; // La "cima" es el ultimo boleto vendido

    public PilaBoletos() {
        this.cima = null;
    }

    // Metodo para apilar una venta (agregar a la cima)
    public void apilar(Venta venta) {
        
        NodoPila nuevo = new NodoPila(venta);
        
        nuevo.siguiente = cima; // Se enlaza al anterior
        
        cima = nuevo; // Se convierte en la nueva cima
    }
    
 // Metodo para desapilar (anular la ultima venta)
    public Venta desapilar() {
        if (cima == null) {
            return null;
        }

        Venta venta = cima.venta;
        cima = cima.siguiente;
        return venta;
    }

      // Verifica si la pila esta vacia
    public boolean estaVacia() {
        return cima == null;
    }

     // Devuelve el ultimo boleto apilado (sin eliminarlo)
    
    public String verUltimoBoleto() {
        return cima != null ? cima.venta.generarComprobante() : "La pila esta vacia.";
    }
}
