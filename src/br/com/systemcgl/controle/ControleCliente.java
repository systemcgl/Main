/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;

import br.com.systemcgl.entidades.Cliente;
import br.com.systemcgl.repositorio.RepositorioCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.transform.Result;

/**
 *
 * @author zare
 */
public class ControleCliente {
    RepositorioCliente rc = new RepositorioCliente();
    
    public void cadCliente(Cliente cli) throws ClassNotFoundException{
        cli.setPendencias("Não");
        rc.svCliente(cli);
        
    }
    
    public ResultSet dadosTabCli() throws ClassNotFoundException{
        return rc.mostraClientes();
    }
    public Cliente dadosCliente(int cod) throws SQLException, ClassNotFoundException{
        
        return rc.getCliente(cod);
    }
   
    public void altCliente (Cliente cli) throws ClassNotFoundException{
        
        rc.alterCliente(cli.getCod(), cli.getNome(),cli.getRg(), cli.getCpf(), cli.getEndereco(), cli.getCidade(), cli.getEstado(), cli.getTelefone());
        
    }
    
    
    public void remCli (int cod) throws ClassNotFoundException{
        
        rc.delCliente(cod);
        
    }
}
