/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;



/**
 *
 * @author visitante
 */
public class Client extends People{
    
   
    protected String endereco;
    protected String cep;
 
    
    public Client(int id, String nome, String endereco, String cep ) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
   
    
    public Client(int id, String nome, String telefone, String email, String cpf, String endereco, String cep) {
         super(id, nome, telefone, email, cpf);
        this.endereco = endereco;
        this.cep = cep;
    }

    

    
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

   @Override
   public String toString(){
       return getNome();
   }

    public void setData_nascimentoForm(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
