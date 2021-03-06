/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HomeControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joelyson David
 */
public class FRM_Home extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Home
     */
    private HomeControl homeCtrl = new HomeControl(FRM_Home.this);
    private FRM_Login frmLogin = new FRM_Login();

    public FRM_Home() {
        initComponents();
        lblNome.setText(homeCtrl.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnSaldo1 = new javax.swing.JButton();
        btnDepositos = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmHome"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Home", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNome.setBackground(new java.awt.Color(0, 0, 0));
        lblNome.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome do Cliente");
        lblNome.setAlignmentX(0.5F);

        btnSaldo1.setBackground(new java.awt.Color(0, 0, 0));
        btnSaldo1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnSaldo1.setForeground(new java.awt.Color(255, 255, 255));
        btnSaldo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconExtratoSaldo.png"))); // NOI18N
        btnSaldo1.setText("Saldo");
        btnSaldo1.setMaximumSize(new java.awt.Dimension(90, 35));
        btnSaldo1.setMinimumSize(new java.awt.Dimension(90, 35));
        btnSaldo1.setPreferredSize(new java.awt.Dimension(95, 35));
        btnSaldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldo1ActionPerformed(evt);
            }
        });

        btnDepositos.setBackground(new java.awt.Color(0, 0, 0));
        btnDepositos.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnDepositos.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconDeposito.png"))); // NOI18N
        btnDepositos.setText("Depositos");
        btnDepositos.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDepositos.setMinimumSize(new java.awt.Dimension(90, 35));
        btnDepositos.setPreferredSize(new java.awt.Dimension(95, 35));
        btnDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositosActionPerformed(evt);
            }
        });

        btnSaque.setBackground(new java.awt.Color(0, 0, 0));
        btnSaque.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnSaque.setForeground(new java.awt.Color(255, 255, 255));
        btnSaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconSaque.png"))); // NOI18N
        btnSaque.setText("Saque");
        btnSaque.setMaximumSize(new java.awt.Dimension(90, 35));
        btnSaque.setMinimumSize(new java.awt.Dimension(90, 35));
        btnSaque.setPreferredSize(new java.awt.Dimension(95, 35));
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconCancelar.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(90, 35));
        btnSair.setMinimumSize(new java.awt.Dimension(90, 35));
        btnSair.setPreferredSize(new java.awt.Dimension(95, 35));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConfiguracoes.setBackground(new java.awt.Color(0, 0, 0));
        btnConfiguracoes.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnConfiguracoes.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/configIcon.png"))); // NOI18N
        btnConfiguracoes.setText("Configurações");
        btnConfiguracoes.setMaximumSize(new java.awt.Dimension(90, 35));
        btnConfiguracoes.setMinimumSize(new java.awt.Dimension(90, 35));
        btnConfiguracoes.setPreferredSize(new java.awt.Dimension(95, 35));
        btnConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDepositos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnSaque, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnSaldo1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfiguracoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldo1ActionPerformed
        FRM_Saldo frmSaldo = new FRM_Saldo();
        frmSaldo.setVisible(true);
        frmSaldo.setEnabled(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_btnSaldo1ActionPerformed

    private void btnDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositosActionPerformed
         FRM_Deposito frmDeposito = new FRM_Deposito();
        frmDeposito.setVisible(true);
        frmDeposito.setEnabled(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_btnDepositosActionPerformed

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        FRM_Saque frmSaque = new FRM_Saque();
        frmSaque.setVisible(true);
        frmSaque.setEnabled(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == 0) {
            getFrmLogin().setVisible(true);
            getFrmLogin().setEnabled(true);
            getFrmLogin().setChave(' ');
            this.setVisible(false);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
        try {
            FRM_Clientes frmClientes = new FRM_Clientes();
            frmClientes.setVisible(true);
            frmClientes.setEnabled(true);
            frmClientes.getBtnCancelar().setVisible(false);
            frmClientes.getBtnCancelar().setEnabled(false);
            frmClientes.getBtnCadastrar().setEnabled(false);
            frmClientes.getTxtCPF_CNPJ().setEnabled(false);
            frmClientes.getBtnAdicionar().setVisible(false);
            this.setVisible(false);
            this.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

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
                if ("MAC OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnDepositos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaldo1;
    private javax.swing.JButton btnSaque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the homeCtrl
     */
    public HomeControl getHomeCtrl() {
        return homeCtrl;
    }

    /**
     * @param homeCtrl the homeCtrl to set
     */
    public void setHomeCtrl(HomeControl homeCtrl) {
        this.homeCtrl = homeCtrl;
    }

    /**
     * @return the frmLogin
     */
    public FRM_Login getFrmLogin() {
        return frmLogin;
    }

    /**
     * @param frmLogin the frmLogin to set
     */
    public void setFrmLogin(FRM_Login frmLogin) {
        this.frmLogin = frmLogin;
    }

    /**
     * @return the btnDepositos
     */
    public javax.swing.JButton getBtnDepositos() {
        return btnDepositos;
    }

    /**
     * @param btnDepositos the btnDepositos to set
     */
    public void setBtnDepositos(javax.swing.JButton btnDepositos) {
        this.btnDepositos = btnDepositos;
    }

    /**
     * @return the btnSair
     */
    public javax.swing.JButton getBtnSair() {
        return btnSair;
    }

    /**
     * @param btnSair the btnSair to set
     */
    public void setBtnSair(javax.swing.JButton btnSair) {
        this.btnSair = btnSair;
    }

    /**
     * @return the btnSaldo1
     */
    public javax.swing.JButton getBtnSaldo1() {
        return btnSaldo1;
    }

    /**
     * @param btnSaldo1 the btnSaldo1 to set
     */
    public void setBtnSaldo1(javax.swing.JButton btnSaldo1) {
        this.btnSaldo1 = btnSaldo1;
    }

    /**
     * @return the btnSaque
     */
    public javax.swing.JButton getBtnSaque() {
        return btnSaque;
    }

    /**
     * @param btnSaque the btnSaque to set
     */
    public void setBtnSaque(javax.swing.JButton btnSaque) {
        this.btnSaque = btnSaque;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the lblNome
     */
    public javax.swing.JLabel getLblNome() {
        return lblNome;
    }

    /**
     * @param lblNome the lblNome to set
     */
    public void setLblNome(javax.swing.JLabel lblNome) {
        this.lblNome = lblNome;
    }

    
}
