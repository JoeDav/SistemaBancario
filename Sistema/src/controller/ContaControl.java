package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Conta;
import model.ContaDAO;
import model.Extrato;
import model.LoginDAO;
import view.FRM_Clientes;
import view.FRM_Login;
import view.FRM_Saldo;

/**
 *
 * @author Joelyson David
 */
public class ContaControl {

    private ContaDAO contaDao = new ContaDAO();
    private FRM_Clientes frmCliente;
    private Conta conta;
    LoginDAO loginDao = new LoginDAO();

    public ContaControl(FRM_Clientes frmCliente) {
        this.frmCliente = frmCliente;
    }

    // método insert para inserir conta
    public void insertConta() throws SQLException {
        String novaSenha = frmCliente.getTxtNovaSenha().getText();
        String confirmaSenha = frmCliente.getTxtConfirmaSenha().getText();
        int qtdC = novaSenha.length();
        if (qtdC <= 10) {
            if (!(novaSenha.equals("")) || !(confirmaSenha.equals(""))) {
                if (novaSenha.equals(confirmaSenha)) {
                    // cria um objeto conta com os dados que estão no formulario
                    conta = new Conta(loginDao.getIdCliente(), frmCliente.getTxtNovaSenha().getText());
                    contaDao.insertConta(conta);
                    FRM_Login frmLogin = new FRM_Login();
                    frmLogin.setVisible(true);
                    frmLogin.setEnabled(true);
                    frmCliente.setVisible(false);
                    frmCliente.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Senhas incompativeis!\nTente novamente!", "Alerta!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Os dois campos devem estar preenchidos", "Alerta!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida apenas 10 caracteres permitidos!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }

    }

    // metodo para atualizar senha
    public void updateSenha() throws SQLException {
        long codigo = loginDao.getIdConta();
        String senhaAtual = frmCliente.getTxtSenhaAtual().getText().trim();
        String novaSenha = frmCliente.getTxtNovaSenha().getText().trim();
        String confirmaSenha = frmCliente.getTxtConfirmaSenha().getText().trim();
        if (novaSenha.length() <= 10) {
            if (!(senhaAtual.equals("")) && !(novaSenha.equals("")) && !(confirmaSenha.equals(""))) {
                if (contaDao.validaConta(codigo, senhaAtual) == true) {
                    if ((novaSenha.equals(confirmaSenha))) {
                        int op = JOptionPane.showConfirmDialog(null, "Confirmar alteração da senha?", "Confirma", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (op == 0) {
                            contaDao.updateConta(novaSenha, codigo);
                            frmCliente.getTxtSenhaAtual().setText("");
                            frmCliente.getTxtNovaSenha().setText("");
                            frmCliente.getTxtConfirmaSenha().setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "A nova senha não coincide com a confirmar senha!", "Alerta!", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Senha atual inválida!", "Alerta!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchos!", "Alerta!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida apenas 10 caracteres permitidos!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }

    }
}
