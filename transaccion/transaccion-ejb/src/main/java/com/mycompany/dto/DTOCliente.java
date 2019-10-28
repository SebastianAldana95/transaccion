/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

/**
 *
 * @author braya
 */
public class DTOCliente {
    
    private int id;
    private String nombresc;
    private String apellidosc;

    public DTOCliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
