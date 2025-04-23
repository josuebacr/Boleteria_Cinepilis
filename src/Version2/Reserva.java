package Version2;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private List<Asiento> asientos;
    private double precio; // Precio de cada entrada (se multiplica por la cantidad de asientos)

    
        // Constructor que recibe el cliente, película, sala y precio por asiento
    
    public Reserva(Cliente cliente, Pelicula pelicula, Sala sala, double precio) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.asientos = new ArrayList<>(); // Se inicializa la lista de asientos vacía
    }

    
   // Getters para obtener información de la reserva
    
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
    

     //Metodos
     public void agregarAsiento(Asiento asiento) {
        asiento.reservar();
        asientos.add(asiento);
    }
    
    
     // Método para calcular el total a pagar por la reserva (precio x cantidad de asientos)
    public double getTotal() {
        return precio * asientos.size();
    }

     
    // Metodo que genera el "recibo" de la reserva con todos los datos del cliente, pelicula, sala y asientos
    public String generarRecibo() {
        StringBuilder sb = new StringBuilder(); // Para construir el texto del recibo
        sb.append("️RECIBO DE RESERVA\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append(" - Cedula: ").append(cliente.getCedula()).append("\n");
        sb.append("Pelicula: ").append(pelicula.getTitulo()).append("\n");
        sb.append("Sala: ").append(sala.getNumero()).append("\n");
        sb.append("Asientos: ");
        for (Asiento a : asientos) {
            sb.append(a.getNumero()).append(" ");
        }
        sb.append("\nTotal a pagar: ₡").append(getTotal());
        return sb.toString(); // Se devuelve el texto con toda la información
    }
}
