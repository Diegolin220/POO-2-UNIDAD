/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_1_exa_practico;

/**
 *
 * @author diegi
 */
public class TestCovid {
    private int edad;
    private boolean tienenEnfermedad;
    private int peso;
    private int estatura;
    
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    public boolean gettienenEnfermedad(){
        return tienenEnfermedad;
    }
    public void settienenEnfermedad(boolean tienenEnfermedad){
        this.tienenEnfermedad = tienenEnfermedad;
    }
    public int getpeso(){
        return peso;
    }
    public void setpesod(int peso){
        this.peso = peso;
    }
    public int getestatura(){
        return estatura;
    }
    public void setestatura(int estatura){
        this.estatura = estatura;
    }
    
    public TestCovid(){
        this.edad =43;
        this.tienenEnfermedad = false;
        this.peso = 80;
        this.estatura = 170;
                
    }
     public TestCovid(int edad,int peso, boolean tienenEnfermedad, int estatura){
          this.edad = edad;
        this.tienenEnfermedad = tienenEnfermedad;
        this.peso = peso;
        this.estatura = estatura;
     }
     
     private double calcularIMC(){
         double mts = estatura / 100.0;
         return(peso / (mts * mts));
     }
     
     public String calcularPersonaRiesgo(){
         if (edad >=65){
             return "Persona de riesgo";
         }else if (tienenEnfermedad == true){
             return "Persona de riesgo";
         }else if (calcularIMC()>30){
             return "Persona de riesgo";
     }else{
             return "Persona SIN riesgo";
         }
     }
}
