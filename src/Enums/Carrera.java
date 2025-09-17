package Enums;

public enum Carrera {
    INGENIERIA_NAVAL("Ingeniería Naval"),
    INGENIERIA_PESQUERA("Ingeniería Pesquera"),
    PROGRAMACION("Programación");

    private final String nombreLegible;

    // Constructor
    Carrera(String nombreLegible) {
        this.nombreLegible = nombreLegible;
    }

    // Getter
    public String getNombreLegible() {
        return nombreLegible;
    }

    @Override
    public String toString() {
        return nombreLegible;
    }
}
