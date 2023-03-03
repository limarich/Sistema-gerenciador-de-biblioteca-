package controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
	private String url;
	private String usuario;	
	private String senha;
	private Connection con;
	
	public ConnectionDB() {
		url = "jdbc:postgresql://localhost:5433/Trabalho- Biblioteca ";
		usuario = "postgres";
		senha = "postgres";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão bem sucedida!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int executaSQL(String sql) {
		try {
			Statement stm = getConnection().createStatement();
			int res = stm.executeUpdate(sql);
			con.close();
			return res;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public Connection getConnection() {
	    return this.con;
	}
	public void closeConnection() {
	    try {
	        getConnection().close();
	        System.out.println("Connection closed");
	    } catch (SQLException e) {
	        System.err.println("Error closing connection : " + e.getMessage());
	    }
	}

}
