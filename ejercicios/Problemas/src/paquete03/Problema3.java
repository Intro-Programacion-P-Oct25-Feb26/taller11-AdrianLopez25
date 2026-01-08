/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("1. Calcular área del Cuadrado");
        System.out.println("2. Calcular área del Triángulo");
        System.out.println("3. Calcular área del Rectángulo");
        System.out.print("Elija una opción: ");

        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Elija una opcion correcta.");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;

        System.out.println("\n  Área del Cuadrado ");
        System.out.print("Ingrese el valor del lado: ");
        lado = entrada.nextDouble();

        area = lado * lado;

        System.out.printf("El área del cuadrado es: %.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("\n  Área del Triángulo ");
        System.out.print("Ingrese el valor de la base: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("El área del triángulo es: %.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("\n  Área del Rectángulo ");
        System.out.print("Ingrese el valor de la base: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.printf("El área del rectángulo es: %.2f\n", area);
    }
}   

