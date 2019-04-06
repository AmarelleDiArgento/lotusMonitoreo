/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo.Tabs;

import java.io.Serializable;

/**
 *
 * @author almoreno
 */
public class Novedad implements Serializable {
    private long idNov;
    private String tituloNov;
    private String descripcionNov;

    private Programa programa;

    @Override
    public String toString() {
        return "Novedad{" + "idNov=" + idNov + ", tituloNov=" + tituloNov + ", descripcionNov=" + descripcionNov + ", programa=" + programa + '}';
    }

    public Novedad() {
    }

    public Novedad(String tituloNov, String descripcionNov, Programa programa) {
        this.tituloNov = tituloNov;
        this.descripcionNov = descripcionNov;
        this.programa = programa;
    }

    public Novedad(long idNov, String tituloNov, String descripcionNov, Programa programa) {
        this.idNov = idNov;
        this.tituloNov = tituloNov;
        this.descripcionNov = descripcionNov;
        this.programa = programa;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public long getIdNov() {
        return idNov;
    }

    public void setIdNov(long idNov) {
        this.idNov = idNov;
    }

    public String getTituloNov() {
        return tituloNov;
    }

    public void setTituloNov(String tituloNov) {
        this.tituloNov = tituloNov;
    }

    public String getDescripcionNov() {
        return descripcionNov;
    }

    public void setDescripcionNov(String descripcionNov) {
        this.descripcionNov = descripcionNov;
    }

}
