/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zare
 */
public class ConectaBD {
    
    public static Connection conect () throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/systemcgl", "root", "123456");
            System.out.println("Conectado ao banco de dados");
            return con;
            
        }
        catch(SQLException e ) {
            System.out.println("Erro na Conexão com o banco de dados"); 
            return null;
        }
        
    }
    
}
