
public class NodoAsiento {

    private Asiento asiento;
    private NodoAsiento siguiente;

    public NodoAsiento(Asiento asiento) {
        this.asiento = asiento;
        this.siguiente = null; // Inicialmente apunta a null.
    }

    // Getters y Setters
    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public NodoAsiento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAsiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoAsiento{" +
                "asiento=" + asiento +
                '}';
    }
}
