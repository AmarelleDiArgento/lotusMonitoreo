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
public class Tipo implements Serializable {
    private long idTip;
    private String codigoTip;
    private String nombreTip;
    private Set<Parametro> parametros = new HashSet<>();

    @Override
    public String toString() {
        return "Tipo{" + "idTip=" + idTip + ", codigoTip=" + codigoTip + ", nombreTip=" + nombreTip + ", parametros=" + parametros + '}';
    }

    public Tipo() {
    }

    public Tipo(String codigoTip, String nombreTip) {
        this.codigoTip = codigoTip;
        this.nombreTip = nombreTip;
    }

    public Tipo(long idTip, String codigoTip, String nombreTip) {
        this.idTip = idTip;
        this.codigoTip = codigoTip;
        this.nombreTip = nombreTip;
    }

    public Set<Parametro> getProjects() {
        return parametros;
    }

    public void setProjects(Set<Parametro> parametros) {
        this.parametros = parametros;
    }

    public long getIdTip() {
        return idTip;
    }

    public void setIdTip(long idTip) {
        this.idTip = idTip;
    }

    public String getCodigoTip() {
        return codigoTip;
    }

    public void setCodigoTip(String codigoTip) {
        this.codigoTip = codigoTip;
    }

    public String getNombreTip() {
        return nombreTip;
    }

    public void setNombreTip(String nombreTip) {
        this.nombreTip = nombreTip;
    }

}
