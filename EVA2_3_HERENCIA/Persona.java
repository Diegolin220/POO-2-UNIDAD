/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_herencia_2;

/**
 *
 * @author diegi
 */
public class Persona {
    private String nombre;
    private String Apellidopa;
    private String Apellidoma;
    private int edad;
    private String rfc;

    public Persona() {
        this.nombre = "-----";
        this.Apellidopa="......";
        this.Apellidoma=",,,,,,,";
        this.edad=0;
        this.rfc="ererererere";
    }

    public Persona(String nombre, String Apellidopa, String Apellidoma, int edad, String rfc) {
        this.nombre = nombre;
        this.Apellidopa = Apellidopa;
        this.Apellidoma = Apellidoma;
        this.edad = edad;
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopa() {
        return Apellidopa;
    }

    public void setApellidopa(String Apellidopa) {
        this.Apellidopa = Apellidopa;
    }

    public String getApellidoma() {
        return Apellidoma;
    }

    public void setApellidoma(String Apellidoma) {
        this.Apellidoma = Apellidoma;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
}
