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
 * @author zare
 */
public class RepositorioCliente {
    
    Connection conect;
    PreparedStatement pst;
    ResultSet rs;
    
    public void svCliente (String nome, String rg, String cpf, String endereco, String cidade, String telefone) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = " insert into cliente (nome, rg, cpf, endereco, cidade, telefone) values(?,?,?,?,?,?)" ;
        
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, rg);
            pst.setString(3, cpf);
            pst.setString(4, endereco);
            pst.setString(5, cidade);
            pst.setString(6, telefone);
            pst.execute();
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        
        
    }
    
    public ResultSet mostraClientes() throws ClassNotFoundException {
       conect = ConectaBD.conect();
       String sql = "select * from cliente";
       
        try {
            pst = conect.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println("requisitando dados de usuarios");
            return rs;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
 
        
    }
    
    public void alterCliente(int id, String atrib, String valor ) throws ClassNotFoundException{
       conect = ConectaBD.conect();
       String sql = "update cliente set ?=? where id_cliente=?";
       
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1,atrib );
            pst.setString(2, valor);
            pst.setInt(3, id);
            System.out.println("Dados do cliente alterados");
        } catch (SQLException e) {
            System.err.println(e);
            
        }
        
    }
    
    public void delCliente (int id) throws ClassNotFoundException{
           conect = ConectaBD.conect();
           String sql = "delete from cliente where id=?";
           try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("Cliente excluido");
            
        } catch (SQLException e) {
               System.err.println(e);
               
        }
        
    }
}
