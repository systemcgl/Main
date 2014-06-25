/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl;

import java.sql.ResultSet;
import java.sql.SQLException;
import systemcgl.controle.*;
import systemcgl.entidades.*;

/**
 *
 * @author zare
 */
public class Fachada {
    private Usuario usr = new Usuario();
    private ControleUsuario ctU = new ControleUsuario();
    private ControleSenha ctS = new ControleSenha();

 
    
    public boolean cadUser (String nome, String id, String senha) throws ClassNotFoundException{
      
       boolean n = ctU.salvarUsuario(nome, id, senha);
       
      
        return n;
    }
    
    public ResultSet mostraTUsr () throws ClassNotFoundException, SQLException {
        
     
        return ctU.listarUsuarios();
    } 
    public Usuario mostraDados (){
       Usuario usrDados = new Usuario(); 
       
       return usrDados;
    } 
   
    public boolean cprSenha (Usuario usr) throws ClassNotFoundException{
        
        
        return ControleSenha.comparaSenha(usr);
        
    }
    
    public void altSenha(Usuario usr) throws ClassNotFoundException{
        
        ControleSenha.setSenha(usr);
        
    }
    
    public void login(){
        
    }
    
    public void logout(){
        
    }
    
    public void rmUser(){
        
    }
    
    public void cadEquip(){
        
    }
    
    public void rmEquip (){
        
    }
    
    public void cadCli(){
        
    }
    
    public void editCli(){
        
    }
    
    public void rmCli() {
        
    }
    
    public void locEquip() {
        
    }
    
    public void devEquip() {
        
    }
    
    public void resEquip() {
        
    }
    
    public void recibo (){
        
    }
    
    public void busca () {
        
    }
    
    public void orc (){
        
    }
    
    public void saldo () {
        
    }
    
    public void aCaixa () {
        
    }
    
    public void fCaixa () {
        
    }
    
    public void backup () {
        
    }
    
    public void rBackup () {
        
    }
    
    public void manual () {
        
    }
    
    public void detalhes () {
        
    } 
}
