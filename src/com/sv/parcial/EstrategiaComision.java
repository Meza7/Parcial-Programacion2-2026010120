package com.sv.parcial;

/**
 * Patron Strategy: contrato que deben cumplir todas las formas de calcular comision.
 * Empleado depende de esta interfaz, nunca de una implementacion concreta.
 */
public interface EstrategiaComision {

    double calcularComision(double montoVenta);
}
