package actividad4;

import java.util.List;
import java.util.Scanner;

public class EjecutableActividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar mesas almacenadas");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Ingrese el color de la mesa: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese el número de patas de la mesa: ");
                    int numeroPatas = scanner.nextInt();

                    Mesa nuevaMesa = new Mesa(color, numeroPatas);
                    MetodosMesa.guardarMesa(nuevaMesa);
                    break;

                case 2:
                    List<Mesa> mesas = MetodosMesa.obtenerMesas();
                    if (mesas.isEmpty()) {
                        System.out.println("No hay mesas almacenadas.");
                    } else {
                        System.out.println("Estas son las mesas almacenadas:");
                        for (Mesa mesa : mesas) {
                            System.out.println(mesa);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Cerrrando menu...");
                    break;

                default:
                    System.out.println("Introduzca una opcion valida");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}

