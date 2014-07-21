/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.repositorio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.systemcgl.entidades.Usuario;


/**
 *
 * @author zare
 */
public class RepositorioUsuario  {
    Connection conect;
    PreparedStatement pst;
    ResultSet rs;
    
    public void svUsr(Usuario usr) throws ClassNotFoundException {

        conect = ConectaBD.conect();
        String sql = "Insert into usuario(nome, idUsuario, senha, tipo) values(?, ?, ?, ?) ";

        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, usr.getNome());
            pst.setString(2, usr.getId());
            pst.setString(3, usr.getSenha());
            pst.setString(4, usr.getTipo());

            System.out.println("Persistindo dados de usuário...");

            pst.execute();
        } catch (SQLException erro) {
            System.out.println("Erro ao cadastrar usuário no Banco de Dados ");
        }

    }

    public ResultSet getTDados() throws ClassNotFoundException {
        conect = ConectaBD.conect();
        String sql = "select nome,idUsuario,tipo from usuario";

        try {
            pst = conect.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println("Recebendo lista de usuários do BD... ");

            return rs;

        } catch (SQLException e) {

            System.err.println(e);
            return null;
        }

    }
    
    public String obterSenhaDb (String id) throws ClassNotFoundException {
        conect = ConectaBD.conect();
        String sql = "select senha from usuario where idUsuario=?";
        System.out.println("id recebida = "+id);
        String senha = null;
        try {
            
            pst = conect.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            while(rs.next()){
            senha = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return senha;
        
    }
            
    public void altSenhaDb(String id, String senha) throws ClassNotFoundException {
        conect = ConectaBD.conect();
        String sql = "update usuario set senha=? where idUsuario=?";

        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, senha);
            pst.setString(2, id);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    public void removeUsrDB (String id) throws ClassNotFoundException {
       conect = ConectaBD.conect();
       String sql = "delete from usuario where idUsuario=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

       }
    
    public String selectTipo(String id) throws ClassNotFoundException{
        String tipo = "";
        conect = ConectaBD.conect();
        String sql  = "select tipo from usuario where idUsuario=?";
        try {
            pst = conect.prepareStatement(sql);
            pst.setString(1, id );
            rs = pst.executeQuery();
            while (rs.next()){
                tipo = rs.getString("tipo");
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        return tipo;
    }
}

