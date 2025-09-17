package Entidades;
import Enums.Turno;

public class Staff extends PersonaPuntoCuatro {
    private double salario;
    private Turno turno;

    //Constructors
    public Staff() {
        this.salario = 1500.00;
        this.turno = Turno.MAÑANA;
    }

    public Staff(String nombre, String apellido, String dni, String email, String direccion, double salario, Turno turno) {
        super(nombre, apellido, dni, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    //Setters and Getters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    //Methods

}
