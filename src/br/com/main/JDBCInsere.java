package br.com.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import com.mysql.jdbc.PreparedStatement;

import br.com.Dao.contatoDao;
import br.com.conexao.ConnectionFactory;
import br.com.modelo.Contato;

public class JDBCInsere {

    public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	
	 Contato contato = new Contato();
	      contato.setNome("japao");
	      contato.setEmail("sdasdto@caelum.com.br");
	      contato.setEnd("Rua admin");
	      contato.setDataNasc(Calendar.getInstance());

	    // conectando
         contatoDao contatodao = new contatoDao();
         
         contatodao.adiciona(contato);


         System.out.println("usuario cadastrado com sussesco");
	
	
	
	
    }

}
