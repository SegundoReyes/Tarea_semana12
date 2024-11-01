
package Programa;

public class RegistroFinanciero {
     // Atributos de la clase
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // Constructor
    public RegistroFinanciero(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }

    // Método para calcular el ingreso total mensual
    public double ingresoTotalMensual() {
        return ingresoMensual + otrosIngresos;
    }

    // Método para calcular el ahorro mensual
    public double ahorroMensual() {
        return ingresoTotalMensual() - gastosMensuales;
    }

    // Método para calcular el ahorro semestral proyectado
    public double ahorroSemestral() {
        return ahorroMensual() * 6;
    }

    // Método para calcular el ahorro anual proyectado
    public double ahorroAnual() {
        return ahorroMensual() * 12;
    }
   
}
