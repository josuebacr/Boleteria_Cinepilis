
package Version2;

public class Asiento {
    
      private int numero;
    private boolean reservado;

    
    
    public Asiento(int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    
    
    
    
    public boolean estaReservado() {
        return reservado;
    }

    public void reservar() {
        reservado = true;
    }

    public void liberar() {
        reservado = false;
    }
    
    

    @Override
    public String toString() {
        return "Asiento " + numero + (reservado ? " (Reservado)" : " (Disponible)");
    }
    
    
}
