import Entidades.*;
import Enums.Carrera;
import Enums.Turno;

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

    public static void puntoTres() {
        // Primer cilindro con valores por defecto
        Cilindro cilindro1 = new Cilindro();
        System.out.println("=== Cilindro 1 (por defecto) ===");
        System.out.println("Radio = " + cilindro1.getRadio());
        System.out.println("Altura = " + cilindro1.getAltura());
        System.out.println("Área total = " + cilindro1.getArea()); // área del cilindro
        System.out.println("Volumen = " + cilindro1.getVolumen());
        System.out.println(cilindro1);

        // Segundo cilindro con radio, color y altura especificados
        Cilindro cilindro2 = new Cilindro(5, "verde", 5);
        System.out.println("\n=== Cilindro 2 (radio y altura dados) ===");
        System.out.println("Radio = " + cilindro2.getRadio());
        System.out.println("Altura = " + cilindro2.getAltura());
        System.out.println("Área total = " + cilindro2.getArea()); // área del cilindro
        System.out.println("Volumen = " + cilindro2.getVolumen());
        System.out.println(cilindro2);
    }

    public static void puntoCuatro() {
        // 1. Crear 4 estudiantes diferentes
        Estudiante e1 = new Estudiante("Ana", "Lopez", "12345678", "ana@email.com", "Calle 1", 2023, 20000, Carrera.PROGRAMACION);
        Estudiante e2 = new Estudiante("Luis", "Perez", "87654321", "luis@email.com", "Calle 2", 2022, 18000, Carrera.INGENIERIA_NAVAL);
        Estudiante e3 = new Estudiante("Maria", "Gomez", "11223344", "maria@email.com", "Calle 3", 2025, 22000, Carrera.INGENIERIA_PESQUERA);
        Estudiante e4 = new Estudiante(); // usa constructor por defecto

        // 2. Crear 4 staff diferentes
        Staff s1 = new Staff("Carlos", "Diaz", "44556677", "carlos@email.com", "Calle 4", 150000, Turno.MAÑANA);
        Staff s2 = new Staff("Laura", "Martinez", "99887766", "laura@email.com", "Calle 5", 160000, Turno.TARDE);
        Staff s3 = new Staff("Pedro", "Fernandez", "22334455", "pedro@email.com", "Calle 6", 170000, Turno.NOCHE);
        Staff s4 = new Staff(); // usa constructor por defecto

        // 3. Crear un array que contenga las 8 instancias
        PersonaPuntoCuatro[] personas = { e1, e2, e3, e4, s1, s2, s3, s4 };

        // 4. Recorrer con instanceof y contar
        int cantEstudiantes = 0;
        int cantStaff = 0;
        double totalIngresos = 0;

        for (PersonaPuntoCuatro p : personas) {
            if (p instanceof Estudiante) {
                cantEstudiantes++;
                totalIngresos += ((Estudiante) p).getCuota_mensual(); // sumamos cuota
            } else if (p instanceof Staff) {
                cantStaff++;
            }
        }

        // 5. Mostrar resultados
        System.out.println("Cantidad de Estudiantes: " + cantEstudiantes);
        System.out.println("Cantidad de Staff: " + cantStaff);
        System.out.println("Total ingresos por cuotas de estudiantes: $" + totalIngresos);
    }


    public static void main(String[] args) {

        boolean seguir = true;
        while (seguir) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a la guia 5 de programacion 2");
            System.out.println("1.- Libro.");
            System.out.println("2.- Cliente.");
            System.out.println("3.- Circulo y Cilindro.");
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
                case 3:
                    puntoTres();
                    break;
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