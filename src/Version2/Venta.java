
package Version2;

import java.util.List;

public class Venta {
    
     private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private List<Asiento> asientosComprados;
    private double total;  // Total a pagar (precio por asiento por la cantidad de asientos)

    public Venta(Cliente cliente, Pelicula pelicula, Sala sala, List<Asiento> asientos, double precioUnitario) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.asientosComprados = asientos;
        this.total = (precioUnitario) * asientos.size(); // Se calcula el total
    }

     // Método que genera un comprobante (recibo) de la venta
    public String generarComprobante() {
        StringBuilder sb = new StringBuilder();
        sb.append(" COMPROBANTE DE VENTA CINEPILIS \n");
        sb.append("Cliente: ").append(cliente.getNombre()).append(" - Cedula: ").append(cliente.getCedula()).append("\n");
        sb.append("Pelicula: ").append(pelicula.getTitulo()).append("\n");
        sb.append("Sala Numero: ").append(sala.getNumero()).append("\n");
        sb.append("Asientos: ");
        for (Asiento a : asientosComprados) {
            sb.append(a.getNumero()).append(" ");
        }
        sb.append("\nTotal pagado: ₡").append(total).append("\n");
        
        sb.append(" Gracias por su compra, que disfrute su pelicula! \n").append("\n");
        return sb.toString();
    }
    
    
}
