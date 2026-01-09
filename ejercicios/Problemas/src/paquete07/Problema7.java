/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {
        String[] listaCiudades = obtenerCiudades();
        imprimirCiudadesFiltradas(listaCiudades);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        int numeroElementos;
        
        System.out.print("¿Cuántas ciudades desea ingresar?: ");
        numeroElementos = entrada.nextInt();

        entrada.nextLine(); 
        
        String[] ciudades = new String[numeroElementos];
        
        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("Ingrese la ciudad " + (i + 1) + ": ");
            ciudades[i] = entrada.nextLine();
        }
        
        return ciudades;
    }

    public static void imprimirCiudadesFiltradas(String[] arregloDatos) {
        boolean coincidencias = false;

        for (int i = 0; i < arregloDatos.length; i++) {
            int longitud = arregloDatos[i].length();
        
            if (longitud == 4 || longitud == 5) {
                System.out.println(arregloDatos[i]);
                coincidencias = true;
            }
        }

        if (!coincidencias) {
            System.out.println("No se encontraron ciudades con esa longitud.");
        }
    }
}
    
