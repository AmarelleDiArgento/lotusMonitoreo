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
public class Finca implements Serializable {

    private long idFin;
    private String codigoFin;
    private String nombreFin;

    private Postcosecha postcosecha;

    private Set<Programa> programadas;

    @Override
    public String toString() {
        return "Finca{" + "idFin=" + idFin + ", codigoFin=" + codigoFin + ", nombreFin=" + nombreFin + ", postcosecha=" + postcosecha + ", programadas=" + programadas + '}';
    }

    public Finca() {
    }

    public Finca(long idFin, String codigoFin, String nombreFin, Postcosecha postcosecha, Set<Programa> programadas) {
        this.idFin = idFin;
        this.codigoFin = codigoFin;
        this.nombreFin = nombreFin;
        this.postcosecha = postcosecha;
        this.programadas = programadas;
    }

    public Finca(String codigoFin, String nombreFin, Postcosecha postcosecha, Set<Programa> programadas) {
        this.codigoFin = codigoFin;
        this.nombreFin = nombreFin;
        this.postcosecha = postcosecha;
        this.programadas = programadas;
    }

    public long getIdFin() {
        return idFin;
    }

    public void setIdFin(long idFin) {
        this.idFin = idFin;
    }

    public String getCodigoFin() {
        return codigoFin;
    }

    public void setCodigoFin(String codigoFin) {
        this.codigoFin = codigoFin;
    }

    public String getNombreFin() {
        return nombreFin;
    }

    public void setNombreFin(String nombreFin) {
        this.nombreFin = nombreFin;
    }

    public Postcosecha getPostcosecha() {
        return postcosecha;
    }

    public void setPostcosecha(Postcosecha postcosecha) {
        this.postcosecha = postcosecha;
    }

    public Set<Programa> getProgramadas() {
        return programadas;
    }

    public void setProgramadas(Set<Programa> programadas) {
        this.programadas = programadas;
    }

}
