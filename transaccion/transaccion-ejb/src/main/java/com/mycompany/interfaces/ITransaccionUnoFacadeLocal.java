/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Producto;
import com.mycompany.entity.Usuario;
import javax.ejb.Local;

/**
 *
 * @author braya
 */
@Local
public interface ITransaccionUnoFacadeLocal {
    
    void agregarRequired(Producto p, Usuario u);
    void agregarRequiresNew(Producto p, Usuario u);
    void agregarSupports(Producto p, Usuario u);
    void agregarMandatory(Producto p, Usuario u);
    void agregarNotSupported(Producto p, Usuario u);
    void agregarNever(Producto p, Usuario u);
    
}
