
package Programa;
import java.util.Scanner;
public class Programa02 {
    public static void main (String []args){
        
        //variables
        double sueldo1, sueldo2, sueldo3, sueldo4;
        
        Scanner lectura = new Scanner (System.in);
        
        // Entrada de datos
        System.out.print("Ingrese sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingrese sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingrese sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingrese sueldo 4: ");
        sueldo4 = lectura.nextDouble();

        // Crear un objeto de la clase RegistroSueldo
        RegistroSueldo objetoRegistroSueldo = new RegistroSueldo(sueldo1, sueldo2, sueldo3, sueldo4);
        
        // Salida de datos
        System.out.println("\nResultado");
        System.out.println("Total de sueldos: " + objetoRegistroSueldo.total());
        System.out.println("Promedio de sueldos: " + objetoRegistroSueldo.promedio());
        System.out.println("Sueldo mayor: " + objetoRegistroSueldo.mayor());
        System.out.println("Sueldo menor: " + objetoRegistroSueldo.menor());
        
    }
}
