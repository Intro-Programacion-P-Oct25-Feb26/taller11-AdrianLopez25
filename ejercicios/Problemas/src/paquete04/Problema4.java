/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cedula;
        int opcion;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.print("Ingrese su cedula: ");
        cedula = entrada.nextLine();

        System.out.println("Seleccione el cálculo que quiera realizar:");
        System.out.println("1. Calcular planilla de luz");
        System.out.println("2. Calcular predio de inmueble");
        System.out.print("Opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            } else {
                System.out.println("Elija una opcion correcta.");
            }
        }
    }

    public static void calcularLuz(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        double numero;
        double totalPagar;

        System.out.print("Ingrese el valor de la planilla de luz en kilowatio: ");
        valor = entrada.nextDouble();
        
        System.out.print("Ingrese el número de kilowatios del mes: ");
        numero = entrada.nextDouble();

        totalPagar = valor * numero;

        System.out.printf("\nCliente %s con cédula %s debe cancelar el valor de"
                + " $%.2f\n", 
                n, c, totalPagar);
    }


    public static void calcularPredio(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double valorPredio;

        System.out.print("Ingrese el valor del inmueble: ");
        valorInmueble = entrada.nextDouble();

        valorPredio = valorInmueble * 0.02;

        System.out.printf("\nCliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n", 
                n, c, valorInmueble, valorPredio);
    }
}
