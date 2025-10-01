/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_devops;

/**
 *
 * @author daw2
 */
public class Tarea {
    private int id;
    private String titulo;
    private boolean estado;
    private String descripcion;

    public Tarea(String titulo, String descripcion) {
        this.id = 0;
        this.titulo = titulo;
        this.estado = false;
        this.descripcion = descripcion;
        this.id++;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", titulo=" + titulo + ", estado=" + estado + ", descripcion=" + descripcion + '}';
    }
    
    

    
    
}
