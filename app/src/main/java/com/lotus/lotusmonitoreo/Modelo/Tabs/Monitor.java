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
public class Monitor implements Serializable {

    private long idMon;
    private String codigoMon;
    private String nombreMon;

    private Set<Encabezado> encabezados;

    @Override
    public String toString() {
        return "Monitor{" + "idMon=" + idMon + ", codigoMon=" + codigoMon + ", nombreMon=" + nombreMon + ", encabezados=" + encabezados + '}';
    }

    public Monitor() {
    }

    public Monitor(String codigoMon, String nombreMon, Set<Encabezado> encabezados) {
        this.codigoMon = codigoMon;
        this.nombreMon = nombreMon;
        this.encabezados = encabezados;
    }

    public Monitor(long idMon, String codigoMon, String nombreMon, Set<Encabezado> encabezados) {
        this.idMon = idMon;
        this.codigoMon = codigoMon;
        this.nombreMon = nombreMon;
        this.encabezados = encabezados;
    }

    public long getIdMon() {
        return idMon;
    }

    public void setIdMon(long idMon) {
        this.idMon = idMon;
    }

    public String getCodigoMon() {
        return codigoMon;
    }

    public void setCodigoMon(String codigoMon) {
        this.codigoMon = codigoMon;
    }

    public String getNombreMon() {
        return nombreMon;
    }

    public void setNombreMon(String nombreMon) {
        this.nombreMon = nombreMon;
    }

    public Set<Encabezado> getEncabezados() {
        return encabezados;
    }

    public void setEncabezados(Set<Encabezado> encabezados) {
        this.encabezados = encabezados;
    }

}
