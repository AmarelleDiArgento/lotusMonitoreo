/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusmonitoreo.Modelo;

import com.lotus.lotusmonitoreo.Configuracion.Sqlserver.ConexionSQL;
import com.lotus.lotusmonitoreo.Modelo.Interfaces.Causas;
import com.lotus.lotusmonitoreo.Modelo.Tabs.Causa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class iCausas extends ConexionSQL implements Causas {

    Connection cn = null;

    public iCausas() throws Exception{

        this.cn = getConexion();
    }

    @Override
    public int insert(Causa o) throws Exception {
        int c;
        PreparedStatement ps = cn.prepareStatement("INSERT INTO lotusQuality.dbo.Causa (codigoCau, nombreCau) VALUES(?,?);");
        ps.setString(1,o.getCodigoCau());
        ps.setString(2,o.getNombreCau());
        c = ps.executeUpdate();

        closeConexion(cn);
            return c;
    }

    @Override
    public int update(Causa o) throws Exception {
        int c = 0;
        PreparedStatement ps = cn.prepareStatement("UPDATE lotusQuality.dbo.Causa SET codigoCau=?, nombreCau=? WHERE idCau=?;");
        ps.setString(1,o.getCodigoCau());
        ps.setString(2,o.getNombreCau());
        ps.setLong(3,o.getIdCau());
        c = ps.executeUpdate();

        closeConexion(cn);
        return c;

    }

    @Override
    public int delete(Long id) throws Exception {
        int c;
        PreparedStatement ps = cn.prepareStatement("DELETE FROM lotusQuality.dbo.Causa WHERE idCau=?;");
        ps.setLong(1,id);
        c = ps.executeUpdate();

        closeConexion(cn);
        return c;
    }

    private Causa gift(ResultSet rs) throws Exception{
        Causa c = new  Causa();
        c.setIdCau(rs.getLong("idCau"));
        c.setCodigoCau(rs.getString("codigoCau"));
        c.setNombreCau(rs.getString("nombreCau"));
        return c;
    }

    @Override
    public Causa oneId(Long id) throws Exception {
        ResultSet rs;
        Causa c = null;
        PreparedStatement ps = cn.prepareStatement("SELECT idCau, codigoCau, nombreCau FROM lotusQuality.dbo.Causa WHERE = idCau = ?;");
        ps.setLong(1,id);
        rs = ps.executeQuery();
        if(rs!=null){
            c = gift(rs);
        }

        closeConexion(cn,rs);
        return c;
    }

    @Override
    public Causa oneName(String name) throws Exception {
        ResultSet rs;
        Causa c = null;
        PreparedStatement ps = cn.prepareStatement("SELECT idCau, codigoCau, nombreCau FROM lotusQuality.dbo.Causa WHERE = nombreCau = ?;");
        ps.setString(1,name);
        rs = ps.executeQuery();
        if(rs!=null){
            c = gift(rs);
        }

        return c;
    }

    @Override
    public List<Causa> all() throws Exception {
        List<Causa> cl = new ArrayList<>();
        ResultSet rs;
        Causa c = null;
        PreparedStatement ps = cn.prepareStatement("SELECT idCau, codigoCau, nombreCau FROM lotusQuality.dbo.Causa;");
        rs = ps.executeQuery();
        while (rs.next()){
            cl.add(gift(rs));
        }

        closeConexion(cn,rs);
        return cl;
    }
}
