/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_herencia_2;

/**
 *
 * @author diegi
 */
public class EVA2_3_HERENCIA_2 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Diego");
        System.out.println("Nombre: " + empleado.getNombre());
        empleado.setNumeroEmpleado(122);
        System.out.println("Numero del Empleado: " + empleado.getNumeroEmpleado());
        
        System.out.println("----------------------------------------------");
        
        //proveedor
        Provedor prov = new Provedor();
        prov.setNombre("Walmart");
        prov.setCredito(false);
        System.out.println("Nombre: " + prov.getNombre());
        System.out.println("Credito: " + prov.isCredito());
        
       System.out.println("----------------------------------------------");
       
        Cliente cli = new Cliente();
        cli.setNombre("CFE");
        cli.setRazonSocial("Cobrador de Luz");
        System.out.println("Nombre: " + cli.getNombre());
        System.out.println("Razon Social: " + cli.getRazonSocial());
    }
}
