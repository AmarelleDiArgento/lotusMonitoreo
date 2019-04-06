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
public class PtoCorte implements Serializable {
    private long idpCor;
    private String codigopCor;
    private String nombrepCor;

    private Set<Encabezado> encabezados;

}
