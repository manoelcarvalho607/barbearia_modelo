/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import static java.util.Date.parse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author visitante
 */
public class Schedule {
    
    
    private int id;
    private Client nome;
    private Service service;
    private float valor;
    private Date data_c;
    private String obs;

    public Schedule(int id, Client nome, Service service, float valor, String data_c) {
        this.id = id;
        this.nome = nome;
        this.service = service;
        this.valor = valor;
        try {
            this.data_c = new SimpleDateFormat("dd/WW/yyyy HH:mm").parse(data_c);
        } catch (ParseException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Schedule(int id, Client client, Service service, float valor, String date,String obs) {
        this(id,client,service,valor,date);
        this.obs = obs;
    
    }

    public Schedule() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getNome() {
        return nome;
    }

    public void setNome(Client nome) {
        this.nome = nome;
    }

    public Date getData_c() {
        return data_c;
    }

    public void setData_c(Date data_c) {
        this.data_c = data_c;
    }

    

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

   
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data_c);
    }

     public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data_c);
    }
    
    
    
    

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void insert(Schedule schedule) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
