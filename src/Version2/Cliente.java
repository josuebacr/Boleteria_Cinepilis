
package Version2;

public class Cliente {
    
    private String nombre, cedula;
    
    

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    
     // Este metodo convierte el cliente en un texto fácil de leer
    // Se usa cuando queremos imprimir la info del cliente
    
    @Override
    public String toString() {
        return nombre + " → Cedula: " + cedula;
    }
}
