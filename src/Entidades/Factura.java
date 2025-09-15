package Entidades;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id;
    private LocalDateTime fecha;
    private Cliente cliente;
    private double total;              // Total original
    private double totalConDescuento;  // Total aplicando descuento

    // Constructor
    public Factura(LocalDateTime fecha, Cliente cliente, double total) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.totalConDescuento = total; // inicialmente igual al total original
        this.id = UUID.randomUUID();
    }

    // Getters y Setters
    public UUID getId() {
        return this.id;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
        this.totalConDescuento = total; // mantener sincronizado
    }

    public double getTotalConDescuento() {
        return this.totalConDescuento;
    }

    // Methods
    public void calcularTotalPorcentajeCliente() {
        double descuento = this.cliente.getPorcentajeDescuento(); // ej: 25.0
        this.totalConDescuento = this.total - (this.total * (descuento / 100.0)); // forzar división double
    }

    @Override
    public String toString() {
        return "Factura[id= " + this.getId() +
                ", fecha= " + this.getFecha() +
                ", cliente= " + this.getCliente().getNombreCompleto() +
                ", total= " + this.total +
                ", total con descuento= " + this.totalConDescuento +
                "]";
    }
}
