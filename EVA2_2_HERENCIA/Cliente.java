/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author diegi
 */
public class Cliente {
    private String nombre;
    private String Apellidopa;
    private String Apellidoma;
    private int edad;
    private String rfc;
    
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String valor){
        valor = this.nombre;
    }
    public String getApellidoma(){
        return Apellidoma;
    }
    public void setApellidoma(String valor){
        valor = this.Apellidoma;
    }
    public String getApellidopa(){
        return Apellidopa;
    }
    public void setapellidopa(String valor){
        valor = this.Apellidopa;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int valor){
        valor = this.edad;
    }
    public String getrfc(){
        return rfc;
    }
    public void setrfc(String valor){
        valor = this.rfc;
    }
      public Cliente(String nombre, String Apellidopa, String Apellidoma, int edad, String rfc){
        this.nombre = nombre;
        this.Apellidopa=Apellidopa;
        this.Apellidoma=Apellidoma;
        this.edad=edad;
        this.rfc=rfc;
      }
      
      public Cliente(){
        this.nombre = "Diego";
        this.Apellidopa="Salas";
        this.Apellidoma="Lopez de Lara";
        this.edad=19;
        this.rfc="ererererere";
}
      
}
