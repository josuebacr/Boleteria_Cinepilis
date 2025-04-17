
import javax.swing.JOptionPane;


public class Cliente {
  private String nombre;
    private String cedula;
    private NodoReserva reservas; // NodoReserva será la estructura para manejar las reservas.

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.reservas = null; // Inicializa la lista de reservas.
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public NodoReserva getReservas() {
        return reservas;
    }

    public void setReservas(NodoReserva reservas) {
        this.reservas = reservas;
    }

    // Método para registrar reservas (por ahora vacío)
    public void agregarReserva(NodoReserva nuevaReserva) {
        this.reservas = nuevaReserva; // Aquí iría la lógica para añadir reservas a la lista enlazada.
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", reservas=" + reservas +
                '}';
    }
}
