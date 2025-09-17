package Entidades;

import Enums.Carrera;

public class Estudiante extends PersonaPuntoCuatro{
    private int anio_ingreso;
    private double cuota_mensual;
    private Carrera carrea;

    //Constructor


    public Estudiante(String nombre, String apellido, String dni, String email, String direccion, int anio_ingreso, double cuota_mensual, Carrera carrea) {
        super(nombre, apellido, dni, email, direccion);
        this.anio_ingreso = anio_ingreso;
        this.cuota_mensual = cuota_mensual;
        this.carrea = carrea;
    }

    public Estudiante(int anio_ingreso, double cuota_mensual, Carrera carrea) {
        this.anio_ingreso = anio_ingreso;
        this.cuota_mensual = cuota_mensual;
        this.carrea = carrea;
    }

    public Estudiante() {
        this.anio_ingreso = 2025;
        this.cuota_mensual = 15000;
        this.carrea = Carrera.PROGRAMACION;
    }

    //Setters and Getters


    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public double getCuota_mensual() {
        return cuota_mensual;
    }

    public void setCuota_mensual(double cuota_mensual) {
        this.cuota_mensual = cuota_mensual;
    }

    public Carrera getCarrea() {
        return carrea;
    }

    public void setCarrea(Carrera carrea) {
        this.carrea = carrea;
    }

    //
}
