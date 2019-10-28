/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import com.mycompany.entity.Cliente;
import com.mycompany.entity.Producto;
import com.mycompany.entity.Usuario;
import com.mycompany.interfaces.ITransaccionDosFacadeLocal;
import com.mycompany.interfaces.ITransaccionUnoFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


/**
 *
 * @author braya
 */
@Named//(value = "inicioController")
@RequestScoped
public class InicioController implements Serializable{
    
    
    //Producto
    private String nombre;
    private int precio;
    private int cantidad;
    private String descripcion;
    //Usuario
    private String nombres;
    private String apellidos;
    //Cliente
    private String nombresc;
    private String apellidosc;
    
    @EJB
    ITransaccionUnoFacadeLocal transaccionUnoLocal;
    @EJB
    ITransaccionDosFacadeLocal transaccionDosLocal;
    
    public InicioController() {
    }
    
    public void agregarRequiredNoTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        transaccionUnoLocal.agregarRequired(p, u);
        FacesMessage msg = new FacesMessage("No hay transaccion, Agregado con Required.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarRequiredNewNoTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        transaccionUnoLocal.agregarRequiresNew(p, u);
        FacesMessage msg = new FacesMessage("No hay transaccion, Agregado con Requires New.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarSupportsNoTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        transaccionUnoLocal.agregarSupports(p, u);
        FacesMessage msg = new FacesMessage("No hay transaccion, Agregado con Supports.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarMandatoryNoTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        transaccionUnoLocal.agregarMandatory(p, u);
        FacesMessage msg = new FacesMessage("No hay transaccion, Agregado con Mandatory.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarNotSupportedNoTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        transaccionUnoLocal.agregarNotSupported(p, u);
        FacesMessage msg = new FacesMessage("No hay transaccion, Agregado con Not Supported.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarNeverNoTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        transaccionUnoLocal.agregarNever(p, u);
        FacesMessage msg = new FacesMessage("No hay transaccion, Agregado con Never.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    //METODOS CUANDO SI HAY TRANSACCION
    
    public void agregarRequiredTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        Cliente c = new Cliente(nombresc, apellidosc);
        transaccionDosLocal.agregarRequired(p, u, c);
        FacesMessage msg = new FacesMessage("Nueva transaccion, Agregado con Required.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarRequiresNewTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        Cliente c = new Cliente(nombresc, apellidosc);
        transaccionDosLocal.agregarRequiresNew(p, u, c);
        FacesMessage msg = new FacesMessage("Nueva transaccion, Agregado con Requires New.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarSupportsTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        Cliente c = new Cliente(nombresc, apellidosc);
        transaccionDosLocal.agregarSupports(p, u, c);
        FacesMessage msg = new FacesMessage("Nueva transaccion, Agregado con Supports.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarMandatoryTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        Cliente c = new Cliente(nombresc, apellidosc);
        transaccionDosLocal.agregarMandatory(p, u, c);
        FacesMessage msg = new FacesMessage("Nueva transaccion, Agregado con Mandatory");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarNotSupportedTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        Cliente c = new Cliente(nombresc, apellidosc);
        transaccionDosLocal.agregarNotSupported(p, u, c);
        FacesMessage msg = new FacesMessage("Nueva transaccion, Agregado con Not Supported.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    
    public void agregarNeverTransaccional(){
        Producto p = new Producto(nombre, precio, cantidad, descripcion);
        Usuario u = new Usuario(nombres, apellidos);
        Cliente c = new Cliente(nombresc, apellidosc);
        transaccionDosLocal.agregarNever(p, u, c);
        FacesMessage msg = new FacesMessage("Nueva transaccion, Agregado con Never.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombresc() {
        return nombresc;
    }

    public void setNombresc(String nombresc) {
        this.nombresc = nombresc;
    }

    public String getApellidosc() {
        return apellidosc;
    }

    public void setApellidosc(String apellidosc) {
        this.apellidosc = apellidosc;
    }
    
    
    
}
