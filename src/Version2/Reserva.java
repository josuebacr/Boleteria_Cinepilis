package Version2;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private List<Asiento> asientos;
    private double precio;

    public Reserva(Cliente cliente, Pelicula pelicula, Sala sala, double precio) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.asientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        asiento.reservar();
        asientos.add(asiento);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public double getTotal() {
        return precio * asientos.size();
    }

    public String generarRecibo() {
        StringBuilder sb = new StringBuilder();
        sb.append("️RECIBO DE RESERVA\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append(" - Cedula: ").append(cliente.getCedula()).append("\n");
        sb.append("Pelicula: ").append(pelicula.getTitulo()).append("\n");
        sb.append("Sala: ").append(sala.getNumero()).append("\n");
        sb.append("Asientos: ");
        for (Asiento a : asientos) {
            sb.append(a.getNumero()).append(" ");
        }
        sb.append("\nTotal a pagar: ₡").append(getTotal());
        return sb.toString();
    }
}
