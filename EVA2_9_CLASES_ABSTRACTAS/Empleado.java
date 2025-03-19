/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_clases_abstractas;

/**
 *
 * @author diegi
 */
public class Empleado extends Persona {
    
    private double sueldo;

    public Empleado(double sueldo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
    }
    
     public Empleado() {
        super();
        this.sueldo = 0;
     
    
}

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void ImprimirDatos() {
         System.out.println("CLIENTE");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: " + sueldo);
    }
    
}