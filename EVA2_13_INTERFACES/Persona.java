/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_interfaces;

/**
 *
 * @author diegi
 */
public class Persona{
    private String Nombre;
    private String Apellido;

    public Persona(String Nombre, String Apeliido) {
        this.Nombre = Nombre;
        this.Apellido = Apeliido;
    }

    public Persona() {
        this.Nombre = "---------------";
        this.Apellido = "-----------";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApeliido() {
        return Apellido;
    }

    public void setApeliido(String Apeliido) {
        this.Apellido = Apeliido;
    }
   
}
