/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import framework.DaoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Joelyson David
 */
public class LoginDAO {

    // cria objetos para conexão
    private Connection conn = null;
    private PreparedStatement stm;
    private ResultSet rs;
    private DaoConexao dao;
    // variaveis
    private static int idCliente = 0;
    private static long idConta = 0;
    private static String nome = null;
    private static String email = null;

    public LoginDAO() {
        dao = new DaoConexao();
        try {
            conn = dao.getConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conexão com banco de dados!", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }

    }

    // método para validar login
    public boolean validaLogin(String email, String senha) throws SQLException{
        int codCli = validaEmail(email);
        // string com comando para select para verificar o login
        String comando = "SELECT * FROM CONTA WHERE ID_CLIENTE = ? AND SENHA = ?";
        // prepara o comando
        stm = conn.prepareStatement(comando);
        // seta os valores que serão informados
        stm.setInt(1, codCli);
        stm.setString(2, senha);
        // executa o comando com result set para trabalhar com retorno de dados do banco
        rs = stm.executeQuery();
        if (rs.next()) {
            idConta = rs.getInt("ID_Conta");
            clienteValido(idConta);
            return true;
        } else {
            return false;
        }
    }
    public int validaEmail(String email) throws SQLException {
        int codCliente = 0;
        String comando = "SELECT * FROM CLIENTES WHERE EMAIL LIKE ?;";
        stm = conn.prepareStatement(comando);
        stm.setString(1, email);
        rs = stm.executeQuery();
        if(rs.next()) {
            setEmail(rs.getString("Email"));
            setIdCliente(rs.getInt("ID_Cliente"));
            codCliente = rs.getInt("ID_Cliente");
        }
        return codCliente;
    }

    // método para retornar dados do cliente dono do login
    public void clienteValido(long conta) throws SQLException {
        String comando = "SELECT * FROM CLIENTES WHERE ID_CLIENTE = (SELECT ID_CLIENTE FROM CONTA WHERE ID_CONTA = ?);";
        stm = conn.prepareStatement(comando);
        stm.setLong(1, conta);
        rs = stm.executeQuery();
        if (rs.next()) {
            setIdCliente(rs.getInt("ID_Cliente"));
            setNome(rs.getString("NomeCliente"));
            setEmail(rs.getString("Email"));
        }
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int idCliente) {
        LoginDAO.idCliente = idCliente;
    }

    public static long getIdConta() {
        return idConta;
    }

    public static void setIdConta(long idConta) {
        LoginDAO.idConta = idConta;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        LoginDAO.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        LoginDAO.email = email;
    }

    
}
