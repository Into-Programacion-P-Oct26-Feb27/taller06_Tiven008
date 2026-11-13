/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_b;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Problema01_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int operacion;
        double num1;
        double num2;
        double solucion = 0;
        String tipoOperacion = "";

        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = entrada.nextDouble();

        if (num1 >= num2) {

            System.out.println("Ingrese el número correspondiente a la"
                    + " operacíon"
                    + "que desea realizar:\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División\n"
                    + "5. Módulo\n"
                    + "6. Potencia\n");
            operacion = entrada.nextInt();

            if (operacion == 1) {
                solucion = num1 + num2;
                tipoOperacion = "Suma";
            } else {
                if (operacion == 2) {
                    solucion = num1 - num2;
                    tipoOperacion = "Resta";
                } else {
                    if (operacion == 3) {
                        solucion = num1 * num2;
                        tipoOperacion = "Multiplicación";
                    } else {
                        if (operacion == 4) {
                            tipoOperacion = "División";
                            if (num2 == 0) {
                                System.out.println("El segundo numero no "
                                        + "puede ser 0, intente de nuevo\n");
                            } else {
                                solucion = num1 / num2; 
                            }
                        } else {
                            if (operacion == 5) {
                                tipoOperacion = "Módulo";
                                if (num2 == 0) {
                                    System.out.println("El segundo numero no "
                                            + "puede ser 0, intente de "
                                            + "nuevo\n");
                                } else {
                                    solucion = num1 % num2;
                                }

                            } else {
                                if (operacion == 6) {
                                    solucion = Math.pow(num1, num2);
                                    tipoOperacion = "Potencia";
                                } else {
                                    System.out.println("El número ingresado"
                                            + " de la operación es inválido\n");
                                }
                            }
                        }
                    }
                }
            }

            System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                    + "Primer número: %.2f\n"
                    + "Segundo número: %.2f\n"
                    + "Operación seleccionada: %s\n\n"
                    + "Resultado: %.2f", num1, num2, tipoOperacion, solucion);

        } else {
            System.out.println("Los numeros ingresados no son correctos");
        }

    }

}
