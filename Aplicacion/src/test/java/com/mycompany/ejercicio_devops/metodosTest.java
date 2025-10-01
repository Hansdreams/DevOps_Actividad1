/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio_devops;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw2
 */
public class metodosTest {
    
   ArrayList<Tarea> tareaAux=new ArrayList<>();
    
    public metodosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        Tarea tarea=new Tarea("hacer examen", "examen prueba");
               Tarea tarea2 = new Tarea("hacer examen 1", "examen prueba 1");
        tareaAux.add(tarea);
        tareaAux.add(tarea2);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of marcarCompletado method, of class metodos.
     */
    @Test
    public void testMarcarCompletado() {
        System.out.println("marcarCompletado");
        ArrayList<Tarea> aux = tareaAux;
        String titulo = "hacer examen";
        metodos instance = new metodos();
        boolean expResult = true;
        boolean result = instance.marcarCompletado(aux, titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class metodos.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        ArrayList<Tarea> aux = tareaAux;
        String titulo = "hacer examen";
        metodos instance = new metodos();
        boolean expResult = true;
        boolean result = instance.eliminar(aux, titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

    
    
    
  