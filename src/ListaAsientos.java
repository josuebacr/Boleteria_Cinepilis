public class ListaAsientos {
    
    private int numero;
    private boolean reservado;

    public ListaAsientos(int numero) {
        this.numero = numero;
        this.reservado = false; // Por defecto, el asiento está libre
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaReservado() {
        return reservado;
    }

    public void reservar() {
        this.reservado = true;
    }

    public void liberar() {
        this.reservado = false;
    }

    @Override
    public String toString() {
        return "Asiento " + numero + (reservado ? " (Reservado)" : " (Disponible)");
    }
}