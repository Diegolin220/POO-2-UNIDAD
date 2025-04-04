/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_cuenta_banco;

/**
 *
 * @author diegi
 */
public class cuentaCorriente extends Cuenta {
    private int limitedeSaldo;

    @Override
    public int agregar() {
        return limitedeSaldo+100;
    }

    @Override
    public int quitar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public cuentaCorriente(int limitedeSaldo) {
        this.limitedeSaldo = limitedeSaldo;
    }
    
    public cuentaCorriente() {
        this.limitedeSaldo = 0;
    }

    public int getLimitedeSaldo() {
        return limitedeSaldo;
    }

    public void setLimitedeSaldo(int limitedeSaldo) {
        this.limitedeSaldo = limitedeSaldo;
    }
    
}
