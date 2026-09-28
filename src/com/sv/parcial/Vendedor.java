package com.sv.parcial;

/** Subclase concreta: implementa el metodo abstracto de Empleado. */
public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("==============================================");
        System.out.println(" Vendedor : " + nombre);
        System.out.printf(" Ventas del mes : $%,.2f%n", ventasMes);
        System.out.println(" Estrategia : " + estrategia);
        System.out.printf(" Comision obtenida : $%,.2f%n", calcularComision()); // calculo polimorfico
        System.out.println("==============================================");
    }
}
