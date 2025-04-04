/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_interfaces;

/**
 *
 * @author diegi
 */
public class Empleado extends Persona implements MostrarDatos{
    private String clave;

    public Empleado(String clave, String Nombre, String Apeliido) {
        super(Nombre, Apeliido);
        this.clave = clave;
    }

    public Empleado(String clave) {
        super();
        this.clave = "--------";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApeliido() );
        System.out.println("Clave: " + getClave());
    }
    
    
}
