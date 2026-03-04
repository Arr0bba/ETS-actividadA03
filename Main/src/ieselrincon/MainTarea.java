/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ieselrincon;

import java.util.Scanner;

public class MainTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("0. Salir");
            System.out.print("Elige: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    gestor.añadirTarea(desc);
                    System.out.println("Tarea añadida.");
                    break;
                case 2:
                    // Esto lo hará el Alumno B en su rama.
                    System.out.println("Función de listado pendiente.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
