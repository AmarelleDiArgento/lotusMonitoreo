/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Variedades;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Variedad;

import java.sql.Connection;
import java.util.List;

public class iVariedades implements Variedades {

    Connection con = null;

    public iVariedades(Connection con) {
        this.con = con;
    }

    @Override
    public int insert(Variedad o) throws Exception {
        return 0;
    }

    @Override
    public int update(Variedad o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Variedad oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Variedad oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Variedad> all() throws Exception {
        return null;
    }
}
