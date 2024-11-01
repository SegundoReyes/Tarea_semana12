
package Programa;

import java.util.Scanner;
public class Programa04 {
    public static void main (String [] args){
        
      //variables
        double compra1, compra2, compra3, compra4;

        Scanner lectura = new Scanner (System.in);
        
        // Entrada de datos
        
        System.out.print("Ingrese compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingrese compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingrese compra 3: ");
        compra3 = lectura.nextDouble();
        System.out.print("Ingrese compra 4: ");
        compra4 = lectura.nextDouble();

        // Crear un objeto de la clase RegistroCompras
        RegistroCompras objetoRegistroCompras = new RegistroCompras(compra1, compra2, compra3, compra4);

        // Salida de datos
        System.out.println("\nResultado");
        System.out.println("Total de compras: " + objetoRegistroCompras.total());
        System.out.println("Promedio de compras: " + objetoRegistroCompras.promedio());
        System.out.println("Compra mayor: " + objetoRegistroCompras.mayor());
        System.out.println("Compra menor: " + objetoRegistroCompras.menor());
    }
}
    

