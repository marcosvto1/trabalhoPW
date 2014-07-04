package br.com.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import br.com.conexao.ConnectionFactory;
import br.com.modelo.Contato;

import com.mysql.jdbc.PreparedStatement;

public class contatoDao {
    
 // a conexão com o banco de dados
    private Connection connection;

    public contatoDao() {
      this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Contato contato) {
	    String sql = "insert into contato " +
	            "(nome,email,end,dateNasc)" +
	            " values (?,?,?,?)";

	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

	        // seta os valores

	        stmt.setString(1,contato.getNome());
	        stmt.setString(2,contato.getEmail());
	        stmt.setString(3,contato.getEnd());
	        stmt.setDate(4, new Date(
	                contato.getDataNasc().getTimeInMillis()));

	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}

}
