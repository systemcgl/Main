/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;

import br.com.systemcgl.entidades.Cliente;
import br.com.systemcgl.repositorio.RepositorioCliente;
import java.sql.ResultSet;
import javax.xml.transform.Result;

/**
 *
 * @author zare
 */
public class ControleCliente {
    RepositorioCliente rc = new RepositorioCliente();
    
    public void cadCliente(Cliente cli) throws ClassNotFoundException{
        rc.svCliente(cli);
        
    }
    
    public ResultSet dadosTabCli() throws ClassNotFoundException{
        return rc.mostraClientes();
    }
}
