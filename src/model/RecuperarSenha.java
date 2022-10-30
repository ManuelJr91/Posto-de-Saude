/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Maloa Jr
 */
public class RecuperarSenha {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/postomedico";
    private static final String password = "";
    private static final String user = "root";
    private static final String conex = "";
    String nome_usuario = null;
    
    public static final Connection recuperSenha(String nome_usuario){ //Metodo publico de conexao
      Connection conex = null;
      
      
      
      try {
          conex = DriverManager.getConnection(url,user,password);
          Statement st =conex.createStatement();
          ResultSet rs = st.executeQuery("Select securityQ from usuarios where username='"+nome_usuario+"");
          if(rs.next()){
              
              
          }
          
          
          return conex;
        
          
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de dados");
          return null;
      }
      
  }   

}
