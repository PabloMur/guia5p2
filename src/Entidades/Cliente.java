package Entidades;
import java.util.UUID;

public class Cliente extends Persona {
    private UUID id;
    private double porcentajeDescuento; // ahora double

    //Constructor
    public Cliente(String nombre, String apellido, String email, double porcentajeDescuento) {
        super(nombre, apellido, email);
        this.porcentajeDescuento = porcentajeDescuento;
        this.id = UUID.randomUUID();
    }

    //setters and getters
    public UUID getId() {
        return this.id;
    }
    public double getPorcentajeDescuento() {
        return this.porcentajeDescuento;
    }
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //methods
    @Override
    public String toString() {
        return "Cliente[id= " + this.getId() +
                ", nombre= " + this.getNombreCompleto() +
                ", email= " + this.getEmail() +
                ", descuento= " + this.getPorcentajeDescuento() + "%" +
                "]";
    }
}
