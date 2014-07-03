/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.repositorio;

import br.com.systemcgl.entidades.Cliente;
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
    
    public void svCliente (Cliente cli) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "insert into cliente (nome, rg, cpf, endereco, cidade, estado, telefone, pendencias) values(?,?,?,?,?,?,?,?)" ;
        
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, cli.getNome());
            pst.setString(2, cli.getRg());
            pst.setString(3, cli.getCpf());
            pst.setString(4, cli.getEndereco());
            pst.setString(5, cli.getCidade());
            pst.setString(6, cli.getEstado());
            pst.setString(7, cli.getTelefone());
            pst.setString(8, cli.getPendencias());
            pst.execute();
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        
        
    }
    
    public ResultSet mostraClientes() throws ClassNotFoundException {
       conect = ConectaBD.conect();
       String sql = "select codCliente as Código, nome as Nome, pendencias as Pendências from cliente";
       
        try {
            pst = conect.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println("requisitando dados de clientes...");
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
