/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_devops;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class metodos {
   
    public void añadirDatos(Tarea t) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> listaPersonas = new ArrayList<>();
        
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        
        System.out.print("estado (true/false): ");
        boolean estado = Boolean.parseBoolean(sc.nextLine());
        
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
       Tarea persona = new Tarea(titulo, descripcion);
        persona.setEstado(estado); 
        
        listaPersonas.add(persona);
    }
}




    
