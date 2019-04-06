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
public class Producto implements Serializable {

    private long idPro;
    private String codigoPro;
    private String nombrePro;

    private Set<Variedad> variedades;

    @Override
    public String toString() {
        return "Producto{" + "idPro=" + idPro + ", codigoPro=" + codigoPro + ", nombrePro=" + nombrePro + ", variedades=" + variedades + '}';
    }

    public Producto() {
    }

    public Producto(long idPro, String codigoPro, String nombrePro, Set<Variedad> variedades) {
        this.idPro = idPro;
        this.codigoPro = codigoPro;
        this.nombrePro = nombrePro;
        this.variedades = variedades;
    }

    public Producto(String codigoPro, String nombrePro, Set<Variedad> variedades) {
        this.codigoPro = codigoPro;
        this.nombrePro = nombrePro;
        this.variedades = variedades;
    }

    public Set<Variedad> getVariedades() {
        return variedades;
    }

    public void setVariedades(Set<Variedad> variedades) {
        this.variedades = variedades;
    }

    public long getIdPro() {
        return idPro;
    }

    public void setIdPro(long idPro) {
        this.idPro = idPro;
    }

    public String getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(String codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

}
