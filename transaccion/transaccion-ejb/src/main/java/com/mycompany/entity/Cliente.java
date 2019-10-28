/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author braya
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String nombresc;
    @Column
    private String apellidosc;

    public Cliente() {
    }

    public Cliente(String nombresc, String apellidosc) {
        this.nombresc = nombresc;
        this.apellidosc = apellidosc;
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
