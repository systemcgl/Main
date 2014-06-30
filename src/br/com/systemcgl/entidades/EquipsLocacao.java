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
public class EquipsLocacao  {
    


    
    private Equipamento eq1;
    private Equipamento eq2;
    private Equipamento eq3;
    private Equipamento eq4;
    private Equipamento eq5;
    
     public EquipsLocacao(Equipamento eq1) {
        this.eq1 = eq1;
    }
    public EquipsLocacao(Equipamento eq1, Equipamento eq2) {
        this.eq1 = eq1;
        this.eq2 = eq2;
    }

    public EquipsLocacao(Equipamento eq1, Equipamento eq2, Equipamento eq3) {
        this.eq1 = eq1;
        this.eq2 = eq2;
        this.eq3 = eq3;
    }

    public EquipsLocacao(Equipamento eq1, Equipamento eq2, Equipamento eq3, Equipamento eq4) {
        this.eq1 = eq1;
        this.eq2 = eq2;
        this.eq3 = eq3;
        this.eq4 = eq4;
    }

    public EquipsLocacao(Equipamento eq1, Equipamento eq2, Equipamento eq3, Equipamento eq4, Equipamento eq5) {
        this.eq1 = eq1;
        this.eq2 = eq2;
        this.eq3 = eq3;
        this.eq4 = eq4;
        this.eq5 = eq5;
    }

    public Equipamento getEq5() {
        return eq5;
    }

    public void setEq5(Equipamento eq5) {
        this.eq5 = eq5;
    }

    public Equipamento getEq1() {
        return eq1;
    }

    public void setEq1(Equipamento eq1) {
        this.eq1 = eq1;
    }

    public Equipamento getEq2() {
        return eq2;
    }

    public void setEq2(Equipamento eq2) {
        this.eq2 = eq2;
    }

    public Equipamento getEq3() {
        return eq3;
    }

    public void setEq3(Equipamento eq3) {
        this.eq3 = eq3;
    }

    public Equipamento getEq4() {
        return eq4;
    }

    public void setEq4(Equipamento eq4) {
        this.eq4 = eq4;
    }
    

}
