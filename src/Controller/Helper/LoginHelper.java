/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import DAO.UserDAO;
import Model.User;
import View.Login;
import View.MainScreen;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class LoginHelper implements IHelper {
    
    private final Login view;
    
    public LoginHelper(Login view) {
        this.view = view;
    }
    
     public boolean authentication() {
         boolean check = false;
         
        if("".equals(view.getTxtUser().getText()) || "".equals(new String(view.getTxtPassword().getPassword()))){
             JOptionPane.showMessageDialog(null,"Digite o nome do usuario e senha!");
               
             
        }else{
            check = true;
        }
        
      return check;
    }
    
    public User getModel() {
        String name = view.getTxtUser().getText();
        String password = view.getTxtPassword().getText();
        User model = new User(0,name,password);
        
        return model;
    }
    
    public void setarModel(User model) {
        String name = model.getNome();
        String password = model.getSenha();
        
        view.getTxtUser().setText(name);
        view.getTxtPassword().setText(password);
    }
    
    

    public void pesquisarDB(User user) {
          UserDAO  dao = new UserDAO();
        
       if(dao.checkLogin(/*view.getTxtUser().getText()*/ user.getNome(), user.getSenha()/*new String (view.getTxtPassword().getPassword())*/)) {
           new MainScreen().setVisible(true);
          this.view.dispose(); //fechar tela atual 
       }else{
           JOptionPane.showMessageDialog(null,"Senha incorreta!");
       }
       
    }
    
    public void screenClean() {
        view.getTxtUser().setText("");
        view.getTxtPassword().setText("");
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    

   
    
}
