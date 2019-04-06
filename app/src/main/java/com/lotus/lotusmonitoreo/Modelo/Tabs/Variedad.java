/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author almoreno
 */
public class Variedad implements Serializable {
    private long idVar;
    private String codigoVar;
    private String nombreVar;

    private Producto producto;

    private Set<Programa> programas;

    @Override
    public String toString() {
        return "Variedad{" + "idVar=" + idVar + ", codigoVar=" + codigoVar + ", nombreVar=" + nombreVar + ", producto=" + producto + '}';
    }

    public Variedad() {
    }

    public Variedad(String codigoVar, String nombreVar, Producto producto) {
        this.codigoVar = codigoVar;
        this.nombreVar = nombreVar;
        this.producto = producto;
    }

    public Variedad(long idVar, String codigoVar, String nombreVar, Producto producto) {
        this.idVar = idVar;
        this.codigoVar = codigoVar;
        this.nombreVar = nombreVar;
        this.producto = producto;
    }

    public long getIdVar() {
        return idVar;
    }

    public void setIdVar(long idVar) {
        this.idVar = idVar;
    }

    public String getCodigoVar() {
        return codigoVar;
    }

    public void setCodigoVar(String codigoVar) {
        this.codigoVar = codigoVar;
    }

    public String getNombreVar() {
        return nombreVar;
    }

    public void setNombreVar(String nombreVar) {
        this.nombreVar = nombreVar;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
