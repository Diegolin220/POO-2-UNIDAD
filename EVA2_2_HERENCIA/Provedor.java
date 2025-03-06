/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author diegi
 */
public class Provedor {
    private String nombre;
    private String Apellidopa;
    private String Apellidoma;
    private int edad;
    private String rfc;
    private boolean credito;

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
     public boolean getcredito(){
        return credito;
    }
    public void setcredito(boolean valor){
        valor = credito;
    }
    public Provedor(String nombre, String Apellidopa, String Apellidoma, int edad, String rfc, boolean credito){
        this.nombre = nombre;
        this.Apellidopa=Apellidopa;
        this.Apellidoma=Apellidoma;
        this.edad=edad;
        this.rfc=rfc;
        this.credito= credito;
                
    }
    public Provedor(){
        this.nombre = "Diego";
        this.Apellidopa="Salas";
        this.Apellidoma="Lopez de Lara";
        this.edad=19;
        this.rfc="ererererere";
        this.credito=false;
}
    
}
