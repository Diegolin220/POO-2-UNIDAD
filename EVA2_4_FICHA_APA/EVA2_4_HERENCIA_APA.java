/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_herencia_apa;

/**
 *
 * @author diegi
 */
public class EVA2_4_HERENCIA_APA {

    public static void main(String[] args) {
        Grabación grab= new Grabación("AC/DC", "Black in Black" , 1980,"Brayan Johnoson","Reino Unido");
        System.out.println("Interprete: " + grab.getInterpreste());
        System.out.println("Autor: " + grab.getAutor());
        System.out.println("Titulo: " + grab.getTitulo());
        System.out.println("Ciudad: " + grab.getCiudad());
        System.out.println("Año: " + grab.getYear());
        
        
        Libro lib = new Libro("Diego Salas", "Los tres mosqueteros", 1950, "Los buenos libros", "CDMX");
        System.out.println("Autor: " + lib.getAutor());
        System.out.println("Titulo: " + lib.getTitulo());
        System.out.println("Año: " + lib.getYear());
        System.out.println("Editortial: " + lib.getEditorial());
        System.out.println("Ciudad: " + lib.getCiudad());
                
    }
}
