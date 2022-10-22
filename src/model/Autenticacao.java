package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Usuario;

public class Autenticacao {

    Connection conexao;

    public ResultSet autenticacaoUsuario(Usuario usuario) {
        conexao = new Conexao().conectaBD();
        try {
            String sql = "select * from usuarios where nome_usuario= ? and senha_usuario = ?";
            PreparedStatement psm = conexao.prepareStatement(sql);
            psm.setString(1, usuario.getNome_usuario());
            psm.setString(2, usuario.getSenha_usuario());
            
            ResultSet rs = psm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
