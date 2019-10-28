/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transaccion;

import com.mycompany.entity.Cliente;
import com.mycompany.entity.Producto;
import com.mycompany.entity.Usuario;
import com.mycompany.interfaces.IClienteFacadeLocal;
import com.mycompany.interfaces.ITransaccionDosFacadeLocal;
import com.mycompany.interfaces.ITransaccionUnoFacadeLocal;
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
public class TransaccionDos implements ITransaccionDosFacadeLocal{
    
    @EJB
    IClienteFacadeLocal clienteFacade;
    
    @EJB
    ITransaccionUnoFacadeLocal transaccionUnoFacade;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarRequired(Producto p, Usuario u, Cliente c) {
        clienteFacade.create(c);
        transaccionUnoFacade.agregarRequired(p, u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarRequiresNew(Producto p, Usuario u, Cliente c) {
        clienteFacade.create(c);
        try{
            transaccionUnoFacade.agregarRequiresNew(p, u);
        }catch(Exception ex){
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarSupports(Producto p, Usuario u, Cliente c) {
        clienteFacade.create(c);
        transaccionUnoFacade.agregarSupports(p, u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarMandatory(Producto p, Usuario u, Cliente c) {
        clienteFacade.create(c);
        transaccionUnoFacade.agregarMandatory(p, u);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarNotSupported(Producto p, Usuario u, Cliente c) {
        clienteFacade.create(c);
        try{
            transaccionUnoFacade.agregarRequiresNew(p, u);
        }catch(Exception ex){
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarNever(Producto p, Usuario u, Cliente c) {
        clienteFacade.create(c);
        try{
            transaccionUnoFacade.agregarRequiresNew(p, u);
        }catch(Exception ex){
        }
    }
    
}
