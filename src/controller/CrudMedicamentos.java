
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Funcionario;
import model.Medicamentos;


public class CrudMedicamentos {
    
    private static Connection conex = Conexao.conectaBD();
    PreparedStatement ps;
    ResultSet rs;
    ArrayList <Medicamentos> lista = new ArrayList <>();
         
    public void save(Medicamentos med) {
        try {
            ps = conex.prepareStatement("insert into medicamentos (nome,categoria,quantidade,validade) values(?,?,?,?.?)");
            ps.setString(1, med.getNomeMedicamento());
            ps.setString(2, med.getCategoriaMedicamento());
            ps.setInt(3, med.getQuantidade());
            ps.setString(4, med.getValidade());
  
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Medicamento salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }

    public void update(Medicamentos med) {
        try {
            ps = conex.prepareStatement("UPDATE Medicamento set nome=?,categoria=?,quantidade=?,validade=? where id=?");
            ps.setInt(1, med.getId());
            ps.setString(2, med.getNomeMedicamento());
            ps.setString(3, med.getCategoriaMedicamento());
            ps.setInt(4, med.getQuantidade());
            ps.setString(5, med.getValidade());
            ps.execute();
            
            
            JOptionPane.showMessageDialog(null, "Medicamento actualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao registar Medicamento: " + ex);
        }
    }

    public void saveOrUpdate(Medicamentos med) {
        if (med.getId() == 0) {
            save(med);
        } else {
            update(med);
        }
    }

//    public void delete(Funcionario fuc) {
//        try {
//            ps = conex.prepareStatement("DELETE from funcionarios where id=?");
//            ps.setInt(1, fuc.getId());
//            ps.execute();
//            
//            JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,ex.getMessage());
//        }
//    }
//    
//    public ArrayList<Funcionario> PesquisaFuncionario(int id) {
//        conex = Conexao.conectaBD();
//        try {
//            ps = conex.prepareStatement("select * from funcionarios WHERE id = ?");
//            rs = ps.executeQuery();
//
//            ps.setInt(1, id);
//
//            while (rs.next()) {
//                Funcionario fuc = new Funcionario();
//                fuc.setId(rs.getInt("id"));
//                fuc.setNome(rs.getString("nome"));
//                fuc.setNome(rs.getString("sexo"));
//                fuc.setNome(rs.getString("cidade"));
//                fuc.setNome(rs.getString("morada"));
//                fuc.setNome(rs.getString("contacto"));
//                lista.add(fuc);
//            }
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null, "erro ao pesquisar: " + erro);
//        }
//        return lista;
//    }
//
//    public List<Funcionario> read() {
//        conex = Conexao.conectaBD();
//        List<Funcionario> func = new ArrayList<>();
//        try {
//            ps = conex.prepareStatement("select * from funcionarios");
//            rs = ps.executeQuery();//Faz consultas no banco
//
//            while (rs.next()) {
//
//                Funcionario fuc = new Funcionario();
//
//                fuc.setId(rs.getInt("id"));
//                fuc.setNome(rs.getString("nome"));
//                fuc.setApelido(rs.getString("apelido"));
//                fuc.setNome(rs.getString("sexo"));
//                fuc.setNome(rs.getString("cidade"));
//                fuc.setNome(rs.getString("morada"));
//                fuc.setNome(rs.getString("contacto"));
//
//            }
//            ps.close();
//            conex.close();
//            rs.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return func;
//    }
//    
    
}

