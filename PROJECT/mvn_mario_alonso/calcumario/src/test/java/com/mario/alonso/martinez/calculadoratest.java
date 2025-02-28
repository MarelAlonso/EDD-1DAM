package com.mario.alonso.martinez;

public class calculadoratest {

    // Método para la suma
    public static double suma(double a, double b) {
        return a + b;
    }

    // Método para la resta
    public static double resta(double a, double b) {
        return a - b;
    }

    // Método para la multiplicación
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Método para la división
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Devuelve NaN si se intenta dividir por cero
        }
        return a / b;
    }
}
