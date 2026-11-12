/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String propietario;
        String tipo;   
        String descripcion;
        double avaluo;
        double recargo;
        double total;
        double porcentaje;
        double valorfijo;
        double valorBase;
        boolean tipoValido; 
        
        descripcion = "";
        porcentaje = 0;
        valorfijo = 0;
        recargo = 0;
        tipoValido = true;

        System.out.println("Ingrese el Nombre del Propietario");
        propietario = entrada.nextLine();

        System.out.println("Ingrese el Tipo de su Vehiculo\n"
                + "1 Vehiculo liviano particular\n"
                + "2 Vehiculo grande particular\n"
                + "3 Taxi\n"
                + "4 Bus\n");
                tipo = entrada.nextLine();       

        System.out.println("Ingrese el Avaluo comercial del vehiculo");
        avaluo = entrada.nextDouble();

            switch(tipo){
                case "1":
                    descripcion = "Vehiculo liviano particular";
                    porcentaje = 0.01;
                    valorfijo = 2.00;
                    break;

                case "2":
                    descripcion = "Vehiculo grande particular";
                    porcentaje = 0.02;
                    valorfijo = 2.50;
                    break;

                case "3":
                    descripcion = "Taxi";
                    porcentaje = 0.04;
                    valorfijo = 1.50;
                    break;

                case "4":
                    descripcion = "Bus";
                    porcentaje = 0.05;
                    valorfijo = 2.20;
                    break;
                    
                default:
                tipoValido = false;
                System.out.println("El tipo de vehiculo no es valido");
                break;

            }
            
            if (tipoValido) {
            valorBase = avaluo * porcentaje / 100 + valorfijo;

            if ((tipo.equals("1") || tipo.equals("2")) && avaluo > 30000) {
                recargo = 1.50;
            }

            total = valorBase + recargo;
            
            System.out.printf("\nPeaje \"Buena Via\"\n"
            +"Propietario: %s\n"
            +"Tipo: %s\n"
            +"    Avaluo: $%.2f\n"
            +"    Valor base del peaje: $%.2f\n"
            +"    Recargo: $%.2f\n"
            +"\n    Total a cancelar: $%.2f\n"
            , propietario, descripcion, avaluo, valorBase, recargo, total);

        }
    }
}