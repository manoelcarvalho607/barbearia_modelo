/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ConnectionDB.ConnectionFactory;
import Controller.Helper.ClientHelper;
import Model.Client;
import Model.Cliente;
import View.ClientRegister;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class ClientController {

    private final ClientRegister view;
    private final ClientHelper helper;
    
    

    public ClientController(ClientRegister view) {
        this.view = view;
        this.helper = new ClientHelper(view);
    }

  
   
     public void cadastrarClient(){
         // autenticação para preenchimento de campos obrigatórios
         
          boolean authentication = helper.authentication();
          
         // cadastrando novo cliente
         
         
         if(authentication) {
             
           //  helper.cadastroClienteDB();
             
            Cliente cliente = helper.obterModelo();
            helper.registrationClientDB(cliente);  
           // helper.modelTable();
            helper.readTable();
       
            helper.limparTela();
             
         }
     }

    public void menuHome() {
       helper.telaMenuHome();
    }

    public void upDate() {
        boolean authentication = helper.authentication();
        
        if(authentication){
        //    Cliente cliente = helper.tableModel();
            // Cliente cliente = helper.obterModelo();
         //    helper.upDateClientDB(cliente);
             helper.readTable();
             helper.limparTela();
        }
        
   
       
    }

    
    public void delete() {
        
        helper.deleteClient();
                                             
    
    }
    
    public void select() {
        helper.selectHelper();
    }
    
    public void limpar(){
        helper.limparTela();
    }
    
}
