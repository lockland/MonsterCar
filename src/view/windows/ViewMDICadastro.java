/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.windows;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

/**
 *
 * @author sidney
 */
public class ViewMDICadastro extends javax.swing.JFrame {

    ViewCadClientes cadClientes;
    ViewCadDespachante cadDespachante;
    ViewCadFinanceira cadFinanceira;
    ViewCadFuncionario cadFuncionario;
    ViewCadVeiculo cadVeiculo;

    /**
     * Creates new form ViewMDICadastro
     */
    public ViewMDICadastro() {
        initComponents();
        cadClientes = new ViewCadClientes();
        cadDespachante = new ViewCadDespachante();
        cadFinanceira = new ViewCadFinanceira();
        cadFuncionario = new ViewCadFuncionario();
        cadVeiculo = new ViewCadVeiculo();
    }

    @Override
    protected void finalize() throws Throwable {
        cadClientes = null;
        cadDespachante = null;
        cadFinanceira = null;
        cadFuncionario = null;
        cadVeiculo = null;
        System.gc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar = new javax.swing.JToolBar();
        btnCliente = new javax.swing.JButton();
        btnDespachante = new javax.swing.JButton();
        btnFinanceira = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();
        main = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros");
        setExtendedState(MAXIMIZED_BOTH);

        toolbar.setFloatable(false);
        toolbar.setRollover(true);

        btnCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/clientes32.png"))); // NOI18N
        btnCliente.setToolTipText("Clientes");
        btnCliente.setFocusable(false);
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        toolbar.add(btnCliente);

        btnDespachante.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnDespachante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/personal32x32.png"))); // NOI18N
        btnDespachante.setToolTipText("Despachantes");
        btnDespachante.setFocusable(false);
        btnDespachante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDespachante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDespachante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespachanteActionPerformed(evt);
            }
        });
        toolbar.add(btnDespachante);

        btnFinanceira.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnFinanceira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Money-32.png"))); // NOI18N
        btnFinanceira.setToolTipText("Financeiras");
        btnFinanceira.setFocusable(false);
        btnFinanceira.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinanceira.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFinanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiraActionPerformed(evt);
            }
        });
        toolbar.add(btnFinanceira);

        btnFuncionario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/employee_32x32.png"))); // NOI18N
        btnFuncionario.setToolTipText("Funcionários");
        btnFuncionario.setFocusable(false);
        btnFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });
        toolbar.add(btnFuncionario);

        btnVeiculo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/carrinho32x32.png"))); // NOI18N
        btnVeiculo.setToolTipText("Veiculos");
        btnVeiculo.setFocusable(false);
        btnVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });
        toolbar.add(btnVeiculo);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
            .addComponent(main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        addComponentToJDesktopPane(cadClientes);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnDespachanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespachanteActionPerformed
        addComponentToJDesktopPane(cadDespachante);
    }//GEN-LAST:event_btnDespachanteActionPerformed

    private void btnFinanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiraActionPerformed
        addComponentToJDesktopPane(cadFinanceira);
    }//GEN-LAST:event_btnFinanceiraActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        addComponentToJDesktopPane(cadFuncionario);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        addComponentToJDesktopPane(cadVeiculo);
    }//GEN-LAST:event_btnVeiculoActionPerformed

    public void addComponentToJDesktopPane(JInternalFrame internal) {
        if (!internal.isVisible()) {
            internal.setVisible(true);
            main.add(internal);
            try {
                internal.setSelected(true);
            } catch (PropertyVetoException ex) {
            }
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewMDICadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewMDICadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewMDICadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewMDICadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewMDICadastro().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnDespachante;
    private javax.swing.JButton btnFinanceira;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JDesktopPane main;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JToolBar toolbar;
    // End of variables declaration//GEN-END:variables
}
