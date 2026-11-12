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
            switch (opcion) {
                case 1:
                    operacion = "Suma";
                    resultado = numero1 + numero2;
                    calculado = true;
                    break;

                case 2:
                    operacion = "Resta";
                    resultado = numero1 - numero2;
                    calculado = true;
                    break;

                case 3:
                    operacion = "Multiplicacion";
                    resultado = numero1 * numero2;
                    calculado = true;
                    break;

                case 4:
                    if (numero2 != 0) {
                        operacion = "Division";
                        resultado = numero1 / numero2;
                        calculado = true;
                    } else {
                        System.out.println("No es posible dividir para cero");
                    }
                    break;

                case 5:
                    if (numero2 != 0) {
                        operacion = "Modulo";
                        resultado = numero1 % numero2;
                        calculado = true;
                    } else {
                        System.out.println("No es posible calcular el modulo con cero");
                    }
                    break;

                case 6:
                    operacion = "Potencia";
                    resultado = Math.pow(numero1, numero2);
                    calculado = true;
                    break;

                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
        } else {
            System.out.println("No es posible realizar la operacion: "
                    + "el primer numero debe ser mayor que el segundo");
        }

        if (calculado) {
            System.out.printf("\nOPERACIONES ARITMÉTICAS\n"
                            + "Primer número: %.2f\n"
                            + "Segundo número: %.2f\n"
                            + "Operación seleccionada: %s\n"
                            + "\nResultado: %.2f\n"
                            ,numero1 ,numero2 ,operacion ,resultado);

        }
    }
}
        
