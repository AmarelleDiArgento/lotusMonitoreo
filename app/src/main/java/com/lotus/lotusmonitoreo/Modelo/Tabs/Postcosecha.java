/*
 * To change this license header, choose License Headers in Postject Postperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author almoreno
 */public class Postcosecha implements Serializable {

    private long idPost;
    private String codigoPost;
    private String nombrePost;

    private Set<Finca> fincas;

    @Override
    public String toString() {
        return "Postcosecha{" + "idPost=" + idPost + ", codigoPost=" + codigoPost + ", nombrePost=" + nombrePost + ", fincas=" + fincas + '}';
    }

    public Postcosecha() {
    }

    public Postcosecha(String codigoPost, String nombrePost, Set<Finca> fincas) {
        this.codigoPost = codigoPost;
        this.nombrePost = nombrePost;
        this.fincas = fincas;
    }

    public Postcosecha(long idPost, String codigoPost, String nombrePost, Set<Finca> fincas) {
        this.idPost = idPost;
        this.codigoPost = codigoPost;
        this.nombrePost = nombrePost;
        this.fincas = fincas;
    }

    public long getIdPost() {
        return idPost;
    }

    public void setIdPost(long idPost) {
        this.idPost = idPost;
    }

    public String getCodigoPost() {
        return codigoPost;
    }

    public void setCodigoPost(String codigoPost) {
        this.codigoPost = codigoPost;
    }

    public String getNombrePost() {
        return nombrePost;
    }

    public void setNombrePost(String nombrePost) {
        this.nombrePost = nombrePost;
    }

    public Set<Finca> getFincas() {
        return fincas;
    }

    public void setFincas(Set<Finca> fincas) {
        this.fincas = fincas;
    }

}
