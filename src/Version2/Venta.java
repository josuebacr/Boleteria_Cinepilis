
package Version2;

import java.util.List;

public class Venta {
    
     private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private List<Asiento> asientosComprados;
    private double total;

    public Venta(Cliente cliente, Pelicula pelicula, Sala sala, List<Asiento> asientos, double precioUnitario) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.asientosComprados = asientos;
        this.total = (precioUnitario) * asientos.size();
    }

    public String generarComprobante() {
        StringBuilder sb = new StringBuilder();
        sb.append("🧾 COMPROBANTE DE VENTA\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append(" - Cédula: ").append(cliente.getCedula()).append("\n");
        sb.append("Película: ").append(pelicula.getTitulo()).append("\n");
        sb.append("Sala: ").append(sala.getNumero()).append("\n");
        sb.append("Asientos: ");
        for (Asiento a : asientosComprados) {
            sb.append(a.getNumero()).append(" ");
        }
        sb.append("\nTotal pagado: ₡").append(total);
        return sb.toString();
    }
    
    
}
