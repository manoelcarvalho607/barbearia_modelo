/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Controller.Helper.MainScreenHelper;
import View.Agenda;
import View.MainScreen;

/**
 *
 * @author manoel.carvalho
 */
public class MainController {
    
    private final MainScreen view;
    private final MainScreenHelper helper;

    public MainController(MainScreen view) {
        this.view = view;
        this.helper = new MainScreenHelper(view);
    }
    
    public void navegarAgenda(){
       
       helper.navegarAgenda();
       
    }

    public void navegarClientRegister() {
        helper.navegarClient();
    }
    
}
