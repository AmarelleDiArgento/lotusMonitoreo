/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Parametros;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Parametro;

import java.sql.Connection;
import java.util.List;

public class iParametros implements Parametros {

    Connection con = null;

    public iParametros(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(Parametro o) throws Exception {
        return 0;
    }

    @Override
    public int update(Parametro o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Parametro oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Parametro oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Parametro> all() throws Exception {
        return null;
    }
}