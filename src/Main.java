import Entidades.Autor;
import Entidades.Cliente;
import Entidades.Factura;
import Entidades.Libro;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void puntoUno(){
        // “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        Autor autor_Joshua =  new Autor("Joshua", "Bloch","joshua@email.com", 'M');
        System.out.println(autor_Joshua.toString());
        //Inicialice el libro “Efective Java” del Autor “Joshua Bloch” que
        //cuesta 450 pesos con una cantidad de 150 copias.
        Libro libro_EffectiveJava = new Libro("Effective Java", 450, 150, autor_Joshua);
        System.out.println(libro_EffectiveJava.toString());
        libro_EffectiveJava.setPrecio(500);
        libro_EffectiveJava.AumentarStock(50);
        System.out.println(libro_EffectiveJava.toString());
        System.out.println("Datos del autor: "  + libro_EffectiveJava.getAutor().toString());
        System.out.println(libro_EffectiveJava.LibroMessage());
    }

    public static void puntoDos(){
        Cliente cliente_Pablo = new Cliente("Pablo", "Murillo", "pablomurillo@gmail.com", 25);
        Factura factura = new Factura(LocalDateTime.now(), cliente_Pablo, 500);

        System.out.println(factura); // antes de aplicar descuento
        factura.calcularTotalPorcentajeCliente();
        System.out.println(factura); // después de aplicar descuento

    }

    public static void main(String[] args) {

        boolean seguir = true;
        while (seguir) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a la guia 5 de programacion 2");
            System.out.println("1.- Libro.");
            System.out.println("2.- Cliente.");
            System.out.println("3.- Circulo.");
            System.out.println("0.- Salir.");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:{
                    puntoUno();
                    break;
                }
                case 2:{
                    puntoDos();
                    break;
                }
                case 0:{
                    System.out.println("Dale, nos vemos!");
                    seguir = false;
                    break;
                }
                default:{
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
            }
        }
    }
}