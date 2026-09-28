package com.sv.parcial;

/**
 * Estrategia personalizada: (5 + N)% de la venta, donde N es la cantidad
 * de letras del primer nombre. Ejemplo mi nombre: Luis tiene 4 letras = 9%.
 */
public class ComisionPersonalizada implements EstrategiaComision {

    private static final double PORCENTAJE_BASE = 5.0;

    private final String primerNombre;
    private final double porcentaje;

    public ComisionPersonalizada(String primerNombre) {
        this.primerNombre = primerNombre;
        this.porcentaje = PORCENTAJE_BASE + primerNombre.length(); // 5 + N
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return "Comision Personalizada (" + porcentaje + "% = 5 + "
                + primerNombre.length() + " letras de \"" + primerNombre + "\")";
    }
}
