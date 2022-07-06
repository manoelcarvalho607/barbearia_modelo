/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectionDB.ConnectionFactory;
import Model.Schedule;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Date.parse;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class ScheduleDAO {

       public void create(Schedule p) {
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome,service,valor,data_c,obs) VALUES (?,?,?,?,?)");
            stmt.setString (1,p.getNome().toString());
            stmt.setString(2,p.getService().toString());
            stmt.setInt(3, (int) p.getValor());
            stmt.setString(4,p.getData_c().toString());
           // stmt.setString(5, p.getDataFormatada());
           // stmt.setDate(5, (Date) p.getData());
           // stmt.setInt(6,p.getQtd());
            stmt.setString(5,p.getObs());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso no BD!");
            
        }catch (SQLException ex){
           // Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar no BD: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
    }
    
    /*
    public List<Schedule> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Schedule> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
           rs = stmt.executeQuery();
            
           while (rs.next()){
               
               Schedule cliente = new Schedule();
               
               cliente.setId(rs.getInt("id"));
               cliente.setNome(rs.getString("nome"));
               cliente.setService(rs.getString("service"));
               cliente.setValor(rs.getInt("valor"));
               cliente.setData_c(rs.getString("data_c"));
               cliente.setObs(rs.getString("obs"));
               
               clientes.add(cliente);
               
           }
           
            
        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao buscar dados do BD: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
    }
    
    */
       
    /*
      public void upDate(Schedule p) {
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET  nome = ? ,service = ?, valor = ? ,date_c = ?,obs = ? WHERE ID = ? ");
           
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getService());
            stmt.setInt(3,p.getValor());
            stmt.setString(4,p.getData_c());
           // stmt.setString(5, p.getDataFormatada());
           // stmt.setDate(5, (Date) p.getData());
           // stmt.setInt(6,p.getQtd());
            stmt.setString(5,p.getObs());
            stmt.setInt(6,p.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso no BD!");
            
        }catch (SQLException ex){
           // Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar no BD: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
    }
      */
       
       /*
       public void delete(Schedule p) {
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        
        
        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE ID = ?");
           
          
            stmt.setInt(1,p.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso no BD!");
            
        }catch (SQLException ex){
           // Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao excluir no BD: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
    }
       */
       /*
        public List<Schedule> readForDesc(String desc){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Schedule> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
           rs = stmt.executeQuery();
            
           while (rs.next()){
               
               Schedule cliente = new Schedule();
               
               cliente.setId(rs.getInt("id"));
               cliente.setNome(rs.getString("nome"));
               cliente.setService(rs.getString("service"));
               cliente.setValor(rs.getInt("valor"));
               cliente.setData_c(rs.getString("data_c"));
               cliente.setObs(rs.getString("obs"));
               
               clientes.add(cliente);
               
           }
           
            
        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao buscar dados do BD: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
    }
 

    */
}
