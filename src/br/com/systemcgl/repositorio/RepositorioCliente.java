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
    
    public Cliente getCliente(int cod) throws SQLException, ClassNotFoundException {
        conect = ConectaBD.conect();
        String sql = "select * from cliente where codCliente=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1, cod);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.err.println(e);
        }
        Cliente cli = null; 
        while (rs.next()){
        cli = new Cliente(cod, rs.getString("nome"), rs.getString("rg"), rs.getString("cpf"), rs.getString("endereco"), rs.getString("cidade"), rs.getString("estado"), rs.getString("telefone"));
        }
        return cli;
    }
    
    public void alterCliente(int cod, String nome, String rg, String cpf, String endereco, String cidade, String estado, String telefone) throws ClassNotFoundException{
       conect = ConectaBD.conect();
       String sql = "update cliente set nome=?, rg=?, cpf=?, endereco=?, cidade=?, estado=?, telefone=? where codCliente=?";
       
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, rg);
            pst.setString(3, cpf);
            pst.setString(4, endereco);
            pst.setString(5, cidade);
            pst.setString(6, estado);
            pst.setString(7, telefone);
            pst.setInt(8, cod);
            System.out.println("Dados do cliente alterados");
        } catch (SQLException e) {
            System.err.println(e);
            
        }
        
    }
    
    public void delCliente (int cod) throws ClassNotFoundException{
           conect = ConectaBD.conect();
           String sql = "delete from cliente where codCliente=?";
           try {
            pst = conect.prepareStatement(sql);
            pst.setInt(1, cod);
            pst.execute();
            System.out.println("Cliente excluido");
            
        } catch (SQLException e) {
               System.err.println(e);
               
        }
        
    }
}
