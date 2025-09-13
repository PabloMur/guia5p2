package Entidades;

public class Libro {
    private String titulo;
    private double precio;
    private final Autor autor;

    //Constructor
    public Libro(String titulo, double precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

}
