/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_clases_abstractas;

/**
 *
 * @author diegi
 */
public class Clientes extends Persona{
    private String tipoPersona;

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Clientes(String tipoPersona) {
        super();
        this.tipoPersona = "----------";
    }

    public Clientes(String tipoPersona, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.tipoPersona = tipoPersona;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("CLIENTE");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tipo de Persona: " + tipoPersona);
    }

    void imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
