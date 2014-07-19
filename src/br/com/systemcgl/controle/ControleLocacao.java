/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;
import br.com.systemcgl.entidades.Locacao;
import br.com.systemcgl.repositorio.RepositorioEquipsLoca;
import java.util.ArrayList;
import java.util.Date;
import br.com.systemcgl.repositorio.RepositorioLocacao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zare
 */
public class ControleLocacao {
     
    private RepositorioLocacao rl = new RepositorioLocacao();
    private RepositorioEquipsLoca rel = new RepositorioEquipsLoca();
    private ControleCliente ccl = new ControleCliente();
    private Locacao loca;
     
    public void cadLocaDB(Date dataLoca, int codCliente, ArrayList<Integer> equipsLista, Date dataEnt, double valor) throws ClassNotFoundException{
        int codLoca; 
        
        loca = new Locacao(dataLoca, codCliente, equipsLista, dataEnt, valor, "pendente");
        rl.insertLocacao(loca);
        codLoca = rl.getLastCod();
        rel.addEquipsLoca(codLoca, equipsLista);
        
        
}
 
    public ResultSet getDadosTLoca () throws ClassNotFoundException{
        return rl.selectDadosLocacao();
        
    }
  
    public int getCodClienteLoca(int codLoca) throws ClassNotFoundException{
        int codCliente = rl.getCliCod(codLoca);
        
        return codCliente;
    }
    public ArrayList<Integer> finalizaLocacao(int codLocacao) throws ClassNotFoundException, SQLException{
        rl.alterSituacaoLocacao(codLocacao);
        ArrayList<Integer> al = rel.getEquipsLoca(codLocacao);
        System.err.println("Controle Locacao pegou dados:"+al);
        return rel.getEquipsLoca(codLocacao);
        
    }
}
