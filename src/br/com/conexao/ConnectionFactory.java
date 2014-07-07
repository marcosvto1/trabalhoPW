package br.com.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {

    public Connection getConnection() {
	try {
	    //Class.forName("com.mysql.jdbc.Driver");  
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());  
	return
	(Connection) DriverManager.getConnection("jdbc:mysql://localhost/contatos", "root", "admin");
	} catch (SQLException e) {
	throw new RuntimeException(e);
	}
    }
}
