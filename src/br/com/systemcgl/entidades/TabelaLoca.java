/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.entidades;

import java.sql.ResultSet;

/**
 *
 * @author zare
 */
public class TabelaLoca {
    private int codCliente;
    private ResultSet tabela;

    public TabelaLoca(int codCliente, ResultSet tabela) {
        this.codCliente = codCliente;
        this.tabela = tabela;
    }
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public ResultSet getTabela() {
        return tabela;
    }

    public void setTabela(ResultSet tabela) {
        this.tabela = tabela;
    }
    
    
}
