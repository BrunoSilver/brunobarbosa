package DAO;

import java.sql.*;

public class ConnectionFactory {
	 private static Connection conexao = null;
	  public static Connection getConexao() {
	      
	      String driver = "com.mysql.jdbc.Driver";
	      String url = "jdbc:mysql://localhost/aula2";
	      String usuario = "alunos";
	      String senha = "alunos";

	      try {
	          Class.forName(driver);
	          conexao = DriverManager.getConnection(url, usuario, senha);
	          System.out.println("--------------------Conexao efetuada com sucesso!--------------------\n");
	      }
	      catch (ClassNotFoundException ex) {
	          System.out.println("Erro ao carregar driver: " + ex.getMessage());
	      }
	      catch (SQLException ex) {
	          System.out.println("Não foi possivel conectar com o Banco de Dados: " 
	                  + ex.getMessage());
	      }
	      return conexao;
	  }
	  
	  public static void closeConexao() {
	      
	      if (conexao != null) {
	          try {
	              conexao.close();
	              System.out.println("conexao encerrada com sucesso.");
	          }catch (SQLException ex) {
	              System.out.println("erro ao fechar conexao: " + ex.getMessage());
	          }
	      }
	      
	      else {
	          System.out.println("conexao não pode ser encerrada pois "
	                  + "não foi iniciada.");
	      }
	  }
	  
}