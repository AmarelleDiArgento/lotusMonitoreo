/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Detalles;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Detalle;

import java.sql.Connection;
import java.util.List;


public class iDetalles implements Detalles {

    Connection con = null;

    public iDetalles(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(Detalle o) throws Exception {
        return 0;
    }
    @Override
    public int update(Detalle o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Detalle oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Detalle oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Detalle> all() throws Exception {
        return null;
    }
}