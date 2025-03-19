/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_8_override;

/**
 *
 * @author diegi
 */
public class Libro extends Ficha_APA {
    private String editorial;
    
    public Libro(){
        super();
        editorial = "Ficha APA";
    }
    
    public Libro(String autor, String titulo, int year, String editorial, String ciudad){
        super(autor, titulo, year, ciudad);
        this.editorial = "editorial";
    }
    

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString(){
        String cade = "Editorial: " + editorial + "\n";
                return cade;
    }
    
}
