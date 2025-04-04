/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_final;

/**
 *
 * @author diegi
 */
public class EVA2_12_FINAL {
    final static int VALOR=100;
    public static void main(String[] args) {
        System.out.println("Valor: " + VALOR);
        //NO SE PUEDE MODIFICAR: VALOR=200;
        Docente doc =new Docente();
        
    }
}
class Persona {}
class Empleado extends Persona{}
final class Docente extends Empleado{}//Hasta aqui llega la herencia
//class DocenteKinder extends Docente{}