/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.repositorio;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author zare
 */
public class RepositorioEquipamento {
    
    Connection conect;
    PreparedStatement pst;
    ResultSet rs;
    
    public void svEquipDB(String nome, String marca, String modelo, String serial, double valor, String dispo) throws ClassNotFoundException {
        conect = ConectaBD.conect();
        String sql = "insert into equipamento (nome, marca, modelo, serial, valor, disponivel) values (?,?,?,?,?,?)";
        
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, marca);
            pst.setString(3, modelo);
            pst.setString(4, serial);
            pst.setDouble(5, valor);
            pst.setString(6, dispo);
            
            System.out.println("salvando equipamento no banco de dados");
            
            pst.execute();
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        
    }
    
    public ResultSet getTEquip() throws ClassNotFoundException {
        conect = ConectaBD.conect();
        
        String sql = "select codEquipamento as Código,"
                + " nome as Descrição, marca as Marca,"
                + " modelo as Modelo, serial as Serial,"
                + " valor as Valor,"
                + " disponivel as Disponibilidade from equipamento";
        
        try {
            pst = conect.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println("Recebendo equipamentos do BD");
            return rs;
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        
    }
    
        public ResultSet pesquisaEquip(String nome) throws ClassNotFoundException {
        conect = ConectaBD.conect();
        
        String sql = "select codEquipamento as Código,"
                + " nome as Descrição, marca as Marca,"
                + " modelo as Modelo, serial as Serial,"
                + " valor as Valor,"
                + " disponivel as Disponibilidade from equipamento where nome like ?";
        
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, "%"+nome+"%");
            rs = pst.executeQuery();
            System.out.println("Recebendo equipamentos do BD");
            return rs;
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        
    }
    

    public void delEquip(int cod) throws ClassNotFoundException {
        conect = ConectaBD.conect();        
        String sql = "delete from equipamento where codEquipamento=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1, cod);
            pst.execute();
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public void alterEquip(int cod, String nome, String marca, String modelo, String serial, double valor) throws ClassNotFoundException {
        conect = ConectaBD.conect();
        String sql = "update equipamento set nome=? , marca=? , modelo=? , serial=? , valor=?  where codEquipamento=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, marca);
            pst.setString(3, modelo);
            pst.setString(4, serial);
            pst.setDouble(5, valor);
            pst.setInt(6, cod);
            pst.execute();
        } catch (SQLException e) {
            System.err.println(e);
            
        }
        
    }
    
    public void alterDisponibilidadeSIM (ArrayList<Integer> equipsList) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "update equipamento set disponivel= 'Sim' where codEquipamento=? ";
        
        try {
            pst = conect.prepareStatement(sql);
            
            for (int i = 0; i < equipsList.size(); i++) {
                pst.setInt(1, equipsList.get(i));
                pst.addBatch();
            }
            pst.executeBatch();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        
    }
    
    public void alterDisponibilidadeNAO (ArrayList<Integer> equipsList) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "update equipamento set disponivel= 'Não' where codEquipamento=? ";
        
        try {
            pst = conect.prepareStatement(sql);
            
            for (int i = 0; i < equipsList.size(); i++) {
                pst.setInt(1, equipsList.get(i));
                pst.addBatch();
            }
            pst.executeBatch();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        
    }
        
    

}
