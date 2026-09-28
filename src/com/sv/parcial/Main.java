package com.sv.parcial;

public class Main {

    public static void main(String[] args) {
        // Rama main: el vendedor usa por defecto la ComisionEstandar
        Vendedor vendedor = new Vendedor("Luis Alonso Alvarenga Meza", 2500.00, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
