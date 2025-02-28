package com.mario.alonso.martinez;

import java.util.Scanner;

    public class maincalctest {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //maincalc calculadora = new maincalc(); // Crear un objeto de la clase Calculadora

            System.out.println("Selecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int operacion = scanner.nextInt();

            System.out.println("Introduce el primer número:");
            double num1 = scanner.nextDouble();

            System.out.println("Introduce el segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operacion) {
                case 1:
                    resultado = calculadora.suma(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.resta(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.multiplicacion(num1, num2);
                    break;
                case 4:
                    resultado = calculadora.division(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
