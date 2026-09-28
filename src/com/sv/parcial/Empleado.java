package com.sv.parcial;

/**
 * Clase abstracta: plantilla de todo empleado. Conoce su estrategia de comision
 * solo a traves de la interfaz (inyeccion del patron Strategy).
 */
public abstract class Empleado {

    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    protected Empleado(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public EstrategiaComision getEstrategia() {
        return estrategia;
    }

    // Metodo concreto: permite cambiar la estrategia en tiempo de ejecucion
    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    // Metodo concreto: el calculo se resuelve polimorficamente segun la estrategia inyectada
    public double calcularComision() {
        return estrategia.calcularComision(ventasMes);
    }

    // Metodo abstracto: cada tipo de empleado decide como mostrarse
    public abstract void mostrarDetalle();
}
