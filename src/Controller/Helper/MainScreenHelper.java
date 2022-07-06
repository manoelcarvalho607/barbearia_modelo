/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import View.Agenda;
import View.ClientRegister;
import View.MainScreen;

/**
 *
 * @author visitante
 */
public class MainScreenHelper implements IHelper{

    private final MainScreen view;
    
    
    
    
     public MainScreenHelper (MainScreen view){
        this.view = view;
        
    }
    
    
    
    
    
    
    
    
    

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void navegarClient() {
       ClientRegister clientRegister = new ClientRegister();
       clientRegister.setVisible(true);
        view.dispose();
    }

    public void navegarAgenda() {
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
         view.dispose();
    }
    
    
    
    
}
