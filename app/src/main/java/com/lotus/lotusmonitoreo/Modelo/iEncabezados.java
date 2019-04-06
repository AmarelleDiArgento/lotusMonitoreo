/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Encabezados;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Encabezado;

import java.sql.Connection;
import java.util.List;

public class iEncabezados implements Encabezados {

    Connection con = null;

    public iEncabezados(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(Encabezado o) throws Exception {
        return 0;
    }

    @Override
    public int update(Encabezado o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Encabezado oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Encabezado oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Encabezado> all() throws Exception {
        return null;
    }
}