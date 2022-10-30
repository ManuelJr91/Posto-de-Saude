package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Usuario;

public class CrudUsuario {

    private static Connection conex = Conexao.conectaBD();
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Usuario> lista = new ArrayList<>();

    public void save(Usuario usuario) {
        conex = Conexao.conectaBD();
        try {
            ps = conex.prepareStatement("Insert into usuarios (nome_usuario,nome_apelido,senha_usuario,contacto,email,questao_seguranca,resposta) values(?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getNome_usuario());
            ps.setString(2, usuario.getNome_apelido());
            ps.setString(3, usuario.getSenha_usuario());
            ps.setString(4, usuario.getContacto());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getQuestao_seguranca());
            ps.setString(7, usuario.getResposta());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Usuario registado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao registar usuario" + ex.toString());
        }
    }

}
