/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Modelo.Interfaces.Productos;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Producto;

import java.sql.Connection;
import java.util.List;

public class iProductos implements Productos {

    Connection con = null;

    public iProductos(Connection con) {
        this.con = con;
    }
    @Override
    public int insert(Producto o) throws Exception {
        return 0;
    }

    @Override
    public int update(Producto o) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id) throws Exception {
        return 0;
    }

    @Override
    public Producto oneId(Long id) throws Exception {
        return null;
    }

    @Override
    public Producto oneName(String name) throws Exception {
        return null;
    }

    @Override
    public List<Producto> all() throws Exception {
        return null;
    }
}
