/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] resultado = sumaDeArreglos(informacion, informacion2);

        for (int i = 0;
                i < resultado.length;
                i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumaDeArreglos(int[][] a, int[][] b) {

        int filas = a.length;
        int columnas = a[0].length;

        int[][] c = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }
}
