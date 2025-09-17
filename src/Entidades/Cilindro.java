package Entidades;

public class Cilindro extends Circulo {
    private double altura;

    // Constructores
    public Cilindro() {
        super(); // llama al constructor de Círculo
        this.altura = 1.0;
    }

    public Cilindro(int radio, double altura) {
        super(radio); // inicializa el radio en Círculo
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color); // inicializa radio y color en Círculo
        this.altura = altura;
    }

    // Getters y Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos
    @Override
    public double getArea() {
        double areaBase = super.getArea(); // área de círculo
        return 2 * Math.PI * getRadio() * altura + 2 * areaBase;
    }

    public double getVolumen() {
        return super.getArea() * altura; // usa área de círculo, no la sobrescrita
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() +
                ", altura=" + altura;
    }
}
