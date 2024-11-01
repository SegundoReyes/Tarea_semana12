
package Programa;


public class RegistroSueldo {
  
    // Atributos de la clase
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    // metodo Constructor
    public RegistroSueldo(double sueldo1, double sueldo2, double sueldo3, double sueldo4) {
        this.sueldo1 = sueldo1;
        this.sueldo2 = sueldo2;
        this.sueldo3 = sueldo3;
        this.sueldo4 = sueldo4;
    }

    // Método para calcular el total de sueldos
    public double total() {
        return sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }

    // Método para calcular el promedio de los sueldos
    public double promedio() {
        return (sueldo1 + sueldo2 + sueldo3 + sueldo4) / 4;
    }

    // Método para encontrar el sueldo mayor
    public double mayor() {
        double mayor = sueldo1;
        if (sueldo2 > mayor) {
            mayor = sueldo2;
        }
        if (sueldo3 > mayor) {
            mayor = sueldo3;
        }
        if (sueldo4 > mayor) {
            mayor = sueldo4;
        }
        return mayor;
    }

    // Método para encontrar el sueldo menor
    public double menor() {
        double menor = sueldo1;
        if (sueldo2 < menor) {
            menor = sueldo2;
        }
        if (sueldo3 < menor) {
            menor = sueldo3;
        }
        if (sueldo4 < menor) {
            menor = sueldo4;
        }
        return menor;
    
}
  
}
