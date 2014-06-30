/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;


import br.com.systemcgl.repositorio.RepositorioUsuario;
import br.com.systemcgl.entidades.Usuario;
import br.com.systemcgl.entidades.Administrador;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zare
 */
public class ControleUsuario {
 
   
   
   

//Metodos    
  public boolean salvarUsuario(String nome, String id, String senha) throws ClassNotFoundException {
      
      
      //validar
      if (nome.length() != 0 && id.length() != 0 && senha.length() != 0) {
       
          //Criptografar senha
          
          senha = ControleSenha.criptoSenha(senha);
          
          //Enviar os dados para serem salvos  

          if (nome.equals("Administrador")) {
              Administrador user = new Administrador(nome, id, senha);
              System.out.println("Obj user criado ");
              RepositorioUsuario rpUsr = new RepositorioUsuario();
              rpUsr.svUsr(user);
          } else {
              Usuario user = new Usuario(nome, id, senha);
              System.out.println("Obj user criado ");
              RepositorioUsuario rpUsr = new RepositorioUsuario();
              rpUsr.svUsr(user);
          }
          
          return true;
      
      }else return false;

      
  }
    
  public ResultSet listarUsuarios() throws ClassNotFoundException {
      
      
      RepositorioUsuario ru = new RepositorioUsuario();
      
      
      return ru.getTDados();
      
      
  }
  
  
  public boolean rmUser ( Usuario usr) throws ClassNotFoundException{
      
      
     RepositorioUsuario ru = new RepositorioUsuario();
     
     ru.removeUsrDB(usr.getId());
     
     
     return true; 
      
  }
          
          
          
  
}