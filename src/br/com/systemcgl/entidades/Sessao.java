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

    private String id;
    private boolean adm;
    private boolean auth;
    public Sessao() {

    }

    public Sessao(String id, boolean adm, boolean auth) {
        this.id = id;
        this.adm = adm;
        this.auth = auth;
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        
        this.adm = adm;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }
}
