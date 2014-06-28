/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.repositorio;

import java.sql.*;

/**
 *
 * @author zare
 */
public class RepositorioEquipamento {
<<<<<<< HEAD
    Connection conect;
    PreparedStatement pst;
    ResultSet rs;
    
    public void svEquipDB (String nome, String marca, String modelo, String serial, double valor) throws ClassNotFoundException{
        conect = ConectaBD.conect();
        String sql = "insert into equipamento (nome, marca, modelo, serial, valor) values (?,?,?,?,?)";
        
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, marca);
            pst.setString(3, modelo);
            pst.setString(4, serial);
            pst.setDouble(5, valor);
            
            System.out.println("salvando equipamento no banco de dados");
            
            pst.execute();
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        
    }
=======
     Connection conect;
    PreparedStatement pst;
    ResultSet rs;
    
>>>>>>> d89f8b476c662499774dd9a31c57ed63579e221a
    
}
