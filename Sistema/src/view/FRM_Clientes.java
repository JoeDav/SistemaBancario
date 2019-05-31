package view;

import controller.ClientesControl;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Joelyson David
 */
public class FRM_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Clientes
     */
    private ClientesControl clientesCtrl = new ClientesControl(FRM_Clientes.this);

    public FRM_Clientes() throws SQLException {
        initComponents();
        clientesCtrl.mostrarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCPF_CNPJ = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        panelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        txtProcurar = new javax.swing.JTextField();
        lblProcuraNome = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Novo Cliente");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Endereço: ");

        jLabel4.setText("E-mail: ");

        jLabel5.setText("Telefone: ");

        jLabel6.setText("CPF/CNPJ: ");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDel.setText("Deletar");
        btnDel.setPreferredSize(new java.awt.Dimension(90, 25));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnUpdate.setText("Alterar");
        btnUpdate.setPreferredSize(new java.awt.Dimension(90, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121)))
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCPF_CNPJ))))
                            .addComponent(txtEmail)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Email", "CPF/CNPJ", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setResizable(false);
            tbClientes.getColumnModel().getColumn(1).setResizable(false);
            tbClientes.getColumnModel().getColumn(2).setResizable(false);
            tbClientes.getColumnModel().getColumn(3).setResizable(false);
            tbClientes.getColumnModel().getColumn(4).setResizable(false);
            tbClientes.getColumnModel().getColumn(5).setResizable(false);
        }

        lblProcuraNome.setText("Procura pelo nome contendo:");

        btnProcurar.setText("Procurar");
        btnProcurar.setPreferredSize(new java.awt.Dimension(85, 25));
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTabelaLayout = new javax.swing.GroupLayout(panelTabela);
        panelTabela.setLayout(panelTabelaLayout);
        panelTabelaLayout.setHorizontalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(panelTabelaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProcuraNome)
                            .addGroup(panelTabelaLayout.createSequentialGroup()
                                .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTabelaLayout.setVerticalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProcuraNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (campoVazio() == false) {
            try {

                if (clientesCtrl.verificaCliente() == false) {
                    clientesCtrl.insertCliente();
                    limparCampos();
                } else {

                }

            } catch (SQLException ex) {
                Logger.getLogger(FRM_Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {
            clientesCtrl.deleteCliete();
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            getClientesCtrl().updateCliente();
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Clientes.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcurarActionPerformed

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
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FRM_Clientes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FRM_Clientes.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProcuraNome;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelTabela;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtCPF_CNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProcurar;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnCadastrar
     */
    public javax.swing.JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    /**
     * @param btnCadastrar the btnCadastrar to set
     */
    public void setBtnCadastrar(javax.swing.JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    /**
     * @return the btnCancelar
     */
    public javax.swing.JButton getBtnCancelar() {
        return btnCancelar;
    }

    /**
     * @param btnCancelar the btnCancelar to set
     */
    public void setBtnCancelar(javax.swing.JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the panelNovoCliente
     */
    public javax.swing.JPanel getPanelNovoCliente() {
        return panelCliente;
    }

    /**
     * @param panelNovoCliente the panelNovoCliente to set
     */
    public void setPanelNovoCliente(javax.swing.JPanel panelNovoCliente) {
        this.panelCliente = panelNovoCliente;
    }

    /**
     * @return the txtCPF_CNPJ
     */
    public javax.swing.JTextField getTxtCPF_CNPJ() {
        return txtCPF_CNPJ;
    }

    /**
     * @param txtCPF_CNPJ the txtCPF_CNPJ to set
     */
    public void setTxtCPF_CNPJ(javax.swing.JTextField txtCPF_CNPJ) {
        this.txtCPF_CNPJ = txtCPF_CNPJ;
    }

    /**
     * @return the txtEmail
     */
    public javax.swing.JTextField getTxtEmail() {
        return txtEmail;
    }

    /**
     * @param txtEmail the txtEmail to set
     */
    public void setTxtEmail(javax.swing.JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    /**
     * @return the txtEndereco
     */
    public javax.swing.JTextField getTxtEndereco() {
        return txtEndereco;
    }

    /**
     * @param txtEndereco the txtEndereco to set
     */
    public void setTxtEndereco(javax.swing.JTextField txtEndereco) {
        this.txtEndereco = txtEndereco;
    }

    /**
     * @return the txtNome
     */
    public javax.swing.JTextField getTxtNome() {
        return txtNome;
    }

    /**
     * @param txtNome the txtNome to set
     */
    public void setTxtNome(javax.swing.JTextField txtNome) {
        this.txtNome = txtNome;
    }

    /**
     * @return the txtTelefone
     */
    public javax.swing.JTextField getTxtTelefone() {
        return txtTelefone;
    }

    /**
     * @param txtTelefone the txtTelefone to set
     */
    public void setTxtTelefone(javax.swing.JTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    /**
     * @return the clientesCtrl
     */
    public ClientesControl getClientesCtrl() {
        return clientesCtrl;
    }

    /**
     * @param clientesCtrl the clientesCtrl to set
     */
    public void setClientesCtrl(ClientesControl clientesCtrl) {
        this.clientesCtrl = clientesCtrl;
    }

    /**
     * @return the btnDel
     */
    public javax.swing.JButton getBtnDel() {
        return btnDel;
    }

    /**
     * @param btnDel the btnDel to set
     */
    public void setBtnDel(javax.swing.JButton btnDel) {
        this.btnDel = btnDel;
    }

    /**
     * @return the btnUpdate
     */
    public javax.swing.JButton getBtnUpdate() {
        return btnUpdate;
    }

    /**
     * @param btnUpdate the btnUpdate to set
     */
    public void setBtnUpdate(javax.swing.JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    /**
     * @return the panelTabela
     */
    public javax.swing.JPanel getPanelTabela() {
        return panelTabela;
    }

    /**
     * @param panelTabela the panelTabela to set
     */
    public void setPanelTabela(javax.swing.JPanel panelTabela) {
        this.panelTabela = panelTabela;
    }

    /**
     * @return the tbClientes
     */
    public javax.swing.JTable getTbClientes() {
        return tbClientes;
    }

    /**
     * @param tbClientes the tbClientes to set
     */
    public void setTbClientes(javax.swing.JTable tbClientes) {
        this.tbClientes = tbClientes;
    }

    /**
     * @return the txtProcurar
     */
    public javax.swing.JTextField getTxtProcurar() {
        return txtProcurar;
    }

    /**
     * @param txtProcurar the txtProcurar to set
     */
    public void setTxtProcurar(javax.swing.JTextField txtProcurar) {
        this.txtProcurar = txtProcurar;
    }

    // método para limpar os campos
    public void limparCampos() {
        Component[] componentes = panelCliente.getComponents();
        for (Component comp : componentes) {
            if (comp instanceof JTextField) {
                JTextField txtLimpo = (JTextField) comp;
                txtLimpo.setText("");
            }
        }
    }

    // verifica campos vázios
    public boolean campoVazio() {
        // cria um array com os componentes da nossa janela
        Component[] componentes = panelCliente.getComponents();
        // loop para verificar se o componente é uma instancia de um TextField
        for (Component comp : componentes) {
            if (comp instanceof JTextField) { // caso seja 
                JTextField txtCampo = (JTextField) comp;
                if (txtCampo.getText().equals(null) || txtCampo.getText().equals("")) { // verifica se este campo está vázio ou nulo
                    return true; // e então retorna true caso esteja vazio
                }
            }
        }
        return false;
    }
}
