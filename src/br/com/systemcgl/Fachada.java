/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl;

import br.com.systemcgl.controle.*;
import br.com.systemcgl.entidades.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author zare
 */
public class Fachada {
    
    private ControleUsuario ctU = new ControleUsuario();
    private ControleSenha ctS = new ControleSenha();
    private ControleSessao ctSs = new ControleSessao();
    private ControleEquipamento ctE = new ControleEquipamento();
    private ControleCliente ctC = new ControleCliente();
    private ControleLocacao ctl = new ControleLocacao();
    private ControleCaixa ctcx;
    public boolean cadUser (String nome, String id, String senha) throws ClassNotFoundException{
      
       boolean n = ctU.salvarUsuario(nome, id, senha);
       
      
        return n;
    }
    
    public ResultSet mostraTUsr () throws ClassNotFoundException, SQLException {
        
     
        return ctU.listarUsuarios();
    } 
    public Usuario mostraDados (){
       Usuario usrDados = new Usuario(); 
       
       return usrDados;
    } 
   
    public boolean cprSenha (Usuario usr) throws ClassNotFoundException{
        
        
        return ControleSenha.comparaSenha(usr);
        
    }
    
    public void altSenha(Usuario usr) throws ClassNotFoundException{
        
        ControleSenha.setSenha(usr);
        
    }
    
    public Sessao login(String id, String senha) throws ClassNotFoundException{
        Usuario usr = new Usuario(id, senha);
        return ctSs.sessaoId(usr);
        
    }
    
    public void logout(){
        
    }
    
    public boolean rmUsr(Usuario usr) throws ClassNotFoundException{
        
        return ctU.rmUser(usr);
    }
    
    public void cadEquip(Equipamento eq) throws ClassNotFoundException{
     ctE.addEquip(eq);
    }
    
    public  ResultSet mostraTEquip () throws ClassNotFoundException, SQLException{
        return ctE.listaEquip();
    }
    public void rmEquip ( Equipamento eq) throws ClassNotFoundException{
        ctE.delEquip(eq);
    }
    
    public void editEquip  (Equipamento eq)throws ClassNotFoundException{
        ctE.alterDadosEquip(eq);
    }
    
    public void cadCli(String nome, String rg, String cpf, String endereco, String cidade, String estado, String telefone) throws ClassNotFoundException{
        
        Cliente cli = new Cliente(nome, rg, cpf, endereco, cidade, estado, telefone);
        ctC.cadCliente(cli);
        
    }
    
    public ResultSet tabClientes() throws ClassNotFoundException{
        return ctC.dadosTabCli();
    }
    
    public Cliente tDadosCliente(int cod) throws SQLException, ClassNotFoundException{
        
        return ctC.dadosCliente(cod);
        
    }
            
    public void editCli(int cod, String nome, String rg, String cpf, String endereco, String cidade, String estado, String tel) throws ClassNotFoundException{
       Cliente cli = new Cliente(cod, nome, rg, cpf, endereco, cidade, estado, tel);
       ctC.altCliente(cli);
    }
    
    public void rmCli(int cod) throws ClassNotFoundException {
        ctC.remCli(cod);
    }
    
    public void locEquips(Date dataLoca, int codCliente, ArrayList<Integer> equipamentos, Date dataDevo, double valor ) throws ClassNotFoundException {
        ctl.cadLocaDB(dataLoca, codCliente, equipamentos, dataDevo, valor);
        ctE.alterDispEquip(equipamentos, false);
        ctC.setPedenciaSim(codCliente);
    }
    public ResultSet mostraTabelaLoca() throws ClassNotFoundException{
        
        return ctl.getDadosTLoca();
    }
    
    public void devEquip(int codLocacao) throws ClassNotFoundException, SQLException {
        int codCliente = ctl.getCodClienteLoca(codLocacao);
        ArrayList codEquip = ctl.finalizaLocacao(codLocacao);
        
        ctC.setPendenciaNao(codCliente);
        ctE.alterDispEquip(codEquip, true);
    }
    
    public void resEquip() {
        
    }
    
    public void recibo (){
        
    }
    
    public void busca () {
        
    }
    
    public void orc (){
        
    }
    
    public void setSaldo(double valor){
        ctcx.getInstance().somaSaldo(valor);
    }
    public Double getSaldo () {
        return ctcx.getInstance().getSaldo();
    }
    
    public  ControleCaixa instaciaCaixa () {
        
        return ctcx.getInstance(); 
    }
    public void abrirCaixa(){
        ctcx.getInstance().setAberto();
        
    }
    public void fecharCaixa () {
        ctcx.getInstance().fecharCaixa();
    }
    public boolean caixaIsOpen(){
        return ctcx.getInstance().isAberto();
    }
    public void backup () {
        
    }
    
    public void rBackup () {
        
    }
    
    public void manual () {
        
    }
    
    public void detalhes () {
        
    } 
}
