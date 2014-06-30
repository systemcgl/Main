/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zaretux
 */
public class RepositorioPendencia {
    Connection conect;
    PreparedStatement pst;
    ResultSet rs;
    
    public void svPendencia (int idu, int idl) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "insert into pedencia (idUsuario, idLocacao) values (?,?)";
        try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1, idu);
            pst.setInt(2, idl);
        } catch (SQLException e) {
            System.err.println(e);
        }
         
    }
    
    public ResultSet mostraPendencia (int idu) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "select * from pendencia where idUsuario=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1, idu);
            rs = pst.executeQuery();
            System.out.println("requisitando pendencia ao BD");
            return rs;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
        
    }
         
    public void delPendencia (int idp) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "delete from pendencia where idPendencia=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1,idp );
            rs = pst.executeQuery();
            System.out.println("pendencia deletada");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
