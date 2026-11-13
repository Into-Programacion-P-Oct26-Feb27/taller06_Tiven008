/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;
/*
 *
 * @author tiven
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String empleado;
        int tipo;
        int anios;        //es los años que un empleado a trabajado 
        double sueldoInicial;
        double porcentaje;
        double incrementoSalarial;
        double boniAntiguedad; //Bonificación por antigüedad
        double nuevoSueldo;
        
        porcentaje = 0;
        boniAntiguedad = 0;
        
        System.out.println("Nombre del empleado");
        empleado = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipo = entrada.nextInt();
        System.out.println("Ingrese los anios de servicio");
        anios = entrada.nextInt();
        System.out.println("Ingrese su sueldo inicial");
        sueldoInicial = entrada.nextDouble();
        
        if (tipo > 0 && anios >= 0 && sueldoInicial > 0) {
        
            switch(tipo){
                case 1:
                    porcentaje = 5;
                break;

                case 2:
                    porcentaje = 7;
                break;

                case 3:
                    porcentaje = 9;
                break;

                case 4:
                    porcentaje = 12;
                break;

                default:    
                    porcentaje = 15;
                break;       

            }

            if (anios < 2) {
                boniAntiguedad = 0;
            }else{ 
                if (anios < 5) {
                    boniAntiguedad = 30;
                }else{
                    if (anios < 10) {
                        boniAntiguedad = 60;
                    }else{
                        boniAntiguedad = 100;
                    }
                }
            }   

            incrementoSalarial = sueldoInicial * porcentaje / 100;
            nuevoSueldo = sueldoInicial + incrementoSalarial + boniAntiguedad;

            System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n\n"
            + "Empleado: %s\n"
            + "Tipo de empleado: %d\n"
            + "Anios de servicio: %d\n\n"
            + "Sueldo inicial: $%.2f\n"
            + "Porcentaje de incremento: %.0f%%\n"
            + "Incremento salarial: $%.2f\n"
            + "Bonificacion por antiguedad: $%.2f\n\n"
            + "Nuevo sueldo: $%.2f\n",
            empleado, tipo, anios, sueldoInicial, porcentaje,
            incrementoSalarial, boniAntiguedad, nuevoSueldo);
        
        }else{
            System.out.println("Los numeros ingresados no son correctos");
        }
        
    }
    
}