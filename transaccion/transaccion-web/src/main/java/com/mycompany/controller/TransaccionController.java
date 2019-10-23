/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entity.Libro;
import interfaces.ILibroFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB; 

/**
 *
 * @author brayansebastian
 */
@Named(value = "transaccionController")
@SessionScoped
public class TransaccionController implements Serializable {
    
    @EJB
    private ILibroFacadeLocal libroFacade;

    public TransaccionController() {
    }
    
    public void NoUsaTransaccion(){
        
        try {
            
            Libro libro1 = new Libro();
            libro1.setNombre("nuevo libroprueba");
            libro1.setAutor("prueba");
            libro1.setPrecio(2000);
            this.libroFacade.create(libro1);
            
            //Crear Excepcion
            int result = 1/0;
            
            Libro libro2 = new Libro();
            libro2.setNombre("nuevo libroprueba 2");
            libro2.setAutor("prueba 2");
            libro2.setPrecio(2100);
            this.libroFacade.create(libro2);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
