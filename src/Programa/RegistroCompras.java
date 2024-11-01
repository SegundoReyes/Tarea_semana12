
package Programa;

public class RegistroCompras {
    // Atributos de la clase
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    // Constructor
    public RegistroCompras(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }

    // Método para calcular el total de compras
    public double total() {
        return compra1 + compra2 + compra3 + compra4;
    }

    // Método para calcular el promedio de las compras
    public double promedio() {
        return (compra1 + compra2 + compra3 + compra4) / 4;
    }

    // Método para encontrar la compra mayor
    public double mayor() {
        double mayor = compra1;
        if (compra2 > mayor) {
            mayor = compra2;
        }
        if (compra3 > mayor) {
            mayor = compra3;
        }
        if (compra4 > mayor) {
            mayor = compra4;
        }
        return mayor;
    }

    // Método para encontrar la compra menor
    public double menor() {
        double menor = compra1;
        if (compra2 < menor) {
            menor = compra2;
        }
        if (compra3 < menor) {
            menor = compra3;
        }
        if (compra4 < menor) {
            menor = compra4;
        }
        return menor;
    }

    
}
