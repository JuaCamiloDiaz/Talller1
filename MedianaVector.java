/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pauda
 */

import java.util.Arrays;

public class MedianaVector {
    public static double calcularMediana(double[] vector) {
        Arrays.sort(vector);
        int n = vector.length;
        int mitad = n / 2;
       
        if (n % 2 == 1) {
            return vector[mitad];
        } else {
            return (vector[mitad - 1] + vector[mitad]) / 2.0;
        }
    }

    public static void main(String[] args) {
        double[] vector = {5.2, 3.7, 1.0, 9.8, 2.5, 6.4, 4.1};
        double mediana = calcularMediana(vector);
       
        System.out.println("El vector es: " + Arrays.toString(vector));
        System.out.println("La mediana es: " + mediana);
    }
}
