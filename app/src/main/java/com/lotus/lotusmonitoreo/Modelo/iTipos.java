/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Tipos;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Tipo;

import java.sql.Connection;
import java.util.List;

public class iTipos implements Tipos {

    Connection con = null;

    public iTipos(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(Tipo o) throws Exception {
        return 0;
    }

    @Override
    public int update(Tipo o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Tipo oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Tipo oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Tipo> all() throws Exception {
        return null;
    }
}