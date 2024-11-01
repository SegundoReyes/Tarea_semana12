
package Programa;
import java.util.Scanner;
public class Programa01 {
    public static void main (String []agrs){
        //variable
        double venta1,venta2,venta3;
        
        Scanner lectura = new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese venta 1:");
        venta1=lectura.nextDouble();
        System.out.print("Ingrese venta 2:");
        venta2=lectura.nextDouble();
        System.out.print("Ingrese venta 3:");
        venta3=lectura.nextDouble();
        //crear un objeto de la clase RegistroVenta
        RegistroVenta objetoregistroventa=new RegistroVenta(venta1,venta2,venta3);
        //saloda de datos
        System.out.println("Resultado");
        System.out.println("Total de ventas:"+objetoregistroventa.total());
        System.out.println("Promedio de ventas:"+objetoregistroventa.promedio());
        System.out.println("Mayor de ventas:"+objetoregistroventa.mayor());
        System.out.println("Menor de venta:"+objetoregistroventa.menor());
        
                
    }
    
}
