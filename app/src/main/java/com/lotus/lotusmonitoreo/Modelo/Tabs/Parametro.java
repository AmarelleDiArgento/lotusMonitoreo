/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author almoreno
 */
public class Parametro implements Serializable {

    private long idPar;
    private String codigoPar;
    private String nombrePar;
    private String tipoDatoPar;
    private Set<Tipo> tipos = new HashSet<>();

    public Parametro() {
    }

    public Parametro(String codigoPar, String nombrePar, String tipoDatoPar, Set<Tipo> tipos) {
        this.codigoPar = codigoPar;
        this.nombrePar = nombrePar;
        this.tipoDatoPar = tipoDatoPar;
        this.tipos = tipos;
    }

    public Parametro(long idPar, String codigoPar, String nombrePar, String tipoDatoPar, Set<Tipo> tipos) {
        this.idPar = idPar;
        this.codigoPar = codigoPar;
        this.nombrePar = nombrePar;
        this.tipoDatoPar = tipoDatoPar;
        this.tipos = tipos;
    }

    public long getIdPar() {
        return idPar;
    }

    public void setIdPar(long idPar) {
        this.idPar = idPar;
    }

    public String getCodigoPar() {
        return codigoPar;
    }

    public void setCodigoPar(String codigoPar) {
        this.codigoPar = codigoPar;
    }

    public String getNombrePar() {
        return nombrePar;
    }

    public void setNombrePar(String nombrePar) {
        this.nombrePar = nombrePar;
    }

    public String getTipoDatoPar() {
        return tipoDatoPar;
    }

    public void setTipoDatoPar(String tipoDatoPar) {
        this.tipoDatoPar = tipoDatoPar;
    }

    public Set<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(Set<Tipo> tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return "Parametro{" +
                "idPar=" + idPar +
                ", codigoPar='" + codigoPar + '\'' +
                ", nombrePar='" + nombrePar + '\'' +
                ", tipoDatoPar='" + tipoDatoPar + '\'' +
                ", tipos=" + tipos +
                '}';
    }
}
