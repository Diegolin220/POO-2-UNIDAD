/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_herencia_apa;

/**
 *
 * @author diegi
 */
public class Ficha_APA {
    private String autor;
    private String titulo;
    private int year;
    private String ciudad;

    public Ficha_APA() {
        this.autor = "Ficha Apa";
        this.titulo = "Ficha Apa";
        this.year = 0;
        this.ciudad="Ciudad";
                
    }

    public Ficha_APA(String autor, String titulo, int year, String ciudad) {
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
        this.ciudad = ciudad;
    }
   
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
