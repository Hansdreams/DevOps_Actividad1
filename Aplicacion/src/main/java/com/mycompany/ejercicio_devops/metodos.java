/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_devops;

import java.util.ArrayList;

/**
 *
 * @author daw2
 */
public class metodos {
    
    private ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
    
    Tarea a = new Tarea(1, "pruba", "prueba");
   
    public String mostrarTareas(){
        
        listaTareas.add(a);
        
        String mensaje = "";
        
        for (Tarea t : listaTareas) {
            
            mensaje+=t.toString()+"\n";
        }
        
        return mensaje;
    
    }
        
        
    
    
    
}
