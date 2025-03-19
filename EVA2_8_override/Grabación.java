/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_8_override;

/**
 *
 * @author diegi
 */
public class  Grabación extends Ficha_APA {
    private String interpreste;
    
    public Grabación(){
        super();//LLAMANDO AL CONSTRUCTOR DE LA SUPER CLASE 
        interpreste = "Ficha Grabacion";
    }
    
    public Grabación(String autor, String titulo, int year, String interpreste, String ciudad){
     super(autor, titulo, year, ciudad);
     this.interpreste = interpreste;
             
    }
    
    public String getInterpreste() {
        return interpreste;
    }

    public void setInterpreste(String interpreste) {
        this.interpreste = interpreste;
    }
    
    @Override
    public String toString(){
        String cade = "Interprete" + interpreste + "\n";
                return cade;
    }
}
