package com.sv.parcial;

/** Estrategia por defecto: 5% de la venta. */
public class ComisionEstandar implements EstrategiaComision {

    private static final double PORCENTAJE = 5.0;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE / 100.0;
    }

    @Override
    public String toString() {
        return "Comision Estandar (" + PORCENTAJE + "%)";
    }
}
