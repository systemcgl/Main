/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;

/**
 *
 * @author zare
 */
public class ControleCaixa {
   private static final ControleCaixa INSTANCE = new ControleCaixa();
    private double saldo=0;

    private boolean aberto=false;

    private ControleCaixa(){
        
    }
    
    public static ControleCaixa getInstance(){
        return INSTANCE;
    }
    public void somaSaldo(double valor){
        saldo += valor; 
    }

    public void fecharCaixa(){
        this.aberto = false;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto() {
        this.aberto = true;
    } 
    
}
