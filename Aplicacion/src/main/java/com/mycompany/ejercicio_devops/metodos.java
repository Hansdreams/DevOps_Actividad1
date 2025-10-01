/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_devops;

import java.util.ArrayList;

public class metodos {

    private ArrayList<Tarea> tareas=new ArrayList<>();

    public metodos() {

    }

    public boolean marcarCompletado(ArrayList<Tarea> aux,String titulo) {
        boolean marcada = false;
        if (aux.isEmpty()) {
            System.out.println("vacio");
        } else {
            for (Tarea tarea1 : aux) {

                if (tarea1.getTitulo().equals(titulo)) {

                    marcada = true;

                    tarea1.setEstado(true);

                }
            }

        }
        return marcada;
    }

    public boolean eliminar(ArrayList<Tarea> aux,String titulo) {
        boolean eliminada = false;
        if (aux.isEmpty()) {
            System.out.println("vacio");
        } else {
            for (Tarea tarea1 : aux) {

                if (tarea1.getTitulo().equals(titulo)) {
                    aux.remove(tarea1);
                    eliminada = true;

                }
            }

        }
        return eliminada;
    }

}




