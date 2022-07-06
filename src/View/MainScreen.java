/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ClientController;
import Controller.MainController;
import View.ClientRegister;



/**
 *
 * @author manoel.carvalho
 */
public class MainScreen extends javax.swing.JFrame {

    private final MainController controller;

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        controller = new MainController(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        menuClient = new javax.swing.JMenu();
        jMenuItemClient = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemAgenda = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbearia Jesse_hds");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 980, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barber-ge9b426e11_1280.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));

        menuClient.setText("Cadastro");
        menuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientActionPerformed(evt);
            }
        });

        jMenuItemClient.setText("CadastroCliente");
        jMenuItemClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientActionPerformed(evt);
            }
        });
        menuClient.add(jMenuItemClient);

        jMenuItem1.setText("Sair");
        menuClient.add(jMenuItem1);

        jMenuBar3.add(menuClient);

        jMenu4.setText("Operação");

        menuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agenda-icon.png"))); // NOI18N
        menuItemAgenda.setText("Agenda");
        menuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgendaActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemAgenda);

        jMenuBar3.add(jMenu4);

        setJMenuBar(jMenuBar3);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgendaActionPerformed
        this.controller.navegarAgenda();
          
        
    }//GEN-LAST:event_menuItemAgendaActionPerformed

    private void menuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientActionPerformed
    
    }//GEN-LAST:event_menuClientActionPerformed

    private void jMenuItemClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientActionPerformed
        controller.navegarClientRegister();
    }//GEN-LAST:event_jMenuItemClientActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemClient;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenuItem menuItemAgenda;
    // End of variables declaration//GEN-END:variables
}