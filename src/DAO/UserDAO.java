/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectionDB.ConnectionFactory;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class UserDAO {
    
    
    
     public boolean checkLogin(String nome, String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome = ? and senha = ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            
            
            
           rs = stmt.executeQuery();
            
           /*
           while (rs.next()){
               
               Usuario usuario = new Usuario();
               
               usuario.setId(rs.getInt("ID"));
               usuario.setLogin(rs.getString("Login"));
               usuario.setSenha(rs.getString("Senha"));
              }
           
            */
           
           if (rs.next()){
               
               
               check = true;
            
           }
           
           
           
           
        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao buscar dados do BD: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
    
}
