
package model;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexao {

  private static final String driver = "com.mysql.cj.jdbc.Driver";
  private static final String url = "jdbc:mysql://localhost:3306/postomedico";
  private static final String password = "";
  private static final String user = "root";
  private static final String conex="";
  public static final Connection conectaBD(){ //Metodo publico de conexao
      Connection conex = null;
      
      try {
          conex = DriverManager.getConnection(url,user,password);
          System.out.println(conex);
          System.out.println("Conectado com sucesso ao banco de dados");
          return conex;
          //          String url = "jdbc:mysql://localhost:3306/postomedico?user=root&password="; //Armazena os drives de conexao,depois da porta colocamos o nome da base de dados
//          conexao = DriverManager.getConnection(url);
          
          
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de dados");
          return null;
      }
      
  }   
//    public static void main(String[] args) {
//        Conexao.conectaBD();
//    }
////  
  
}
