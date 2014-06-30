/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.entidades;



/**
 *
 * @author zare
 */
public class Administrador extends Usuario {
  
     
    
    public Administrador (String nome, String id, String senha){
        super(nome, id, senha);
        this.tipo = "admin";
    }
   
    
    
    
}
