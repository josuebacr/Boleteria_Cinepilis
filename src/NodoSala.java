
public class NodoSala {
    
 private Sala sala;
    private NodoSala siguiente;

    public NodoSala(Sala sala) {
        this.sala = sala;
        this.siguiente = null; // Inicialmente apunta a null
    }

    // Getters y Setters
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public NodoSala getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSala siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoSala{" +
                "sala=" + sala +
                '}';
    }
}
