package model;

import javax.swing.JOptionPane;
import java.sql.*;

public class Verificacao {
    Conexao conn = new Conexao();
    
    private String sql="Selec * from Usuarios";
    
    public Verificacao(String Username,String Password){
        
    }
    public Boolean Check(){
        try{
        rs = conn.creatStatement().executeQuery(sql);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro"+ex);
        }
        return null;
    }
}
