package Entidades;

import static java.lang.StringTemplate.STR;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    //Constructor
    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }
    public Autor() {}

    //Setters and Getters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGenero() {
        return this.genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    //Methods
    public String getNombreCompleto() {
        return STR."""\{this.getNombre()} \{this.getApellido()}""";
    }



}
