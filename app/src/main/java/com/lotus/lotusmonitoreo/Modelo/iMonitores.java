/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Monitores;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Monitor;

import java.sql.Connection;
import java.util.List;

public class iMonitores implements Monitores {

    Connection con = null;

    public iMonitores(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(Monitor o) throws Exception {
        return 0;
    }

    @Override
    public int update(Monitor o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Monitor oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Monitor oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Monitor> all() throws Exception {
        return null;
    }
}