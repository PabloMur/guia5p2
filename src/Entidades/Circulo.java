package Entidades;

public class Circulo {
    // Atributos
    private double radio;
    private String color;

    // Constructores
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo: radio=" + radio + ", color=" + color;
    }
}
