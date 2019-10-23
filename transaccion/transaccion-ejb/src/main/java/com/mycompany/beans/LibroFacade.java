/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import interfaces.ILibroFacadeLocal;
import com.mycompany.entity.Libro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brayansebastian
 */
@Stateless
public class LibroFacade extends AbstractFacade<Libro> implements ILibroFacadeLocal {
    @PersistenceContext(unitName = "transaccion_UN")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroFacade() {
        super(Libro.class);
    }
    
}
