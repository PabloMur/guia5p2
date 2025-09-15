package Entidades;

public class Autor extends Persona {
    private char genero;

    // Constructor
    public Autor(String nombre, String apellido, String email, char genero) {
        super(nombre, apellido, email); // Llama al constructor de Persona
        this.genero = genero;
    }

    public Autor() {
        super("", "", ""); // Constructor vacío con valores por defecto
    }

    // Getter y Setter de genero
    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Métodos
    @Override
    public String toString() {
        return "Autor [ nombre: " + getNombreCompleto() +
                ", email: " + getEmail() +
                ", genero: " + getGenero() +
                " ]";
    }
}
