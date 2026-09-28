package com.sv.parcial;

public class Main {

    public static void main(String[] args) {
        // Rama feature/comision-personalizada: el vendedor usa la ComisionPersonalizada
        Vendedor vendedor = new Vendedor("Luis Alonso Alvarenga Meza", 2500.00, new ComisionPersonalizada("Luis"));
        vendedor.mostrarDetalle();
    }
}
