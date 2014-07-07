package br.com.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.Dao.contatoDao;
import br.com.conexao.ConnectionFactory;
import br.com.modelo.Contato;

public class JDBCInsere {

    public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	
	// Contato contato = new Contato();
	    //  contato.setNome("japao");
	      //contato.setEmail("sdasdto@caelum.com.br");
	     // contato.setEnd("Rua admin");
	     // contato.setDataNasc(Calendar.getInstance());

	    // conectando
         contatoDao contatodao = new contatoDao();
         
         //contatodao.adiciona(contato);
         contatoDao dao = new contatoDao();
    
         List<Contato> contatos = dao.getLista();

         System.out.println("usuario cadastrado com sussesco");
	
         for (Contato contato : contatos) {
             System.out.println("Nome: " + contato.getNome());
             System.out.println("Email: " + contato.getEmail());
             System.out.println("Endereço: " + contato.getEnd());
             System.out.println("Data de Nascimento: " + 
                         contato.getDataNasc().getTime() + "\n");
           }
	
	
    }

}

/*<!--   <% for(Contato contato : contatos ){%>
<tr> <%= contato.getNome()%> </tr>
<tr> <%= contato.getEmail()%></tr>
<tr> sexo </tr>
<tr> d sdasd</tr> 
<%  } %>  -->*/