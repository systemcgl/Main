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
public class Sessao {
    String id;
    String tipoUsuario;
    boolean ligada;
    public Sessao(Usuario usr, boolean l){
        this.id = usr.getId();
        this.tipoUsuario = usr.getTipo();
        ligada = l;
        
    }
}
