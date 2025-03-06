/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author diegi
 */
public class Empleado {
    private String nombre;
    private String Apellidopa;
    private String Apellidoma;
    private int edad;
    private String rfc;
    private int claveEmpleado;
    
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String valor){
        valor = nombre;
    }
    public String getApellidoma(){
        return Apellidoma;
    }
    public void setApellidoma(String valor){
        valor = Apellidoma;
    }
    public String getApellidopa(){
        return Apellidopa;
    }
    public void setapellidopa(String valor){
        valor = Apellidopa;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int valor){
        valor = edad;
    }
    public String getrfc(){
        return rfc;
    }
    public void setrfc(String valor){
        valor = rfc;
    }
    public int getclaveEmpleado(){
        return claveEmpleado;
    }
    public void setclaveEmpleado(int valor){
        valor = claveEmpleado;
    }
    public Empleado(String nombre, String Apellidopa, String Apellidoma, int edad, String rfc, int claveEmpleado){
        this.nombre = nombre;
        this.Apellidopa=Apellidopa;
        this.Apellidoma=Apellidoma;
        this.edad=edad;
        this.rfc=rfc;
        this.claveEmpleado=claveEmpleado;
                
    }
    public Empleado(){
        this.nombre = "Diego";
        this.Apellidopa="Salas";
        this.Apellidoma="Lopez de Lara";
        this.edad=19;
        this.rfc="ererererere";
        this.claveEmpleado=2455;
}
}
