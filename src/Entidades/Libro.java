package Entidades;

public class Libro {
    private String titulo;
    private double precio;
    private static int stock;
    private Autor autor;

    //Constructor
    public Libro(String titulo, double precio,int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.stock = stock;
    }
    public Libro(){}
    //setters and getters
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Autor getAutor() {
        return this.autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //Methods
    //aumentar copias
    public void AumentarStock(int cantidad){
        this.stock += cantidad;
    }

    //metodo mostrar mensaje
    public String LibroMessage() {
        return String.format(
                "El libro '%s' de %s se vende a %.2f pesos",
                this.getTitulo(),
                this.getAutor().getNombreCompleto(),
                this.getPrecio()
        );
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + (autor != null ? autor.getNombreCompleto() : "Sin autor") +
                '}';
    }
}
