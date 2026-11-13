/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
import java.util.Locale;
import java.util.Scanner;

public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        double numero1;
        double numero2;
        double resultado;
        String operacion;
        boolean calculado;

        resultado = 0;
        operacion = "";
        calculado = false;

        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextDouble();
        System.out.println("Ingrese la operacion\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 multiplicacion\n"
                + "4 division\n"
                + "5 modulo\n"
                + "6 potencia");
        opcion = entrada.nextInt();

        if (numero1 > numero2) {
            if (opcion == 1) {
                operacion = "Suma";
                resultado = numero1 + numero2;
                calculado = true;
            } else {
                if (opcion == 2) {
                    operacion = "Resta";
                    resultado = numero1 - numero2;
                    calculado = true;
                } else {
                    if (opcion == 3) {
                        operacion = "Multiplicacion";
                        resultado = numero1 * numero2;
                        calculado = true;
                    } else {
                        if (opcion == 4) {
                            if (numero2 != 0) {
                                operacion = "Division";
                                resultado = numero1 / numero2;
                                calculado = true;
                            } else {
                                System.out.println("No es posible dividir para cero");
                            }
                        } else {
                            if (opcion == 5) {
                                if (numero2 != 0) {
                                    operacion = "Modulo";
                                    resultado = numero1 % numero2;
                                    calculado = true;
                                } else {
                                    System.out.println("No es posible calcular el modulo con cero");
                                }
                            } else {
                                if (opcion == 6) {
                                    operacion = "Potencia";
                                    resultado = Math.pow(numero1, numero2);
                                    calculado = true;
                                } else {
                                    System.out.println("La opcion no es valida");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Los numeros ingresados no son correctos");
            System.out.println("No es posible realizar la operacion: "
                    + "el primer numero debe ser mayor que el segundo");
        }

        if (calculado) {
            System.out.printf("\nOPERACIONES ARITMETICAS\n"
                            + "Primer numero: %.2f\n"
                            + "Segundo numero: %.2f\n"
                            + "Operacion seleccionada: %s\n"
                            + "\nResultado: %.2f\n"
                            , numero1, numero2, operacion, resultado);
        }
    }
}
        
