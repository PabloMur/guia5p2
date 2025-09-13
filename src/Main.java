import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean seguir = true;
        while (seguir) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a la guia 5 de programacion 2");
            System.out.println("1.- Libro.");
            System.out.println("2.- Cliente.");
            System.out.println("0.- Salir.");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:{
                    System.out.println("Punto Uno.");
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