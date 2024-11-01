
package Programa;

import java.util.Scanner;

public class Programa03 {
    public static void main (String [] args){
        
         // Variables
        double ingresoMensual, otrosIngresos, gastosMensuales;
        
        Scanner lectura = new Scanner (System.in);
        
        // Entrada de datos
        
        System.out.print("Ingrese el ingreso mensual del empleado: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese otros ingresos mensuales del empleado: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingrese los gastos mensuales del empleado: ");
        gastosMensuales = lectura.nextDouble();

        // Crear un objeto de la clase RegistroAhorro
       RegistroFinanciero objetoRegistroAhorro = new RegistroFinanciero(ingresoMensual, otrosIngresos, gastosMensuales);

        // Salida de datos
        System.out.println("\nResumen de Ahorros:");
        System.out.printf("Ahorro mensual: %.2f\n", objetoRegistroAhorro.ahorroMensual());
        System.out.printf("Ahorro semestral proyectado: %.2f\n", objetoRegistroAhorro.ahorroSemestral());
        System.out.printf("Ahorro anual proyectado: %.2f\n", objetoRegistroAhorro.ahorroAnual());
      
    }
    
}
