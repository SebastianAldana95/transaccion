/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transaccion;

import com.mycompany.entity.Producto;
import com.mycompany.entity.Usuario;
import com.mycompany.interfaces.IProductoFacadeLocal;
import com.mycompany.interfaces.ITransaccionUnoFacadeLocal;
import com.mycompany.interfaces.IUsuarioFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author braya
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TransaccionUno implements ITransaccionUnoFacadeLocal{
    
    @EJB
    IProductoFacadeLocal productoFacade;
    @EJB
    IUsuarioFacadeLocal usuarioFacade;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarRequired(Producto p, Usuario u) {
        productoFacade.create(p);
        usuarioFacade.create(u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void agregarRequiresNew(Producto p, Usuario u) {
        productoFacade.create(p);
        usuarioFacade.create(u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void agregarSupports(Producto p, Usuario u) {
        productoFacade.create(p);
        usuarioFacade.create(u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void agregarMandatory(Producto p, Usuario u) {
        productoFacade.create(p);
        usuarioFacade.create(u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void agregarNotSupported(Producto p, Usuario u) {
        productoFacade.create(p);
        usuarioFacade.create(u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarNever(Producto p, Usuario u) {
        productoFacade.create(p);
        usuarioFacade.create(u);
    }
    
}
