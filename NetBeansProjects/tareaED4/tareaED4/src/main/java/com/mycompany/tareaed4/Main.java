/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaed4;

/**
 *
 * @author kaddu
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    private static void operativa_cuenta(float CANTIDAD) {
        Cuenta1 miCuenta;
        double saldoActual;

        miCuenta = new Cuenta1("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static class SaldoInsuficienteException {

        public SaldoInsuficienteException() {
        }
    }
}
