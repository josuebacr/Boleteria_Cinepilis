
package Version2;

public class Asiento {
    
      private int numero;
    private boolean reservado;

    
    
    public Asiento(int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    
     // Metodos para acceder a los atributos
    public int getNumero() {
        return numero;
    }

       
    public boolean estaReservado() {
        return reservado;
    }

     // Metodo para reservar el asiento (cambiar su estado a "reservado")
    public void reservar() {
        reservado = true;
    }
// Metodo para liberar el asiento (ponerlo disponible)
    public void liberar() {
        reservado = false;
    }
    
    
   // Convierte el asiento en un texto legible
    @Override
    public String toString() {
        return "Asiento " + numero + (reservado ? " (Reservado)" : " (Disponible)");
    }
    
    
}
