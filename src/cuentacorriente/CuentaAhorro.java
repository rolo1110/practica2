/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

/**
 *
 * @author raul9
 */
public class CuentaAhorro extends CuentaCorriente {

    double interes;

    public CuentaAhorro(String nombre, String numCuenta, double saldo, double interes) {
        super(nombre, numCuenta, saldo, 0);
        this.interes = interes;
    }

    public CuentaAhorro(String nombre, String numCuenta, double interes) {
        super(nombre, numCuenta);
        this.interes = interes;
    }

    public double getInteres() {
        return this.interes;
    }
}
