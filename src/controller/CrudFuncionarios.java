package controller;

import com.mysql.cj.jdbc.*;
import com.mysql.cj.protocol.*;
import java.lang.System.Logger;
//import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Funcionario;

public class CrudFuncionarios {

    private static Connection conex = Conexao.conectaBD();
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Funcionario> lista = new ArrayList<>();

    public void save(Funcionario f) {
        conex = Conexao.conectaBD();
        try {
            ps = conex.prepareStatement("Insert into funcionarios (Nome,Apelido,Sexo,Categoria,Morada,Contacto) values(?,?,?,?,?,?)");
            ps.setString(1, f.getNome());
            ps.setString(2, f.getApelido());
            ps.setString(3, f.getSexo());
            ps.setString(4, f.getCategoria());
            ps.setString(5, f.getMorada());
            ps.setString(6, f.getContacto());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao cadastrar o funcionario" + ex.toString());
        }
    }

    public void update(Funcionario f) {
        conex = Conexao.conectaBD();
        try {
            ps = conex.prepareStatement("Update funcionarios set nome=?,apelido=?,sexo=?,categoria=?,morada=?,contacto=? where id=?");
            ps.setInt(1, f.getId());
            ps.setString(2, f.getNome());
            ps.setString(3, f.getApelido());
            ps.setString(4, f.getSexo());
            ps.setString(5, f.getCategoria());
            ps.setString(6, f.getMorada());
            ps.setString(5, f.getContacto());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CrudFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro ao cadastrar funcionario: " + ex);
        }
    }

    public void saveOrUpdate(Funcionario f) {
        conex = Conexao.conectaBD();
        if (f.getId() == 0) {
            save(f);
        } else {
            update(f);
        }
    }

    public void delete(Funcionario f) {
        conex = Conexao.conectaBD();
        try {
            ps = conex.prepareStatement("delete from funcionarios where id=?");
            ps.setInt(1, f.getId());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CrudFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Funcionario> PesquisaFuncionario(int id) {
        conex = Conexao.conectaBD();
        try {
            ps = conex.prepareStatement("select * from funcionarios WHERE id = ?");
            rs = ps.executeQuery();

            ps.setInt(1, id);

            while (rs.next()) {
                Funcionario fuc = new Funcionario();
                fuc.setId(rs.getInt("id"));
                fuc.setNome(rs.getString("nome"));
                fuc.setApelido(rs.getString("apelido"));
                fuc.setSexo(rs.getString("sexo"));
                fuc.setCategoria(rs.getString("categoria"));
                fuc.setMorada(rs.getString("morada"));
                fuc.setNome(rs.getString("contacto"));
                lista.add(fuc);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao pesquisar: " + erro);
        }
        return lista;
    }

    public ArrayList<Funcionario> read() {
        conex = Conexao.conectaBD();
        ArrayList<Funcionario> func = null;
        
        try {
            ps = conex.prepareStatement("select * from funcionarios");
            rs = ps.executeQuery();//Faz consultas no banco

            while (rs.next()) {

                Funcionario fuc = new Funcionario();

                fuc.setId(rs.getInt(1));
                fuc.setNome(rs.getString(2));
                fuc.setApelido(rs.getString(3));
                fuc.setSexo(rs.getString(4));
                fuc.setCategoria(rs.getString(5));
                fuc.setMorada(rs.getString(6));
                fuc.setContacto(rs.getString(7));
//                func.add(fuc);

            }
            ps.close();
            conex.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return func;
    }
}
