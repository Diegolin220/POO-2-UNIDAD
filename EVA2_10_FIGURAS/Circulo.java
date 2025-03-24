package com.mycompany.eva2_10_figuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diegi
 */
public class Circulo extends Figuras{
private double radio;

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*radio*2;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
