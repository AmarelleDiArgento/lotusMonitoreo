/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.PtoCortes;
import com.lotus.lotusmonitoreo.Modelo.Tabs.PtoCorte;

import java.sql.Connection;
import java.util.List;

public class iPtoCortes implements PtoCortes {

    Connection con = null;

    public iPtoCortes(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(PtoCorte o) throws Exception {
        return 0;
    }

    @Override
    public int update(PtoCorte o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public PtoCorte oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public PtoCorte oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<PtoCorte> all() throws Exception {
        return null;
    }
}
