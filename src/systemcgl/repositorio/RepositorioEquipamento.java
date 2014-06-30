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

    public ResultSet getTEquip () throws ClassNotFoundException {
      conect = ConectaBD.conect();
      
      String sql = "select * from equipamento";
      
      try {
          pst = conect.prepareStatement(sql);
          rs = pst.executeQuery();
          System.out.println("Recebendo equipamentos do BD");
          return rs;
          
      }catch(SQLException e){
          System.out.println(e);
          return null;
      }
      
     
      
    }
     public void delEquip (int id) throws ClassNotFoundException{
         conect = ConectaBD.conect(); 
         String sql = "delete from equipamento where id_equipamento=?";
         try {
             pst = conect.prepareStatement(sql);
             pst.setInt(1, id);
             pst.execute();
             
             
         } catch (SQLException e) {
             System.err.println(e);
         }
      }
     
     public void alterEquip (int id, String atrib, String valor) throws ClassNotFoundException{
         conect = ConectaBD.conect();
         String sql = "update equipamento set ?=? where id_equipamento=?";
         try {
             pst = conect.prepareStatement(sql);
             pst.setString(1, atrib);
             pst.setString(2, valor);
             pst.setInt(3, id);
         } catch (SQLException e) {
             System.err.println(e);
             
         }
     
     }
     
          public void alterEquip (int id, String atrib, double valor) throws ClassNotFoundException{
         conect = ConectaBD.conect();
         String sql = "update equipamento set ?=? where id_equipamento=?";
         try {
             pst = conect.prepareStatement(sql);
             pst.setString(1, atrib);
             pst.setDouble(2, valor);
             pst.setInt(3, id);
         } catch (SQLException e) {
             System.err.println(e);
             
         }
         
         
         
     }
=======
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
    
>>>>>>> 8ac6188ede0ec1c4b225ff8d3274bc5a3a73a630
}
