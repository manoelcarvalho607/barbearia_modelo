/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author visitante
 */
abstract public class People {
    
    
    protected int id;
    protected String nome;
    protected Date data_nascimento;
    protected String telefone;
    protected String email;
    protected String cpf;

    
  
    public People(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

   

    public People(int id, String nome, String telefone, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        /*
        try {
            this.data_nascimento =  new SimpleDateFormat("dd/MM/yyyy").parse(data_nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
*/
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getData_nascimentoForm(){
        
        return new SimpleDateFormat("dd/MM/yyyy").format(data_nascimento);
    }
    
     public String setData_nascimentoForm(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data_nascimento);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
   
}
