/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.repositorio;

import br.com.systemcgl.entidades.Locacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Date;
import java.sql.SQLException;
//import java.util.Date;

/**
 *
 * @author zare
 */
public class RepositorioLocacao {
    
    PreparedStatement pst;
    ResultSet rs;
    Connection connect;
    
    public void insertLocacao(Locacao loca) throws ClassNotFoundException{
        connect = ConectaBD.conect();
        String sql = "insert into locacao (dataLocacao, codCliente, dataDevolucao, valor, situacao) values (?,?,?,?,?) ";
        
        try {
            pst = connect.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(loca.getDataLocacao().getTime()));
            pst.setInt(2, loca.getCodCliente());
            pst.setDate(3, new java.sql.Date(loca.getDataEntrega().getTime()));
            pst.setDouble(4, loca.getValor());
            pst.setString(5, loca.getSituacao());
            
            pst.execute();
       
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        
    }
    
    public int getLastCod() throws ClassNotFoundException {
        int codLoca = 0;
        connect = ConectaBD.conect();
        String sql = "select codLocacao from locacao where codLocacao=(select MAX(codLocacao) from locacao)";
        
        try {
            pst = connect.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next() ) {
                codLoca = rs.getInt("codLocacao");
                
            }
        } catch (SQLException e) {
            System.err.println(e);
            
        }
        
        return codLoca;

    }
    
    public ResultSet selectDadosLocacao () throws ClassNotFoundException{
        connect = ConectaBD.conect();
        String sql = "select  "
                
                + "locacao.codLocacao as Código, "
                + "cliente.nome as Cliente, "
                + "locacao.dataLocacao as \"Data locação\", "
                + "locacao.dataDevolucao as \"Data devolução\", "
                + "locacao.valor as Valor, "
                + "locacao.situacao as Situação "
                
                + "from locacao "
                + "inner join cliente on "
                + "cliente.codCliente = locacao.codCliente";
        
        try {
            pst = connect.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }
    
    public void alterSituacaoLocacao( int codLocacao) throws ClassNotFoundException{
        connect = ConectaBD.conect();
        String sql = "update locacao set situacao='finalizada' where codLocacao=?";
        try {
            pst = connect.prepareStatement(sql);
            pst.setInt(1, codLocacao) ;
            pst.executeUpdate();
                    
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
       
    public int getCliCod(int codLocacao) throws ClassNotFoundException{
       int codCliente= 0;
       connect = ConectaBD.conect();
       String sql = "select codCliente from locacao where codlocacao=?";
        try {
            pst = connect.prepareStatement(sql);
            pst.setInt(1, codLocacao);
            rs = pst.executeQuery();
            while(rs.next()){
                codCliente = rs.getInt("codCliente");
            }        
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return codCliente;
    }
}
