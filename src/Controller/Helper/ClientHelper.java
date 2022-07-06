/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import ConnectionDB.ConnectionFactory;
import DAO.ClientDAO;
import Model.Client;
import Model.Cliente;
import View.ClientRegister;
import View.MainScreen;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visitante
 */
public final class ClientHelper implements IHelper {

    private final ClientRegister view;
    private final DefaultTableModel modelo = new DefaultTableModel();
    // private  Client model;

    public ClientHelper(ClientRegister view) {
        this.view = view;
        modelTable();
        readTable();
    }

    public boolean authentication() {

        boolean check = false;

        if ("".equals(view.getTxtNome().getText()) || "".equals(view.getTxtTel().getText()) || "".equals(view.getTxtCpf().getText())) {
            JOptionPane.showMessageDialog(null, "OS CAMPOS: NOME, TELEFONE, CPF. PRECISAM SER PREENCHIDOS! ", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            check = true;
        }

        return check;

    }

    @Override
    public Cliente obterModelo() {
        Integer id = Integer.parseInt(view.getTxtID().getText());
        String nome = view.getTxtNome().getText();
        // String data_nascimento = view.getTxtDateNasc().getText();
        String telefone = view.getTxtTel().getText();
        String email = view.getTxtEmail().getText();
        String cpf = view.getTxtCpf().getText();
        String endereco = view.getTxtEnd().getText();
        String cep = view.getTxtCep().getText();

        Cliente cliente = new Cliente(id, nome, telefone, email, cpf, endereco, cep);

        return cliente;

    }

    public void registrationClientDB(Cliente cliente) {
        ClientDAO clientDAO = new ClientDAO();
        clientDAO.create(cliente);

    }

    public void modelTable() {
        modelo.addColumn("id");
        modelo.addColumn("nome");
        modelo.addColumn("telefone");
        modelo.addColumn("email");
        modelo.addColumn("cpf");
        modelo.addColumn("endereço");
        modelo.addColumn("cep");

        view.getTableCadastroClient().setModel(modelo);

    }

    public void readTable() {
        modelo.setNumRows(0);
        modelo.setRowCount(0);
        ClientDAO clientDAO = new ClientDAO();

        for (Cliente c : clientDAO.read()) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getTelefone(),
                c.getEmail(),
                c.getCpf(),
                c.getEndereco(),
                c.getCep()
            });

        }
    }

    @Override
    public void limparTela() {
        view.getTxtID().setText(null);
        view.getTxtNome().setText(null);
        //view.getTxtDateNasc().setText("");
        view.getTxtTel().setText(null);
        view.getTxtEmail().setText(null);
        view.getTxtCpf().setText(null);
        view.getTxtEnd().setText(null);
        view.getTxtCep().setText(null);
    }

    public void telaMenuHome() {
        MainScreen main = new MainScreen();

        main.setVisible(true);
        view.dispose();
    }

    public void upDateClientDB(Cliente cliente) {
        ClientDAO clientDAO = new ClientDAO();
        clientDAO.upDate(cliente);
    }

    /*
    public Cliente tableModel() {
        if( view.getTableCadastroClient().getSelectedRow() != -1 ){ //tableProvider.getSelectedRow() != -1) 
            
           // Cliente p = new Cliente();
           // ProviderDAO dao = new ProviderDAO();
           
          String nome  = view.getTxtNome().getText();
          String  tel = view.getTxtTel().getText();
          String email = view.getTxtEmail().getText();
          String cpf = view.getTxtCpf().getText();
          String end = view.getTxtEnd().getText();
          String cep = view.getTxtCep().getText();
   
         
          //   view.setId((int)tableProvider.getValueAt(tableProvider.getSelectedRow(),0));
       
          //  dao.upDate(p);
          //  limpaCampos();
          //  readTable();
        }
        return cliente;
    }

   

     */
    public void deleteClient() {

        if (view.getTableCadastroClient().getSelectedRow() != -1) {

            Integer id = Integer.parseInt(view.getTxtID().getText());
            String nome = view.getTxtNome().getText();
            String telefone = view.getTxtTel().getText();
            String email = view.getTxtEmail().getText();
            String cpf = view.getTxtCpf().getText();
            String endereco = view.getTxtEnd().getText();
            String cep = view.getTxtCep().getText();

            Cliente c = new Cliente(id, nome, telefone, email, cpf, endereco, cep);
            ClientDAO clientDAO = new ClientDAO();

            int result = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "ATENÇÃO", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (result == JOptionPane.YES_OPTION) {
                c.setId((int) view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 0));

                clientDAO.delete(c);
                limparTela();
                readTable();

            } else {

                limparTela();
                readTable();

                return;

            }

        }

        JOptionPane.showMessageDialog(null, "Selecione a linha com os dados do fornecedor para excluir!");

    }

    public void selectHelper() {

        if (view.getTableCadastroClient().getSelectedRow() != -1) {

            view.getTxtID().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 0).toString());
            view.getTxtNome().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 1).toString());
            view.getTxtTel().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 2).toString());
            view.getTxtEmail().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 3).toString());
            view.getTxtCpf().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 4).toString());
            view.getTxtEnd().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 5).toString());
            view.getTxtCep().setText(view.getTableCadastroClient().getValueAt(view.getTableCadastroClient().getSelectedRow(), 6).toString());
        }
    }

}
