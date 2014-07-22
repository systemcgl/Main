/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;

import br.com.systemcgl.repositorio.RepositorioCliente;
import br.com.systemcgl.repositorio.RepositorioEquipamento;
import br.com.systemcgl.repositorio.RepositorioLocacao;
import java.sql.ResultSet;

/**
 *
 * @author zare
 */
public class ControleBusca {
    RepositorioCliente rc = new RepositorioCliente();
    RepositorioEquipamento re = new RepositorioEquipamento();
    RepositorioLocacao rl = new RepositorioLocacao();
    ResultSet rs;
    public ResultSet buscarNoBD(String tipo, String termo) throws ClassNotFoundException{
        
        switch (tipo) {
            case "cliente":
                rs = rc.pesquisaClientes(termo);
                break;
            case "equip":
                rs = re.pesquisaEquip(termo);
                break;
            case "loca":
                rs = rl.pesquisaLocacao(termo);
                break;
        }
            
        
        
        return rs;
    }
    
    
    
}
