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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author zare
 */
public class RepositorioSessao {
    Connection conect ;
    PreparedStatement pst;
    ResultSet rs;
    
    public void sesEstadoDB (String id, String tipo, boolean ligada) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "insert into sessao (idUsuario, tipoUsuario, estado_sessao) values(?,?,?)";
        
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, tipo);
            pst.setBoolean(3, ligada);
            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioSessao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
                
        
        
        
    }
    

    
}
