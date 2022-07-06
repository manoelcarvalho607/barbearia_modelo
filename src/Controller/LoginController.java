/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import DAO.UserDAO;
import Model.User;
import View.Login;
import View.MainScreen;
import javax.swing.JOptionPane;

/**
 *
 * @author manoel.carvalho
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
     public void enterSystem(){
        //pegar usuario da view
        boolean authentication = helper.authentication();
        
        if(authentication){
        
             User user = helper.getModel();
         
        //pesquisar no banco 
            helper.pesquisarDB(user);
       
        
        }
        
       
       
       
        //se o usuario da view tiver o mesmo login e senha do usuario vindo do banco , vai se redirecionando para tela MainScreen 
        ///se de erro vaia mostrar uma mensagem de erro
    }
    
    
    
}
