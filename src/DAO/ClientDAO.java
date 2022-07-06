/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectionDB.ConnectionFactory;
import Model.Client;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class ClientDAO {

    /*
    private final Cliente view;
    
    
    public ClientDAO(Cliente view){
         this.view = view;
    }
     */
    public void create(Cliente cliente) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome,telefone,email,cpf,endereco,cep) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, cliente.getNome());
            // stmt.setDate(2, (java.sql.Date) client.getData_nascimento());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getCpf());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getCep());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso no BD!");

        } catch (SQLException ex) {
            // Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar no BD: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Cliente> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Integer id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String cep = rs.getString("cep");

                Cliente client = new Cliente(id, nome, telefone, email, cpf, endereco, cep);

                clientes.add(client);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados do BD: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;
    }

    public void upDate(Cliente p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET  nome = ? ,telefone = ?, email = ? , cpf = ?, endereco= ?, cep = ? WHERE id = ? ");

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTelefone());
            stmt.setString(3, p.getEmail());
            stmt.setString(4, p.getCpf());
            stmt.setString(5, p.getEndereco());
            stmt.setString(6, p.getCep());
           // stmt.setInt(7, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso no BD!");

        } catch (SQLException ex) {
            // Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar no BD: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(Cliente p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE id = ?");

            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso no BD!");

        } catch (SQLException ex) {
            // Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir no BD: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    /*
        public List<Client> readForDesc(String desc){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Client> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE Empresa LIKE ?");
            stmt.setString(1, "%"+desc+"%");
           rs = stmt.executeQuery();
            
           while (rs.next()){
               
               Client cliente = new Client();
               
               cliente.setId(rs.getInt("ID"));
               cliente.setEmpresa(rs.getString("Empresa"));
               cliente.setColaborador(rs.getString("Colaborador"));
               cliente.setCpf(rs.getInt("Cpf"));
               cliente.setMorador(rs.getString("Morador"));
               cliente.setHora(rs.getString("Hora"));
               
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
    
    
    
    
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    // public void insert(Client cliente){
    //    Banco.cliente.add(cliente);
    // }

    /**
     * Atualiza um Objeto no banco de dados
     *
     * @param cliente
     * @return
     */
    /*
    public boolean update(Client cliente){
        
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if(idSaoIguais(Banco.cliente.get(i),cliente)){
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;      

    }
     */
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     *
     * @param cliente
     * @return
     */
    /*
    public boolean delete(Client cliente){
        for (Client clienteLista : Banco.cliente) {
            if(idSaoIguais(clienteLista,cliente)){
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
     */
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     *
     * @return uma lista com todos os registros do banco
     */
    /*
    public ArrayList<Client> selectAll(){
        return Banco.cliente;
    }
     */
    /**
     * Compara se dois objetos tem a propriedade id igual
     *
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    /*
    private boolean idSaoIguais(Client cliente, Client clienteAComparar) {
        return cliente.getId() ==  clienteAComparar.getId();
    }
    
   
     */
}
