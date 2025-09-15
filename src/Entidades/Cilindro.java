package Entidades;

public class Cilindro extends Circulo {
    private double altura;

    //Constructor
    public Cilindro(double radio, String color, int altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro() {
        this.altura = 1.0;
    }
}
