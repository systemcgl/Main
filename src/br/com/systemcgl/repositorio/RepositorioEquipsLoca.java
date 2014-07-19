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
import java.util.ArrayList;

/**
 *
 * @author zare
 */
public class RepositorioEquipsLoca {
    PreparedStatement pst;
    ResultSet rs;
    Connection connect;
 
    public void addEquipsLoca(int codLoca ,ArrayList<Integer> equipsList) throws ClassNotFoundException{
     
        connect = ConectaBD.conect();
        String sql = "insert into equipsLocacao (codLocacao, codEquipamento) values (?, ?)";
        
        try {
            pst = connect.prepareStatement(sql);
            pst.setInt(1, codLoca);
            for (int i = 0; i < equipsList.size(); i++) {
                pst.setInt(2, equipsList.get(i));
                pst.addBatch();
            }
            pst.executeBatch();
        } catch (SQLException e) {
            System.err.println(e);
        }
            
        
    }
    
    public ArrayList<Integer> getEquipsLoca(int codLoca) throws SQLException, ClassNotFoundException {
        ArrayList<Integer> equipsList = new ArrayList<>();
        connect = ConectaBD.conect();
        String sql = "select * from equipsLocacao where codLocacao=?";
        try {
            pst = connect.prepareStatement(sql);
            pst.setInt(1, codLoca);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.err.println(e);
        }

        while (rs.next()) {
            
                equipsList.add(rs.getInt("codEquipamento"));
            

        }
        return equipsList;
    }
}
