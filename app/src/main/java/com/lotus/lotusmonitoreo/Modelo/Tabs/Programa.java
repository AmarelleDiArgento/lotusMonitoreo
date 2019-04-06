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
public class Programa implements Serializable {

    private long idProg;
    int anoProg;
    int SemanaProg;

    Finca finca;

    Variedad variedad;

    String BloqueProg;
    int ProyeccionProg;
    int CantidadProg;
    int ProduccionProg;
    int ProductividadProg;

    private Set<Novedad> novedades;

    private Set<Encabezado> encabezados;

    @Override
    public String toString() {
        return "Programa{" +
                "idProg=" + idProg +
                ", anoProg=" + anoProg +
                ", SemanaProg=" + SemanaProg +
                ", finca=" + finca +
                ", variedad=" + variedad +
                ", BloqueProg='" + BloqueProg + '\'' +
                ", ProyeccionProg=" + ProyeccionProg +
                ", CantidadProg=" + CantidadProg +
                ", ProduccionProg=" + ProduccionProg +
                ", ProductividadProg=" + ProductividadProg +
                ", novedades=" + novedades +
                ", encabezados=" + encabezados +
                '}';
    }

    public Programa() {
    }

    public Programa(int anoProg, int semanaProg, Finca finca, Variedad variedad, String bloqueProg, int proyeccionProg, int cantidadProg, int produccionProg, int productividadProg, Set<Novedad> novedades, Set<Encabezado> encabezados) {
        this.anoProg = anoProg;
        SemanaProg = semanaProg;
        this.finca = finca;
        this.variedad = variedad;
        BloqueProg = bloqueProg;
        ProyeccionProg = proyeccionProg;
        CantidadProg = cantidadProg;
        ProduccionProg = produccionProg;
        ProductividadProg = productividadProg;
        this.novedades = novedades;
        this.encabezados = encabezados;
    }

    public Programa(long idProg, int anoProg, int semanaProg, Finca finca, Variedad variedad, String bloqueProg, int proyeccionProg, int cantidadProg, int produccionProg, int productividadProg, Set<Novedad> novedades, Set<Encabezado> encabezados) {
        this.idProg = idProg;
        this.anoProg = anoProg;
        SemanaProg = semanaProg;
        this.finca = finca;
        this.variedad = variedad;
        BloqueProg = bloqueProg;
        ProyeccionProg = proyeccionProg;
        CantidadProg = cantidadProg;
        ProduccionProg = produccionProg;
        ProductividadProg = productividadProg;
        this.novedades = novedades;
        this.encabezados = encabezados;
    }

    public long getIdProg() {
        return idProg;
    }

    public void setIdProg(long idProg) {
        this.idProg = idProg;
    }

    public int getAnoProg() {
        return anoProg;
    }

    public void setAnoProg(int anoProg) {
        this.anoProg = anoProg;
    }

    public int getSemanaProg() {
        return SemanaProg;
    }

    public void setSemanaProg(int semanaProg) {
        SemanaProg = semanaProg;
    }

    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

    public Variedad getVariedad() {
        return variedad;
    }

    public void setVariedad(Variedad variedad) {
        this.variedad = variedad;
    }

    public String getBloqueProg() {
        return BloqueProg;
    }

    public void setBloqueProg(String bloqueProg) {
        BloqueProg = bloqueProg;
    }

    public int getProyeccionProg() {
        return ProyeccionProg;
    }

    public void setProyeccionProg(int proyeccionProg) {
        ProyeccionProg = proyeccionProg;
    }

    public int getCantidadProg() {
        return CantidadProg;
    }

    public void setCantidadProg(int cantidadProg) {
        CantidadProg = cantidadProg;
    }

    public int getProduccionProg() {
        return ProduccionProg;
    }

    public void setProduccionProg(int produccionProg) {
        ProduccionProg = produccionProg;
    }

    public int getProductividadProg() {
        return ProductividadProg;
    }

    public void setProductividadProg(int productividadProg) {
        ProductividadProg = productividadProg;
    }

    public Set<Novedad> getNovedades() {
        return novedades;
    }

    public void setNovedades(Set<Novedad> novedades) {
        this.novedades = novedades;
    }

    public Set<Encabezado> getEncabezados() {
        return encabezados;
    }

    public void setEncabezados(Set<Encabezado> encabezados) {
        this.encabezados = encabezados;
    }
}
