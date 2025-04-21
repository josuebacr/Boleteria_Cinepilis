package Version2;

public class PilaBoletos {

    private NodoPila cima;

    public PilaBoletos() {
        this.cima = null;
    }

    public void apilar(Venta venta) {
        NodoPila nuevo = new NodoPila(venta);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Venta desapilar() {
        if (cima == null) {
            return null;
        }

        Venta venta = cima.venta;
        cima = cima.siguiente;
        return venta;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public String verUltimoBoleto() {
        return cima != null ? cima.venta.generarComprobante() : "La pila esta vacía.";
    }
}
