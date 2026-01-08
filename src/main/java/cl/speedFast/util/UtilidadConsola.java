package main.java.cl.speedFast.util;

import java.util.Scanner;

public class UtilidadConsola {

    /**
     * Muestra en consola el menú principal de la aplicación Salmontt.
     */
    public static void MenuPrincipal(){
        System.out.println("====--->>> SALMONTT APP <<<---====");
        System.out.println("1.- Listar todas las entidades (Registrables)");
        System.out.println("2.- Buscar empleados por Nombre");
        System.out.println("3.- Buscar clientes por código");
        System.out.println("4.- Listar productos");
        System.out.println("5.- Crear Orden de Compra");
        System.out.println("9.- Salir");
        System.out.print("\nSeleccione una opción del Menú: ");
    }

    /**
     * Muestra un mensaje de salida del sistema con una breve animación de puntos.
     */
    public static void salirMenuPrincipal(){
        System.out.println("Usted esta saliendo del sistema");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println("\nGracias por usar el programa.!!!");
    }

    /**
     * Pregunta al usuario por consola si desea realizar otra operación, aceptando solo las opciones S (sí) o N (no).
     * @param input instancia de {@link Scanner} utilizada para leer desde consola
     * @return {@code true} si el usuario responde S, {@code false} si responde N
     */
    public static boolean deseaContinuar(Scanner input){
        while(true) {
            System.out.print("¿Desea hace alguna otra operación? S/N: ");
            String letra = input.nextLine().trim().toUpperCase();
            if (letra.equals("S")) return true;
            if (letra.equals("N")) return false;
            System.out.println("Error. Ingrese la letra correspondiente S ó N");
        }
    }

}