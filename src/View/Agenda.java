/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author visitante
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agendamento
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
       // start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        txtObs = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jComboBoxService = new javax.swing.JComboBox<>();
        jComboBoxClient = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMainScreen = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbearia Jesse_hds");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalvar.setBackground(new java.awt.Color(204, 102, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 190, -1));

        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora"
            }
        ));
        jScrollPane2.setViewportView(txtTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 670, 220));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        getContentPane().add(txtObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 440, 110));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Observação");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 230, -1));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 230, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 230, -1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 230, -1));

        jComboBoxService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServiceItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxService, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 230, 40));

        jComboBoxClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 230, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hora");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor R$");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Serviço");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("   Agenda");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1010, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shaver-g3c6977007_1280.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 650));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 400, 180));

        jMenuMainScreen.setText("Opções");

        jMenuItemHome.setText("Home");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenuMainScreen.add(jMenuItemHome);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuMainScreen.add(jMenuItemExit);

        jMenuBar1.add(jMenuMainScreen);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jComboBoxServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServiceItemStateChanged
        this.controller.atualizarValor();

     
    }//GEN-LAST:event_jComboBoxServiceItemStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       this.controller.agendar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed
      this.controller.menuHome();
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBoxClient;
    private javax.swing.JComboBox<String> jComboBoxService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenu jMenuMainScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTable txtTable;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void start() {
        this.controller.atualizarDados();
        this.controller.atualizaCliente();
        this.controller.atualizarServico();
        this.controller.atualizarValor();
    }

    public JTable getTxtTable() {
        return txtTable;
    }

    public void setTxtTable(JTable txtTable) {
        this.txtTable = txtTable;
    }

    public JComboBox<String> getjComboBoxClient() {
        return jComboBoxClient;
    }

    public void setjComboBoxClient(JComboBox<String> jComboBoxClient) {
        this.jComboBoxClient = jComboBoxClient;
    }

    public JComboBox<String> getjComboBoxService() {
        return jComboBoxService;
    }

    public void setjComboBoxService(JComboBox<String> jComboBoxService) {
        this.jComboBoxService = jComboBoxService;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextField getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(JTextField txtDate) {
        this.txtDate = txtDate;
    }

    public JTextField getTxtHora() {
        return txtHora;
    }

    public void setTxtHora(JTextField txtHora) {
        this.txtHora = txtHora;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextArea getTxtObs() {
        return txtObs;
    }

    public void setTxtObs(JTextArea txtObs) {
        this.txtObs = txtObs;
    }
    
    
    
    
    
}
