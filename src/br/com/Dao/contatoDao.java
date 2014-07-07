package br.com.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
    
    public List<Contato> getLista() {
	try {	
	List<Contato> contatos = new ArrayList<Contato>();
	PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("select * from contato");
	ResultSet rs= stmt.executeQuery();
	
		while(rs.next()){
		    Contato contato = new Contato();
		    contato.setId(rs.getLong("id"));
		    contato.setNome(rs.getString("nome"));
		    contato.setEmail(rs.getString("email"));
		    contato.setEnd(rs.getString("end"));
		    Calendar data = Calendar.getInstance();
		    data.setTime(rs.getDate("dateNasc"));
		    contato.setDataNasc(data);
		    contatos.add(contato);
	        }
		rs.close();
		stmt.close();
		connection.close();
	     return contatos;
	 } catch (SQLException e) {
	         throw new RuntimeException(e);
	  }
    }
}
