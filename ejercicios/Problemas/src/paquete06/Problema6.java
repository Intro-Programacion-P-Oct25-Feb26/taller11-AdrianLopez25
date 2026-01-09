/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    
    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double mediaAritmetica = obtenerMediaAritmetica(informacion);
        double desviacion = obtenerDesviacion(informacion, mediaAritmetica);

        System.out.printf("Media Aritmética: %.2f\n", mediaAritmetica);
        System.out.printf("Desviación Estándar: %.2f\n", desviacion);
    }

    public static double obtenerMediaAritmetica(int[] datos) {
        double suma = 0;
   
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
       
        return suma / datos.length;
    }

    public static double obtenerDesviacion(int[] datos, double media) {
        double sumaDiferencias = 0;
        double resultado;
        double desviacion;

        for (int i = 0; i < datos.length; i++) {
            double diferencia = datos[i] - media;
            sumaDiferencias = sumaDiferencias + Math.pow(diferencia,2);
        }

        resultado = sumaDiferencias / datos.length;

        desviacion = Math.sqrt(resultado);

        return desviacion;
    }
}

